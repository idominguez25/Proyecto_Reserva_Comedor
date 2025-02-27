import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home/home.component';
import { NavbarComponent } from './home/navbar/navbar.component';
import { LoginComponent } from './Login/login/login.component';
import { RegisterComponent } from './Login/register/register.component';


import { ProductoComponent } from './home/modal/producto/producto.component';
import { Slider1Component } from './home/slider/slider1/slider1.component';
import { Slider2Component } from './home/slider/slider2/slider2.component';
import { Slider3Component } from './home/slider/slider3/slider3.component';
import { Slider4Component } from './home/slider/slider4/slider4.component';
import { Slider5Component } from './home/slider/slider5/slider5.component';
import { AdminComponent } from './Admin/admin/admin.component';
import { FooterComponent } from './home/footer/footer.component';
import { GestionPlatosComponent } from './Admin/gestion-platos/gestion-platos.component';
import { GestionReservasComponent } from './Admin/gestion-reservas/gestion-reservas.component';
import { GestionUsuariosComponent } from './Admin/gestion-usuarios/gestion-usuarios.component';
import { CestoComponent } from './home/modal/cesto/cesto.component';
import { DetallesCuentaComponent } from './home/modal/detalles-cuenta/detalles-cuenta.component';
import { ReservasUsuarioComponent } from './home/modal/reservas-usuario/reservas-usuario.component';
import { NotFoundComponent } from './not-found/not-found.component';






@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    NavbarComponent,
    ProductoComponent,
    Slider1Component,
    Slider2Component,
    Slider3Component,
    Slider4Component,
    Slider5Component,
    AdminComponent,
    FooterComponent,
    GestionPlatosComponent,
    GestionReservasComponent,
    GestionUsuariosComponent,
    CestoComponent,
    DetallesCuentaComponent,
    ReservasUsuarioComponent,
    NotFoundComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
