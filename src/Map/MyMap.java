package Map;

import java.util.ArrayList;

public class MyMap<T, U> {
    private final ArrayList<T> keys;
    private final ArrayList<U> values;

    public MyMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(T key, U value){
        int i = keys.indexOf(key);
        if (i == -1) {
            values.add(value);
            keys.add(key);
        } else {
            values.set(i, value);
        }
    }

    public U get(T key){
        int i = keys.indexOf(key);
        if (i != -1) {
            return values.get(i);
        }
        return null;
    }

    public U remove(T key) {
        int index = keys.indexOf(key);
        if (index != -1) {
            U removedValue = values.remove(index);
            keys.remove(index);
            return removedValue;
        }
        return null;
    }
}