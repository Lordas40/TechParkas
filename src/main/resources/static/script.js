document.addEventListener('DOMContentLoaded', function() {
    loadCars();
    document.getElementById('new-car-form').addEventListener('submit', function(event) {
        event.preventDefault();

        var brand = document.getElementById('brand').value;
        var model = document.getElementById('model').value;
        var registration = document.getElementById('registration').value;
        var fuel = document.getElementById('fuel').value;
        var mileage = document.getElementById('mileage').value;

        fetch('/api/addAutomobilis', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({
                marke: brand,
                modelis: model,
                valstybiniaiNumeriai: registration,
                kuras: fuel,
                rida: parseInt(mileage, 10)
            })
        })
        .then(response => response.json())
        .then(data => console.log('Automobilis pridėtas:', data))
        .catch(error => console.error('Klaida pridedant automobilį:', error));
    });
});
function loadCars() {
    fetch('/api/getAllAutomobiliai')
    .then(response => response.json())
    .then(data => {
        const carsTable = document.getElementById('cars-table').getElementsByTagName('tbody')[0];
        carsTable.innerHTML = ''; // Išvalyti esamą sąrašą prieš pridedant naujus įrašus
        data.forEach(car => {
            let row = carsTable.insertRow();
            let cell1 = row.insertCell(0);
            let cell2 = row.insertCell(1);
            let cell3 = row.insertCell(2);
            let cell4 = row.insertCell(3);
            let cell5 = row.insertCell(4);

            cell1.textContent = car.marke;
            cell2.textContent = car.modelis;
            cell3.textContent = car.valstybiniaiNumeriai;
            cell4.textContent = car.kuras;
            cell5.textContent = car.rida;
        });
    })
    .catch(error => {
        console.error('Klaida gaunant automobilių sąrašą:', error);
    });
}
