public class RestaurantManagement {
    public static void main(String[] args) {

        Person chef = new Chef("Rohit", 101);
        Person waiter = new Waiter("Rubez", 102);

        chef.displayDetails();
        ((Worker) chef).performDuties();
        System.out.println();

        waiter.displayDetails();
        ((Worker) waiter).performDuties();
    }
}

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println("Chef is preparing and cooking food.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    @Override
    public void performDuties() {
        System.out.println("Waiter is serving food to customers.");
    }
}



