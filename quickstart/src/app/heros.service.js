"use strict";
var hero_model_1 = require("./hero.model");
var HEROES = [
    new hero_model_1.Hero('Windstorm', 'Weather mastery'),
    new hero_model_1.Hero('Mr. Nice', 'Killing them with kindness'),
    new hero_model_1.Hero('Magneta', 'Manipulates metalic objects')
];
var HeroService = (function () {
    function HeroService() {
    }
    HeroService.prototype.getAll = function () {
        return HEROES;
    };
    return HeroService;
}());
exports.HeroService = HeroService;
//# sourceMappingURL=heros.service.js.map