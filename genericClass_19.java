package practicalJava;

class Pair<U,V> {
    public U first;
    public V second;
    
    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() { return first; }
    public V getSecond() { return second; }
    public void setFirst(U first) { this.first = first; }
    public void setSecond(V second) { this.second = second; }
}


public class genericClass_19 {
    public static void main(String[] args) {
        Pair<Integer,Integer> p = new Pair<Integer,Integer>(1, 2);
        p.setFirst(3);
        p.setSecond(4);
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());
        
    }

}
