const scores = [40, 32, 80, 95];

const highScore = scores.reduce(getMaxScore);
const avgScore = scores.reduce(getAvg, 0) / scores.length;


function getMaxScore(pre, next) {
    return Math.max(pre, next);
}

function getAvg(pre, next) {
    return pre + next;
}


console.log(highScore);
console.log(avgScore);
