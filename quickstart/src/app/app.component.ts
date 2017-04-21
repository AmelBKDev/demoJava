import { Component } from '@angular/core';


@Component({
  selector: 'my-app',
  template: '<h1>Hello {{name}}</h1><heros></heros><sales-tax></sales-tax>',
 
})
export class AppComponent  { name = 'Angular'; }
