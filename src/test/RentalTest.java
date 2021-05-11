package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.*;

public class RentalTest {

    private Rental rental;
    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Titanic", 0);
        rental = new Rental(movie, 5);
    }

    @Test
    public void getDaysRented() {
        assertEquals(5, rental.getDaysRented());
    }

    @Test
    public void getMovie() {
        assertEquals(movie, rental.getMovie());
    }
}