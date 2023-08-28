public class Duck extends Pet {
    public Duck() {
    }

    public Duck(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void move() {
        System.out.println("Утка по кличке "+ super.getName()+ " летит в облаках");
    }
}
