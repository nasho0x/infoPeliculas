package com.example.infoPeliculas;
 
  public class Pelicula {      
        private int id;
        private String titulo;
        private int a�o;
        private String director;
        private String genero;
        private String sinopsis;

        public Pelicula(int id, String titulo, int a�o, String director, String genero, String sinopsis) {
            this.id = id;
            this.titulo = titulo;
            this.a�o = a�o;
            this.director = director;
            this.genero = genero;
            this.sinopsis = sinopsis;
        }

        // Getters y setters

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getA�o() {
            return a�o;
        }

        public void setA�o(int a�o) {
            this.a�o = a�o;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getSinopsis() {
            return sinopsis;
        }

        public void setSinopsis(String sinopsis) {
            this.sinopsis = sinopsis;
        }
    
}
