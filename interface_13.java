package practicalJava;

interface vehicle{
    public void start();
    public void stop();
}

class car implements vehicle{
    public void start(){
        System.out.println("Car started");
    }
    public void stop(){
        System.out.println("Car stopped");
    }
}

class bike implements vehicle{
    public void start(){
        System.out.println("Bike started");
    }
    public void stop(){
        System.out.println("Bike stopped");
    }
}

public class interface_13 {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.stop();
        bike b = new bike();
        b.start();
        b.stop();
    }
}
