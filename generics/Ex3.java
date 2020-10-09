package generics;

import java.util.Collections;
import java.util.Comparator;

class FruitComp implements Comparator<Fruit> {
    @Override
    public int compare(Fruit f1, Fruit f2) {
        return f1.weight - f2.weight;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        appleBox.addItem(new Apple(200));
        appleBox.addItem(new Apple(100));
        appleBox.addItem(new Apple(300));

        grapeBox.addItem(new Grape(200));
        grapeBox.addItem(new Grape(400));
        grapeBox.addItem(new Grape(320));

        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());

        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}