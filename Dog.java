public class Dog implements Comparable<Dog> {
    private String name;
    private int age;
    private double weight;

    @Override
    public String toString() {
        return "| name=" + name + ", age=" + age + ", weight=" + weight;
    }

    public Dog() {
        this("Unknown", 0, 0.0);
    }

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

  /*  @Override
    public int compareTo(Dog other) {
        if (age-other.age != 0) return age-other.age;
        return name.compareTo(other.name);
    }


    @Override public int compareTo(Dog other) {
        if(this.weight > other.weight) {
            return 1;
        } else if (this.weight < other.weight) {
            return -1;
        } else
            return 0;
    }

   */

    @Override public int compareTo(Dog other) {
       return this.name.compareTo(other.name);
    }
}