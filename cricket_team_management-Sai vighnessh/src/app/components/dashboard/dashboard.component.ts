import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

  data: string = '';

  constructor(private playerService: PlayerService, private router: Router) {}

 find(searchData: any) {
  const value = searchData.form.value.data;
  this.router.navigate(['/search', value]); 
}
}
