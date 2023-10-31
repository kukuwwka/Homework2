package SetterGetter;

public class Main {
    public static void main(String[] args) {
    }
    class Value {
        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        private int value = 1512;
    }
}
