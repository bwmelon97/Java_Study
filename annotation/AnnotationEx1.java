package annotation;

import java.util.ArrayList;

public class AnnotationEx1 {
    // @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        
        nc.oldFeild = 30;
        System.out.println(nc.oldFeild);
        
        @SuppressWarnings({"unchecked", "rawtypes"})
        ArrayList<NewClass> list = new ArrayList();
        list.add(nc);
    }
}

class Parent {
    public void parrentMethod() {}
}

class Child extends Parent {
    @Override
    public void parrentMethod() { }
}

class NewClass {
    public int newFeild;

    @Deprecated
    int oldFeild;
}