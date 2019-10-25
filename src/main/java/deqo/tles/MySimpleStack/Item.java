package deqo.tles.MySimpleStack;

public class Item {
    private Object value;

    Item(Object v) {
        setValue(v);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object v) {
        this.value = v;
    }
}
