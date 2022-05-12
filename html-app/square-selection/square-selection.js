document.addEventListener("DOMContentLoaded", function () {
    console.log('onloadEvent');
    const container = document.getElementsByClassName('box');
    console.log('container: %o', container);

    // foreach loop did not worked, need to debug later
    // container.forEach ((box) => {
    for (let i = 0; i < container.length; i++) {
        console.log('box: %o', container[i]);
        container[i].innerHTML = 'c='+i;

        container[i].addEventListener("mousedown", function (event) {
            console.log('mouse down');
            event.target.style.backgroundColor = 'red';
        });

        container[i].addEventListener("mouseenter", function (event) {
            console.log('mouse enter');

            if (detectLeftButton(event)) {
                if(i<=4) {
                    for (let j = i; j < container.length; j++) {
                        container[j].style.backgroundColor = 'red';
                    }
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


});

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

