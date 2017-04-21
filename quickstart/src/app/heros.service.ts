
import { Hero } from "./hero.model";

const HEROES = [
        new Hero('Windstorm', 'Weather mastery'),
        new Hero('Mr. Nice', 'Killing them with kindness'),
        new Hero('Magneta', 'Manipulates metalic objects')
      ];
export class HeroService {
    
    getAll(): Hero[]{
            
            return HEROES;
        
    }
    
    
}