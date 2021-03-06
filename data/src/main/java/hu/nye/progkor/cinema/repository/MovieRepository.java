package hu.nye.progkor.cinema.repository;

import hu.nye.progkor.cinema.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MovieRepository.
 */
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
