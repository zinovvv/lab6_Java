import java.util.ArrayList;
import java.util.List;

public class ObjectList<T> {
    private List<T> objects;

    public void addObject(T newObject) {
        objects.add(newObject);
    }

    public void displayObjects() {
        for (T obj : objects) {
            obj.toString();
        }
    }
}