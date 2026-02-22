// reduce return new value in one 

const scores = [40, 32, 80, 95];

const highScore = scores.reduce(getMaxScore);
const avgScore = scores.reduce(getAvg, 0) / scores.length; // divide the score.reduce

// using arrow function
const avgScoreWithArr = scores.reduce( (pre, next) => pre + next, 0) / scores.length;

console.log(`avg score with arrow function ${avgScoreWithArr}`);

// using normal function
const avgScoreWithNorFun = scores.reduce(function(pre, next) {
    return pre + next;
}, 0) / scores.length;

console.log(`avg score with normal function ${avgScoreWithNorFun}`);



function getMaxScore(pre, next) {
    return Math.max(pre, next);
}

function getAvg(pre, next) {
    return pre + next;
}


console.log(highScore);
console.log(avgScore);
