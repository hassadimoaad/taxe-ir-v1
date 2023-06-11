
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { TaxIrListAdminComponent } from './tax-ir-admin/list-admin/tax-ir-list-admin.component';
import { TauxIrListAdminComponent } from './taux-ir-admin/list-admin/taux-ir-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'tax-ir',
                            children: [
                                {
                                    path: 'list',
                                    component: TaxIrListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'taux-ir',
                            children: [
                                {
                                    path: 'list',
                                    component: TauxIrListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class IrAdminRoutingModule { }
