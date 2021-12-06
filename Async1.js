// eslint-disable-next-line no-unused-vars
function Calculator(num1, num2, callback) {
    if (callback) callback(num1 + num2);
}
Calculator(20, 10, (result) => {
    //    console.log(result);
});
