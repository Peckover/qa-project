import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TrainerReflectionComponent } from './trainer-reflection/trainer-reflection.component';
import { CohortSummaryComponent } from './cohort-summary/cohort-summary.component';
import { TraineeReflectionComponent } from './trainee-reflection/trainee-reflection.component';
import { SelfReflectionHistoryComponent } from './self-reflection-history/self-reflection-history.component';
import { CohortTraineesComponent } from './cohort-trainees/cohort-trainees.component';
import {TraineeNewReflectionComponent} from './trainee-new-reflection/trainee-new-reflection.component';

const routes: Routes = [
  {
    path: 'trainee',
    children: [
      {
        path: 'selfreflection', component: TraineeNewReflectionComponent
      },
      {
        path: 'selfreflection/:id', component: TraineeReflectionComponent
      } ,
      {
        path: 'selfreflections', component: SelfReflectionHistoryComponent
      }
    ]
  },
  {
    path: 'trainer',
    children: [
      {
        path: 'cohort/trainees', component: CohortTraineesComponent
      },
      {
        path: 'selfreflection/:id', component: TrainerReflectionComponent
      }
    ]
  },
  {
    path: 'admin',
    children: [
      {
        path: 'cohorts', component: CohortSummaryComponent
      }
    ]
  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
