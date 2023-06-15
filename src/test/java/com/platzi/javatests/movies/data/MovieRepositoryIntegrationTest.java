package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Genre;
import com.platzi.javatests.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThat;

public class MovieRepositoryIntegrationTest {
    MovieRepositoryJdbc movieRepository;
    DataSource dataSource;

    @Before
    public void setup() throws Exception {
        dataSource = new DriverManagerDataSource("jdbc:h2:mem:test;MODE=MYSQL", "sa", "sa");

        ScriptUtils.executeSqlScript(dataSource.getConnection(), new ClassPathResource("sql-scripts/test-data.sql"));

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        movieRepository = new MovieRepositoryJdbc(jdbcTemplate);
    }

    @Test
    public void load_all_movies() throws SQLException {
        Collection<Movie> movies = movieRepository.findAll();

        assertThat( movies, CoreMatchers.is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER),
                new Movie(3, "Matrix", 136, Genre.ACTION)
        )));
    }



    @Test
    public void load_movie_by_id() {
        Movie movie = movieRepository.findById(2);

        assertThat( movie,CoreMatchers.is(
                new Movie(2, "Memento", 113, Genre.THRILLER)));
    }

    @Test
    public void insert_a_movie() {
        Movie movie = new Movie("Back to the future", 130, Genre.COMEDY);

        movieRepository.saveOrUpdate(movie);

        Movie loadedMovie = movieRepository.findById(4);

        assertThat( loadedMovie,CoreMatchers.is(
                new Movie(4, "Back to the future", 130, Genre.COMEDY)));
    }

    @Test
    public void find_a_movie_by_name() {
        Collection<Movie> movies = movieRepository.findByName("meme");

        assertThat( movies,CoreMatchers.is(Arrays.asList(
                new Movie(2, "Memento", 113, Genre.THRILLER))));
    }

    @Test
    public void find_a_movie_by_director() {
        Collection<Movie> movies = movieRepository.findByDirector("Spielberg");

        assertThat( movies,CoreMatchers.is(Arrays.asList(
                new Movie(1, "Dark Knight", 152, Genre.ACTION),
                new Movie(2, "Memento", 113, Genre.THRILLER))));
    }

    @After
    public void tearDown() throws SQLException {
        final Statement s = dataSource.getConnection().createStatement();
        s.execute("drop all objects delete files");
    }
}