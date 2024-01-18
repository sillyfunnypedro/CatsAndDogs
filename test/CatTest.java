import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import animals.Cat;
import animals.Size;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for class Cat.
 */
public class CatTest {

  private Cat mina;
  private Cat archie;

  /**
   * Setup for the unit tests.
   */
  @Before
  public void setUp() {
    //this.mina = new Cat("Mina", 12, 2.5, Size.SMALL, true);
    //this.archie = new Cat("Archie", 5, 8.5, Size.LARGE, false);
  }

  /**
   * Test that an exception is thrown when a negative number is provided for age.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testExceptionForNegativeAge() {
    //new Cat("mina", -12, 10.5, Size.SMALL, true);
  }

  /**
   * Test that an exception is thrown when a negative number is provided for weight.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testExceptionForNegativeWeight() {
    //new Cat("mina", 12, -10.5, Size.SMALL, true);
  }

  /**
   * Test getName().
   */
  @Test
  public void testGetName() {
    //assertEquals("mina", this.mina.getName());
    //assertEquals("Archie", this.archie.getName());
  }

  /**
   * Test getAge().
   */
  @Test
  public void testGetAge() {
    //assertEquals(12, this.mina.getAge());
    //assertEquals(5, this.archie.getAge());
  }

  /**
   * Test getWeight().
   */
  @Test
  public void testGetWeight() {
    //assertEquals(10.5, this.mina.getWeight(), 0.01);
    //assertEquals(13.455, this.archie.getWeight(), 0.01);
  }

  /**
   * Test setWeight().
   */
  @Test
  public void testSetWeight() {
    //assertEquals(10.5, this.mina.getWeight(), 0.01);
    //this.mina.setWeight(11.5);
    //assertEquals(11.5, this.mina.getWeight(), 0.01);

  }

  /**
   * Test getSize().
   */
  @Test
  public void testGetSize() {
    //assertEquals(Size.SMALL, this.mina.getSize());
    //assertEquals(Size.LARGE, this.archie.getSize());
  }

  /**
   * Test isVaccinated().
   */
  @Test
  public void testIsVaccinated() {
    //assertTrue(this.mina.isVaccinated());
    //assertFalse(this.archie.isVaccinated());
  }

  /**
   * test setVaccinated().
   */
  @Test
  public void testSetVaccinated() {
    //assertFalse(this.archie.isVaccinated());
    //this.archie.setVaccinated(true);
    //assertTrue(this.archie.isVaccinated());
  }

  /**
   * Test toString() method.
   */
  @Test
  public void testToString() {
    String ichiroString = "Cat's name: Mina\n" + "Cat's age: 12 years\n"
        + "Cat's weight: 2.50 kg\n" + "Cat's size: Small\n"
        + "Cat is vaccinated";

    String luckyString = "Cat's name: Archie\n" + "Cat's age: 5 years\n"
        + "Cat's weight: 8.50 kg\n" + "Cat's size: Large\n"
        + "Cat is not vaccinated";

    //assertEquals(ichiroString, mina.toString());
    //assertEquals(luckyString, archie.toString());
  }
}