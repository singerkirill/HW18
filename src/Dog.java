public class Dog extends Pet {
    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void move() {
        System.out.println("Собака по кличке "+ super.getName()+ " идет по земле");
    }
}
