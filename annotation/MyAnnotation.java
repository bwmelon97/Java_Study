
package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE, ElementType.TYPE_USE})
public @interface MyAnnotation {}

@MyAnnotation
class Myclass {
    @MyAnnotation int i;

    @MyAnnotation
    Myclass mc;
}