import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';
import {FileUploadModule} from "primeng/fileupload";

import { TaxIrCreateAdminComponent } from './tax-ir-admin/create-admin/tax-ir-create-admin.component';
import { TaxIrEditAdminComponent } from './tax-ir-admin/edit-admin/tax-ir-edit-admin.component';
import { TaxIrViewAdminComponent } from './tax-ir-admin/view-admin/tax-ir-view-admin.component';
import { TaxIrListAdminComponent } from './tax-ir-admin/list-admin/tax-ir-list-admin.component';
import { TauxIrCreateAdminComponent } from './taux-ir-admin/create-admin/taux-ir-create-admin.component';
import { TauxIrEditAdminComponent } from './taux-ir-admin/edit-admin/taux-ir-edit-admin.component';
import { TauxIrViewAdminComponent } from './taux-ir-admin/view-admin/taux-ir-view-admin.component';
import { TauxIrListAdminComponent } from './taux-ir-admin/list-admin/taux-ir-list-admin.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    TaxIrCreateAdminComponent,
    TaxIrListAdminComponent,
    TaxIrViewAdminComponent,
    TaxIrEditAdminComponent,
    TauxIrCreateAdminComponent,
    TauxIrListAdminComponent,
    TauxIrViewAdminComponent,
    TauxIrEditAdminComponent,
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
    PaginatorModule,
    TranslateModule,
    FileUploadModule,
  ],
  exports: [
  TaxIrCreateAdminComponent,
  TaxIrListAdminComponent,
  TaxIrViewAdminComponent,
  TaxIrEditAdminComponent,
  TauxIrCreateAdminComponent,
  TauxIrListAdminComponent,
  TauxIrViewAdminComponent,
  TauxIrEditAdminComponent,
  ],
  entryComponents: [],
})
export class IrAdminModule { }