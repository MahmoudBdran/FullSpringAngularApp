import { Component ,OnInit } from '@angular/core';
import { Employee } from '../employee'
import { EmployeeService } from '../employee.service';

import { Router } from '@angular/router';
@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit{
  employees: Employee[];
  constructor(private router: Router,private employeeService: EmployeeService){
     this.employees=[];
  }
  ngOnInit():void{
    this.getEmployees();
  }
  private getEmployees() {
   this.employeeService.getEmployeesList().subscribe(data =>{
    this.employees=data;
   });
  }

  updateEmployee(id: number){
    this.router.navigate(['update-employee', id]);
  }
}
