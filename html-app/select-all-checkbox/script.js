document.addEventListener("DOMContentLoaded", function () {
    console.log('onloadEvent');
    const container = document.getElementsByClassName('container');
    const selectAll = document.getElementsByClassName('selectAll');
    const selectAllCheckbox = document.getElementById('selectAll');
    const resetButton = document.getElementsByClassName('reset-button');
    const valDiv = document.getElementsByClassName('val');
    console.log('container: %o', container);
    let allSelected = false;
    let selectedCount = 0;
    const numberOfCheckBox = 10;

    // Create all checkbox and add event listen to individual checkboxes
    for(let i=0; i< numberOfCheckBox; i++) {
        const div = document.createElement('div');

        const label = document.createElement('label');
        const textForCheckBoxLabel = document.createTextNode('CheckBox' + i);
        label.appendChild(textForCheckBoxLabel);

        const checkbox = document.createElement('input');
        checkbox.setAttribute('type', 'checkbox');
        checkbox.setAttribute('id', 'check'+i);
        checkbox.addEventListener('change', (event) => {
            if(event.target.checked) {
                selectedCount++;
            } else {
                selectedCount--;
            }
            if (selectedCount >=  numberOfCheckBox) {
                selectAllCheckbox.checked = true;
            } else {
                selectAllCheckbox.checked = false;
            }
        })
        div.appendChild(label);
        div.appendChild(checkbox);
        div.appendChild(document.createElement('br'));

        container[0].appendChild(div);
    }

    // Select all checkbox functionality
    selectAll[0].addEventListener('change', (event) => {
        for(let i=0; i< numberOfCheckBox; i++) {
            const input = document.getElementById('check'+i);
            input.checked = event.target.checked;
        }
        selectedCount = numberOfCheckBox;
    });

    // Reset button functionality
    resetButton[0].addEventListener('click', (event) => {
        for (let i = 0; i < numberOfCheckBox; i++) {
            const input = document.getElementById('check'+i);
            input.checked = false;
        }
        selectAllCheckbox.checked = false;
        selectedCount = 0;
    });




});

