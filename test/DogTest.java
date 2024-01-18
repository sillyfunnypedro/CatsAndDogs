import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import animals.Dog;
import animals.Size;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for class Dog.
 */
public class DogTest {

  private Dog ichiro;
  private Dog lucky;

  /**
   * Setup for the unit tests.
   */
  @Before
  public void setUp() {
    this.ichiro = new Dog("Ichiro", 12, 10.5, Size.SMALL, true);
    this.lucky = new Dog("Lucky", 5, 13.455, Size.MEDIUM, false);
  }

  /**
   * Test that an exception is thrown when a negative number is provided for age.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testExceptionForNegativeAge() {
    new Dog("Ichiro", -12, 10.5, Size.SMALL, true);
  }

  /**
   * Test that an exception is thrown when a negative number is provided for weight.
   */
  @Test(expected = IllegalArgumentException.class)
  public void testExceptionForNegativeWeight() {
    new Dog("Ichiro", 12, -10.5, Size.SMALL, true);
  }

  /**
   * Test getName().
   */
  @Test
  public void testGetName() {
    assertEquals("Ichiro", this.ichiro.getName());
    assertEquals("Lucky", this.lucky.getName());
  }

  /**
   * Test getAge().
   */
  @Test
  public void testGetAge() {
    assertEquals(12, this.ichiro.getAge());
    assertEquals(5, this.lucky.getAge());
  }

  /**
   * Test getWeight().
   */
  @Test
  public void testGetWeight() {
    assertEquals(10.5, this.ichiro.getWeight(), 0.01);
    assertEquals(13.455, this.lucky.getWeight(), 0.01);
  }

  /**
   * Test setWeight().
   */
  @Test
  public void testSetWeight() {
    assertEquals(10.5, this.ichiro.getWeight(), 0.01);
    this.ichiro.setWeight(11.5);
    assertEquals(11.5, this.ichiro.getWeight(), 0.01);

  }

  /**
   * Test getSize().
   */
  @Test
  public void testGetSize() {
    assertEquals(Size.SMALL, this.ichiro.getSize());
    assertEquals(Size.MEDIUM, this.lucky.getSize());
  }

  /**
   * Test isVaccinated().
   */
  @Test
  public void testIsVaccinated() {
    assertTrue(this.ichiro.isVaccinated());
    assertFalse(this.lucky.isVaccinated());
  }

  /**
   * test setVaccinated().
   */
  @Test
  public void testSetVaccinated() {
    assertFalse(this.lucky.isVaccinated());
    this.lucky.setVaccinated(true);
    assertTrue(this.lucky.isVaccinated());
  }

  /**
   * Test toString() method.
   */
  @Test
  public void testToString() {
    String ichiroString = "Dog's name: Ichiro\n" + "Dog's age: 12 years\n"
        + "Dog's weight: 10.50 kg\n" + "Dog's size: Small\n"
        + "Dog is vaccinated";

    String luckyString = "Dog's name: Lucky\n" + "Dog's age: 5 years\n"
        + "Dog's weight: 13.46 kg\n" + "Dog's size: Medium\n"
        + "Dog is not vaccinated";

    assertEquals(ichiroString, ichiro.toString());
    assertEquals(luckyString, lucky.toString());
  }
}