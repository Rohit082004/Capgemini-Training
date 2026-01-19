public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound();

        Cat c = new Cat();
        c.makeSound();

        Bird b = new Bird();
        b.makeSound();
    }
}

class Animal {
    String name;
    int age;
    public void makeSound() {
        System.out.println("Animals make a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Birds chirp");
    }
}
