package cineapp;

public class Pelicula {
	 private String titulo;
	 private int duracion;
	 private int Edadmin;
	 private Genero genero;
	
 public Pelicula(String titulo, int duracion, int Edadmin, Genero genero){
	this.titulo = titulo;
	this.duracion = duracion;
	this.Edadmin = Edadmin;
	this.genero = genero;
 }

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public int getDuracion() {
	return duracion;
}

public void setDuracion(int duracion) {
	this.duracion = duracion;
}

public int getEdadmin() {
	return Edadmin;
}

public void setEdadmin(int edadmin) {
	Edadmin = edadmin;
}

public Genero getGenero() {
	return genero;
}

public void setGenero(Genero genero) {
	this.genero = genero;
}
 
 
}