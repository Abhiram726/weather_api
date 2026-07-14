console.log("script loaded");

const body = document.body;

async function getWeather() {

    const city = document.getElementById("city").value;

    if(city.trim()===""){
        return;
    }

    const response = await fetch(`/weather/${city}`);

    if (!response.ok) {
        document.getElementById("result").innerHTML =
            "<h3>City not found</h3>";
        return;
    }

    const data = await response.json();

    document.getElementById("result").innerHTML = `
        <h2>${data.city}</h2>
        <p>🌡 Temperature: ${data.temperature} °C</p>
        <p>💧 Humidity: ${data.humidity}%</p>
        <p>☁️ Conditions: ${data.conditions}</p>
    `;
}

function toggleTheme() {

    body.classList.toggle("dark-mode");

    const button = document.getElementById("themeBtn");

    if (body.classList.contains("dark-mode")) {

        localStorage.setItem("theme", "dark");
        button.innerHTML = "☀️";

    } else {

        localStorage.setItem("theme", "light");
        button.innerHTML = "🌙";

    }
}

window.onload = function () {

    const savedTheme = localStorage.getItem("theme");

    if (savedTheme === "dark") {

        body.classList.add("dark-mode");
        document.getElementById("themeBtn").innerHTML = "☀️";

    }
};