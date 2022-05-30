package ExcerciseComplex4;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Poseidon");
        cat1.greets();
        Dog dog1 = new Dog("Burger KIng");
        dog1.greets();
        BigDog bigDog1 = new BigDog("Godzilla");
        bigDog1.greets();

        // Using Polymorphism
        Animal animal1 = new Cat("Zeus");
        animal1.greets();
        Animal animal2 = new Dog("Wukong");
        animal2.greets();
        Animal animal3 = new BigDog("Cerbero");
        animal3.greets();
        Animal animal4 = new Animal("Pajaro") {
            @Override
            public void greets() {
                System.out.println("Suuuuii");
            }
        };

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;

        dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}
