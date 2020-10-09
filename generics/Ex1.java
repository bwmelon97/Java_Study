package generics;

import java.util.ArrayList;

class Fruit                 { 
    String name; int weight;
    Fruit() { this(100); }
    Fruit(int weight) {
        this("Fruit", weight);
    }
    Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString() { return this.name + " (" + this.weight + ")"; } 
}
class Apple extends Fruit   { 
    Apple() { this(100); }
    Apple(int weight) {
        super("Apple", weight);
    }
}
class Grape extends Fruit   { 
    Grape() { this(100); }
    Grape(int weight) {
        super("Grape", weight);
    } 
}
class Toy { public String toString() { return "Toy"; } }

public class Ex1 {
    public static void main( String[] args ) {
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        // Box<Grape> grapeBox = new Box<>();
        Box<Toy> toyBox = new Box<>();

        fruitBox.addItem(new Fruit());
        fruitBox.addItem(new Apple());

        appleBox.addItem(new Apple());
        // appleBox.addItem(new Grape());

        toyBox.addItem(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    public void addItem(T item) { list.add(item); }
    public T getIdxOf(int i) { return list.get(i); }
    public ArrayList<T> getList() { return list; }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}