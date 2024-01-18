package animals;

/**
 * This is the Dog class. A dog has a name, age, weight, size (small / medium / large), and
 * vaccination status.
 */
public class Dog {

  private final  String name;
  private final int age;
  private  double weight;
  private final  Size size;
  private boolean vaccinated;

  /**
   * Constructor for the class Dog.
   *
   * @param name       the name of the dog.
   * @param age        the age of the dog in years.
   * @param weight     the dog's weight in kg.
   * @param size       the size of the dog (small, medium or large).
   * @param vaccinated vaccination status (true / false)
   * @throws IllegalArgumentException when age or weight are negative.
   */
  public Dog(String name, int age, double weight, Size size, boolean vaccinated)
      throws IllegalArgumentException {
    if (age < 0) {
      throw new IllegalArgumentException("Dog's age cannot be negative");
    }
    if (weight < 0) {
      throw new IllegalArgumentException("Dog's weight cannot be negative");
    }

    this.name = name;
    this.age = age;
    this.weight = weight;
    this.size = size;
    this.vaccinated = vaccinated;
  }

  /**
   * Get the dog's name.
   *
   * @return the dog's name.
   */
  public String getName() {

    return this.name;
  }

  /**
   * Get the dog's age in years.
   *
   * @return the dog's age.
   */
  public int getAge() {

    return this.age;
  }

  /**
   * Get the dog's weight in kilograms.
   *
   * @return The dog's weight in kilograms.
   */
  public double getWeight() {

    return this.weight;
  }

  /**
   * Set the dog's weight in kilograms.
   *
   * @param weight (the dog weight)
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /**
   * Get the dog's size.
   *
   * @return an enum with one of the options for dog size.
   */
  public Size getSize() {
    return this.size;
  }

  /**
   * Get the dog's vaccination status.
   *
   * @return true if the dog is vaccinated; false otherwise.
   */
  public boolean isVaccinated() {
    return this.vaccinated;
  }

  /**
   * set the dog's vaccination status.
   * @param vaccinated the vaccination status.
   */
  public void setVaccinated(boolean vaccinated) {
    this.vaccinated = vaccinated;
  }

  @Override public String toString() {
    String str;
    // the name of the dog.
    str = "Dog's name: " + getName() + "\n";
    // add the age of the dog on the next line
    str = str + String.format("Dog's age: %d years\n", this.getAge());

    // add the weight of the dog on the next line
    str = str + String.format("Dog's weight: %.2f kg\n", this.getWeight());

    // add the size of the dog on the next line
    str = str + "Dog's size: " + this.getSize() + "\n";

    // now add the vaccination status on the last line
    if (this.isVaccinated()) {
      str = str + "Dog is vaccinated";
    } else {
      str = str + "Dog is not vaccinated";
    }
    return str;
  }

}
