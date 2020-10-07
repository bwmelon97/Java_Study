package generics;

import java.util.ArrayList;

class Fruit                 { public String toString() { return "Fruit"; } }
class Apple extends Fruit   { public String toString() { return "Apple"; } }
class Grape extends Fruit   { public String toString() { return "Grape"; } }
class Toy                   { public String toString() { return "Toy"; } }

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
    private ArrayList<T> itemArr = new ArrayList<>();

    public ArrayList<T> getItemArr() { return itemArr; }
    public void addItem(T item) { itemArr.add(item); }

    @Override
    public String toString() {
        return itemArr.toString();
    }
}