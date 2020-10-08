package generics;

class FruitBox<T extends Fruit> extends Box<T> { }

class Juice {
    String name;
    public Juice(String name) {this.name = name + "Juice";}
    public String toString() { return name; }
}

class Juicer {
    public static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";
        for ( Fruit f : box.getList() )
            tmp = tmp + f + " ";

        return new Juice(tmp);
    }
}

public class Ex2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.addItem(new Apple());
        fruitBox.addItem(new Grape());
        appleBox.addItem(new Apple());
        appleBox.addItem(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    } 
}