import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule }         from '@angular/forms';

import { AppComponent }  from './app.component';
import { HerosComponent } from "./heros.component";
import { HeroService } from "./heros.service";
import { HeroDetailsComponent } from "./hero-details.component";
import { SalesTaxeComponent } from "./sales-tax.component";

@NgModule({
  imports:      [ BrowserModule,
                  FormsModule],
  declarations: [ AppComponent,
                  HerosComponent,
                  HeroDetailsComponent,
                  SalesTaxeComponent],
  providers:[HeroService],
  bootstrap:    [ AppComponent ]
  
})
export class AppModule { }
