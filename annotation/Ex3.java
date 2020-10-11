package annotation;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");

        Object[] array = new Long[10];
        array[0] = 1L;

        int i = 10;
        i += 1;
        System.out.println(i);
    }
}