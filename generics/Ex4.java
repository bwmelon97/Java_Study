package generics;

public class Ex4 {
    public static void main(String[] args) {
        Box<Integer> iBox = new Box<>();
        Box<Double> dBox = new Box<>();
        iBox.addItem(1);
        dBox.addItem(1.0);
    }
}