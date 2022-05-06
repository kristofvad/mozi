package hu.nye.progkor.cinema.model.dto;

import hu.nye.progkor.cinema.model.MovieType;

public record MovieDTO(Long id, String name, Integer releaseYear, Integer time, MovieType movieType, String description) {
}
