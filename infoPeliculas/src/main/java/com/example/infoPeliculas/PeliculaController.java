package com.example.infoPeliculas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PeliculasController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculasController() {
        // Inicializar la lista con datos
        peliculas.add(new Pelicula(1, "Distrito 9", 2017, "Neill Blomkamp", "Extraterrestre", "Una extraña nave espacial queda detenida encima de la tierra, cuales seran las intenciones de estos seres"));
        peliculas.add(new Pelicula(2, "Pelicula 2", 2010, "Director 2", "Género 2", "Sinopsis 2"));
        peliculas.add(new Pelicula(3, "Pelicula 3", 2018, "Director 3", "Género 3", "Sinopsis 3"));
        peliculas.add(new Pelicula(4, "Pelicula 4", 2022, "Director 4", "Género 4", "Sinopsis 4"));
        peliculas.add(new Pelicula(5, "Pelicula 5", 2023, "Director 5", "Género 5", "Sinopsis 5"));
    }
    
    @GetMapping("/peliculas/{id}")
        public Pelicula getPeliculaById(@PathVariable int id) {
            for (Pelicula pelicula : peliculas) {
                if (pelicula.getId() == id) {
                    return pelicula;
                }
            }
            return null;
        }

        @GetMapping("/peliculas")
        public List<Pelicula> getPeliculas() {
            return peliculas;
        }

}
