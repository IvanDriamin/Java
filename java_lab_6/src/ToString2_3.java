import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

@Validate2_4(value = {ToString2_3.class})
public @interface ToString2_3 {
    enum Value {YES, NO}
    Value value() default Value.YES;
}
