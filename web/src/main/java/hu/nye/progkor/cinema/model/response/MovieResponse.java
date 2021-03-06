package hu.nye.progkor.cinema.model.response;

import hu.nye.progkor.cinema.model.MovieType;

/**
 * Javadoc comment.
 */
public record MovieResponse(Long id, String name, Integer releaseYear, Integer time, MovieType movieType, String description) {
}
