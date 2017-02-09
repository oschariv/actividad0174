

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class test0175.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test0175
{
    private Persona persona1;
    private Comida comida1;
    private Comida comida2;
    private Comida comida3;

    /**
     * Default constructor for test class test0175
     */
    public test0175()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        persona1 = new Persona("oscar", true, 88, 185, 24);
        comida1 = new Comida("fabada", 500);
        comida2 = new Comida("pescado", 250);
        comida3 = new Comida("garbanzos", 500);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

}

