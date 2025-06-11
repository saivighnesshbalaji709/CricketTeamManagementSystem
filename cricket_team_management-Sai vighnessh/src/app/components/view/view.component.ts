import { Component, OnInit } from '@angular/core';
import { Player } from 'src/app/model/player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  players: Player[] = [];

  constructor(private playerService: PlayerService) {}

  ngOnInit(): void {
    this.fetchPlayers();
  }

  fetchPlayers(): void {
    this.playerService.getAll().subscribe(data => {
      this.players = data;
    });
  }

  deletePlayer(id: number) {
    if (confirm("Are you sure you want to delete this player?")) {
      this.playerService.delete(id).subscribe({
        next: () => {
          this.players = this.players.filter(p => p.playerID !== id);
          alert('Player deleted successfully!');
        },
        error: (error) => {
          alert('Failed to delete the player. Please try again.');
        }
      });
    }
  }  
 updatePlayer(id: number, data: Player) {
  this.playerService.update(id, data).subscribe(
    (updated) => {
      alert('Player updated successfully!');
    },
    (error) => {
      alert('Update failed!');
    }
  );
}

}

