
import { OnInit , Component } from "@angular/core";
import { Hero } from "./hero.model";
import { HeroService } from "./heros.service";



@Component({
    
    selector : "heros",
    templateUrl : "./heros.component.html",
    providers:[HeroService]
})

export class HerosComponent  implements OnInit {
    
    listOfHeros: Hero[];
    selectedHero : Hero;
    
    constructor( private service : HeroService) {
	
}
    ngOnInit(): void {
        this.getAll();
    }
    
    getAll(){
        this.listOfHeros = this.service.getAll();
    }
    
    selectHero(selection :Hero){
        this.selectedHero = selection;
    }

    
    
}

