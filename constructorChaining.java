package practicalJava;

class Parent {
    protected int value;

    public Parent() {
        this(0); // Calls the parameterized constructor of Parent with a default value
    }

    public Parent(int value) {
        this.value = value;
    }
}

class Child extends Parent {
    private String name;

    public Child(String name, int value) {
        super(value); // Calls the constructor of Parent
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("value: " + value);
        System.out.println("Child name: " + name);
    }
}

public class constructorChaining {
    public static void main(String[] args) {
        Child child = new Child("Lalit",10);
        child.displayInfo();
    }
}
