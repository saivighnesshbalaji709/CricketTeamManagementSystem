import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './components/dashboard/dashboard.component';
import { ViewComponent } from './components/view/view.component';
import { SearchComponent } from './components/search/search.component';
import { AddComponent } from './components/add/add.component'; 

const routes: Routes = [
  { path: '', component: DashboardComponent }, 
  { path: 'view', component: ViewComponent },
  { path: 'search/:id', component: SearchComponent },
  { path: 'add', component: AddComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
