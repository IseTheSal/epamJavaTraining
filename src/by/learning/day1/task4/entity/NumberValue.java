package by.learning.day1.task4.entity;

public class NumberValue {

    private int value;

    public NumberValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberValue{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
