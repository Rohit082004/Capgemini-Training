public class PersonDetails {
    public static void main(String[] args) {
        Person p1 = new Person("Rohit", 21, "Gurdaspur");
        p1.display();

        Person p2 = new Person(p1);
        p2.display();
    }
}

class Person {
    String name;
    int age;
    String city;

    Person(String n, int a, String c) {
        this.name = n;
        this.age = a;
        this.city = c;
    }

    // copy constructor
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
        this.city = p.city;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("City : " + city);
    }
}
