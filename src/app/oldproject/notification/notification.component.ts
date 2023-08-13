import { Component } from '@angular/core';

@Component({
  selector: 'app-notification',
  template: `<div class="alert alert-success">
              <p> this website uses cookies to provide better user experience.</p>
              </div>`,
  styles: [".notification-div{margin: 10px 8px; padding: 10px 20px; background-color: #FAD7A0; text-align:center;}"]
})
export class NotificationComponent {

}
