"use strict";
var nextId = 1;
var Hero = (function () {
    function Hero(name, power) {
        this.name = name;
        this.power = power;
        this.id = nextId++;
    }
    return Hero;
}());
exports.Hero = Hero;
//# sourceMappingURL=hero.model.js.map