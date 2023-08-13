import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
slogan:string='your one stop shop for everything as a string interpolation';
getSlogan(){
  return 'this is get slogan func';
}
}
