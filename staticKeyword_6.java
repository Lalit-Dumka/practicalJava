package practicalJava;

class A{
    private static int count=0;

    public A(){
        count++;
    }

    public static void getCount(){
        System.out.println("Number of objects created: " + count);
    }
}

public class staticKeyword_6 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A.getCount();

        
    }
}
