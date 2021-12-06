const paymentSuccess = true;
const marks = 90;
function enroll() {
    console.log('Course enrollment is in progress...');
    const promise = new Promise((resolve, reject) => {
        setTimeout(() => {
            if (paymentSuccess) {
                resolve();
            } else {
                // eslint-disable-next-line prefer-promise-reject-errors
                reject('Payment failure....');
            }
        }, 1000);
    });
    return promise;
}
function Progress() {
    console.log('Course On Progress...');
    const promise = new Promise((resolve, reject) => {
        setTimeout(() => {
            if (marks >= 80) {
                resolve();
            } else {
                // eslint-disable-next-line prefer-promise-reject-errors
                reject(`Your Marks is: ${marks} Minimum 80 is required`);
            }
        }, 4000);
    });
    return promise;
}
function getCertificate() {
    console.log('Preparing your Certificate...');
    const promise = new Promise((resolve) => {
        setTimeout(() => {
            resolve('Job Done Congrats...');
        }, 2000);
    });
    return promise;
}
async function Course() {
    try {
        await enroll();
        await Progress();
        const msg = await getCertificate();
        console.log(msg);
    } catch (err) {
        console.log(err);
    }
}
Course();
