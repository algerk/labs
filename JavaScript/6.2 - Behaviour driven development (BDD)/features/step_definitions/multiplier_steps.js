const { Given, When, Then } = require('cucumber');
const { should, expect } = require('chai');
const Multiplier = require('../../multiplier');

let myMult;

Given('a multiplier', function () {
    myMult = new Multiplier();
});

When('I multiply {int} and {int}', function (num1, num2) {
    myMult.multiply(num1, num2);
});

Then('the outcome will be {int}', function (expected) {
    const actual = myMult.getResult();
    expect(actual).to.be.equal(expected);
});