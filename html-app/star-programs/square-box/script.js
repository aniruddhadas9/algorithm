document.addEventListener("DOMContentLoaded", function () {
    console.log('onloadEvent');
    const container = document.getElementsByClassName('container');
    const resetButton = document.getElementsByClassName('reset-button');

    const width = 5;
    const height = 5;

    // Create all checkbox and add event listen to individual checkboxes
    for (let i = 0; i < width; i++) {
        const rowDiv = document.createElement('div');
        rowDiv.setAttribute('class', 'row');
        rowDiv.setAttribute('id', 'row' + i);
        for (let j = 0; j < height; j++) {
            const colDiv = document.createElement('div');
            colDiv.setAttribute('class', 'col box');
            colDiv.setAttribute('id', 'col-' + i + '-' + j);

            colDiv.addEventListener('mouseenter', (event) => {
                const id = event.target.id.split('-');
                selectedRow = id[1];
                selectedCol = id[2];
                for (let i = 0; i <= selectedRow; i++) {
                    for (let j = 0; j <= selectedCol; j++) {
                        document.getElementById('col-' + i + '-' + j).setAttribute('class', 'col box highlight');
                    }
                }
            });
            rowDiv.appendChild(colDiv);
        }
        container[0].appendChild(rowDiv);
    }

    // Reset button functionality
    resetButton[0].addEventListener('click', (event) => {
        for (let i = 0; i < width; i++) {
            for (let j = 0; j < height; j++) {
                document.getElementById('col-' + i + '-' + j).setAttribute('class', 'col box');
            }
        }
    });


});

