/** const paymanetstatus = false;
const marks = 90;
function Enroll(callback) {
    document.getElementById('demo').innerHTML = 'Course Enrollment is in Progress';
    setTimeout(() => {
        if (paymanetstatus) {
            callback();
        } else {
            // document.getElementById('demo').innerHTML = 'Payment Failed';
            alert('Payment Failed');
        }
    }, 2000);
}

function progress(callback) {
    document.getElementById('demo').innerHTML = 'Course on progress';
    setTimeout(() => {
        if (marks >= 80) callback();
        else document.getElementById('demo').innerHTML = 'could not get enough marks';
    }, 5000);
}
function getCertificate() {
    document.getElementById('demo').innerHTML = 'Preparing your Certificate...';
    setTimeout(() => {
        document.getElementById('demo').innerHTML = 'Congratrulations';
    }, 1000);
}
Enroll(() => {
    progress(getCertificate);
});
*/
const PaymentStatus = true;
const marks = 70;
function Admission(callback) {
    console.log('Admission Is Going On....');
    if (PaymentStatus) {
        setTimeout(() => {
            console.log('Payment Step Done');
            callback();
        }, 1000);
    } else {
        console.log('Payment Failed....');
    }
}
function Process(callback) {
    if (marks >= 80) {
        setTimeout(() => {
            callback();
        }, 5000);
    } else console.log('Your Are Failed....');
}
function OutCome() {
    setTimeout(() => {
        console.log('Congratess....');
    }, 1000);
}
Admission(() => {
    Process(OutCome);
});
