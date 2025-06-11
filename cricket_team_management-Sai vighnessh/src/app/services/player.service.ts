import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from '../model/player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  constructor(private http: HttpClient) {}

  baseURL: string = 'http://localhost:8282/api/players';

  getAll(): Observable<Player[]> {
    return this.http.get<Player[]>(this.baseURL);
  }
 

  insert(body: Player): Observable<Player> {
    console.log(body);
    return this.http.post<Player>(this.baseURL + '/add', body);
  }
  delete(id: number): Observable<void> {
    return this.http.delete<void>(this.baseURL + `/delete/${id}`);
  }

  getById(id: number): Observable<Player> {
    return this.http.get<Player>(this.baseURL + `/${id}`);
  }

  update(id: number, body: Player): Observable<Player> {
    return this.http.put<Player>(this.baseURL + `/update/${id}`, body);
  }

}


