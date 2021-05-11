package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.*;

public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Titanic", 0);
    }

    @Test
    public void getPriceCode() {
        assertEquals(0, movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        assertEquals("Titanic", movie.getTitle());
    }
}