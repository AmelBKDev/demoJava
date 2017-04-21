"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
var SalesTaxeComponent = (function () {
    function SalesTaxeComponent() {
        this.isNumber = false;
    }
    SalesTaxeComponent.prototype.verify = function (value) {
        this.isNumber = false;
        console.log(this.isNumber);
        if (typeof (value) === 'string') {
            console.log(parseFloat(value));
            if (parseFloat(value)) {
                this.isNumber = true;
                console.log(this.isNumber);
            }
            else {
                this.isNumber = false;
                console.log(this.isNumber);
            }
        }
        else {
            if (typeof (value) === 'number') {
                this.isNumber = true;
                console.log(this.isNumber);
            }
        }
        console.log(this.isNumber);
    };
    return SalesTaxeComponent;
}());
__decorate([
    core_1.Input(),
    __metadata("design:type", Number)
], SalesTaxeComponent.prototype, "amount", void 0);
SalesTaxeComponent = __decorate([
    core_1.Component({
        selector: "sales-tax",
        templateUrl: "./sales-taxe.component.html"
    })
], SalesTaxeComponent);
exports.SalesTaxeComponent = SalesTaxeComponent;
//# sourceMappingURL=sales-tax.component.js.map