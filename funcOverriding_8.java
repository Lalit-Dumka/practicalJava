package practicalJava;

class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    @Override
    public void show(){
        System.out.println("In B");
    }
}

public class funcOverriding_8 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        B obj2 = new B();
        obj2.show();
    }
}
