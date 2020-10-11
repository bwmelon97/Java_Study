package annotation;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1", "2", "3");
        MyArrayList<Integer> iList = new MyArrayList<>(1, 2, 3);

        System.out.println(list);
        System.out.println(iList);
    }
}

class MyArrayList<T> {
    T[] arr;

    @SafeVarargs
    @SuppressWarnings("varargs")
    MyArrayList(T... arr){ this.arr = arr; }

    @SafeVarargs
    @SuppressWarnings("varargs")
    public static <T> MyArrayList<T> asList(T... a){
        return new MyArrayList<>(a);
    }

    public T of(int idx) {
        return arr[idx];
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}