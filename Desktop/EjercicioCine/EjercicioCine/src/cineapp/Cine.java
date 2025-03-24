package cineapp;

import java.util.Random;

public class Cine {
 private Pelicula pelicula;
 private float precio;
 private int nespectadores;
 private Espectador tespectadores [][];
 
 public Cine (int filas, int columnas,  Pelicula pelicula,float precio ) {
	 this.pelicula = pelicula;
	 this.precio = precio;
	 this.nespectadores = 0;
	 tespectadores = new Espectador [filas][columnas];
 }
 public String venderAsiento(Espectador esp) {
	 Random rd = new Random();
	 
	 if( precio > esp.getDinero()) {
		 return esp.getNombre()	+"No tiene suficiente dinero" ;
	 }

	 
	 int fila = rd.nextInt(0, tespectadores.length);
	 int columna = rd.nextInt(0,tespectadores.length);
	 
	 while ( tespectadores[fila][columna] != null ) {
		  fila = rd.nextInt(0, tespectadores.length);
		  columna = rd.nextInt(0,tespectadores[0].length);
	 }
	 tespectadores[fila][columna] = esp;
	 String resu = "Fila " + (fila+ "" + 1) + " Asiento "+ ('A' + columna);
	
	 return resu;
 }
}
