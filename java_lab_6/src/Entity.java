import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Entity {

    @Override
    public String toString() {
        try {
            return toStringImpl(this);
        } catch (IllegalAccessException e) {
            return "Error while generating string representation: " + e.getMessage();
        }
    }

    private String toStringImpl(Object obj) throws IllegalAccessException {
        Class<?> c = obj.getClass();
        Map<String, Object> fieldsMap = new HashMap<>();

        boolean classToStringNo = c.isAnnotationPresent(ToString2_3.class) && c.getAnnotation(ToString2_3.class).value() == ToString2_3.Value.NO;

        while (c != null && c != Object.class) { // Рекурсивный проход по родительским классам.
            for (Field i : c.getDeclaredFields()) {
                if(classToStringNo){
                    if(i.isAnnotationPresent(ToString2_3.class) && i.getAnnotation(ToString2_3.class).value() == ToString2_3.Value.YES){
                        fieldsMap.put(i.getName(), i.get(obj));
                    }
                } else {
                    if(!i.isAnnotationPresent(ToString2_3.class) || i.getAnnotation(ToString2_3.class).value() == ToString2_3.Value.YES){
                        fieldsMap.put(i.getName(), i.get(obj));
                    }
                }
            }
            c = c.getSuperclass();
        }

        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<String, Object> i : fieldsMap.entrySet()) {
            sb.append(i.getKey()).append(": ").append(i.getValue()).append(", ");
        }
        if (sb.length() > 1) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append("}");
        return sb.toString();
    }
}
