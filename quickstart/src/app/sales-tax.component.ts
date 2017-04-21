

import { Component, Input } from "@angular/core";

@Component({
    
    selector : "sales-tax",
    templateUrl: "./sales-taxe.component.html"
    
})
export class SalesTaxeComponent{
    
    @Input() amount : number;
    
    isNumber = false;
    
    verify(value : string ){
        this.isNumber = false;
        console.log(this.isNumber);
        if(typeof(value) === 'string'){
            console.log(parseFloat(value));
            
           if( parseFloat(value) ){
               
               this.isNumber = true;
               console.log(this.isNumber);
                    
            }
            else{
                
                this.isNumber = false;
                console.log(this.isNumber);
                
                
 
            }
           
        }
        else
        {
                if(typeof(value) === 'number'){
                    this.isNumber = true;
                    console.log(this.isNumber);
                }   
        }
        console.log(this.isNumber);
        
        
    }
    
}