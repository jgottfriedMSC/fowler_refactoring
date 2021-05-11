package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.*;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Justin");
    }

    @Test
    public void getName() {
        assertEquals("Justin", customer.getName());
    }

    @Test
    public void statement() {
        String statement = "main.Rental Record for Justin" + "\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";

        assertEquals(statement, customer.statement());
    }
}