package chapter2.wrapper;

public class CustomInteger {
    int value;

    CustomInteger(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}
