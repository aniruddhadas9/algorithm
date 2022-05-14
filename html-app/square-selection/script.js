document.addEventListener("DOMContentLoaded", function () {
    console.log('onloadEvent');
    const container = document.getElementsByClassName('box');
    const resetButton = document.getElementsByClassName('reset-button');
    const valDiv = document.getElementsByClassName('val');
    console.log('container: %o', container);

    // foreach loop did not worked, need to debug later
    // container.forEach ((box) => {
    for (let i = 0; i < container.length; i++) {
        console.log('box: %o', container[i]);
        // container[i].innerHTML = i;
        container[i].addEventListener("mousedown", function (event) {
            console.log('mouse down');
            event.target.style.backgroundColor = 'red';
        });

        container[i].addEventListener("mouseenter", function (event) {
            console.log('mouse enter');
            // event.

            if (detectLeftButton(event)) {
                if(i <= 4) {
                    let idt = i;
                    let val = [i];
                    for (let j = 0; j < 8; j++) {
                        // container[idt].innerHTML = parseInt(container[idt].innerHTML, 10) + 'w';
                        container[idt].style.backgroundColor = 'red';
                        idt += 5;
                        val.push(idt);
                    }
                    valDiv[0].innerHTML = JSON.stringify(val);
                }
                event.target.style.backgroundColor = 'red';
            }
        });

        container[i].addEventListener("mouseleave", function (event) {
            console.log(event);
            if (detectLeftButton(event)) {
                // event.target.style.backgroundColor = 'white';
            }
        });
    }

    resetButton[0].addEventListener('click', (event) => {
        for (let i = 0; i < container.length; i++) {
            // container[i].innerHTML = parseInt(container[i].innerHTML, 10) + i;
            container[i].style.backgroundColor = 'white';
        }
    });




});

function resetBoxes() {
    const container = document.getElementsByClassName('box');
    for (let i = 0; i < container.length; i++) {
        container[i].style.backgroundColor = 'none';
    }
}



function detectLeftButton(event) {
    if (event.metaKey || event.ctrlKey || event.altKey || event.shiftKey) {
        return false;
    } else if ('buttons' in event) {
        return event.buttons === 1;
    } else if ('which' in event) {
        return event.which === 1;
    } else {
        return (event.button == 1 || event.type == 'click');
    }
}

