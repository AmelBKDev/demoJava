

import { Component, Input } from "@angular/core";
import { Hero } from "./hero.model";

@Component({
    selector : "hero",
    templateUrl:"./hero-details.component.html"
})
export class HeroDetailsComponent {
    
    @Input() hero : Hero;

}