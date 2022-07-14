class Multiplier {
    constructor() {
        this.answer = 0;
    }

    multiply(x, y) {
        this.answer = x * y;
    }

    getResult() {
        return this.answer;
    }
}

module.exports = Multiplier;