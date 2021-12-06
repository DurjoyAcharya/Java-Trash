console.log('Line 1');
console.log('Line 2');
// AsynchronousFunction
console.log('Line 3');
console.log('Line 4');

function countDown(number) {
    setTimeout(() => {
        console.log(number);
    }, 2000);
    const newNumber = number - 1;
    if (newNumber > 0) {
        countDown(newNumber);
    }
}
countDown(4);

setInterval(() => {
    // eslint-disable-next-line no-undef
    document.getElementById('demo').innerHTML = new Date().getSeconds();
}, 1000);
