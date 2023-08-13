import { Component } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {
  products=[
    {id:1,name:"minimalists analog watch",price:"107",color:"red"},
    {id:2,name:" analog watch",price:"106",color:"green"},
    {id:3,name:"minimalists  watch",price:"105",color:"red"},
    {id:4,name:"minimalists analog ",price:"104",color:"white"}
  ];
}
