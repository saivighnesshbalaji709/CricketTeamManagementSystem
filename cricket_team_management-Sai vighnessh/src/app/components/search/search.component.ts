// search.component.ts
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Player } from 'src/app/model/player';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  searchInput: string = '';
  playerSearchList: Player[] = [];

  constructor(private route: ActivatedRoute, private playerService: PlayerService) {}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      this.searchInput = params['id'];  
      this.find();                      
    });
  }
  find() {
    const id = Number(this.searchInput);
    if (!id) {
      alert('Please enter a valid ID');
      return;
    }
    this.playerService.getById(id).subscribe(
      (player) => {
        this.playerSearchList = player ? [player] : [];
      },
      (error) => {
        console.error('Player not found', error);
        this.playerSearchList = [];
      }
    );
  }
}
