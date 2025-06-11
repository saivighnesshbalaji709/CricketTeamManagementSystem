import { Component } from '@angular/core';
import { Player } from 'src/app/model/player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css']
})
export class AddComponent {
  

  constructor(private  playerService:PlayerService){}

  addplayer(data:Player){
    this.playerService.insert(data).subscribe(
      (player)=>{console.log('Added Player is: '+player);
        alert('Player added successfully!');
     }
   );

  }

}
