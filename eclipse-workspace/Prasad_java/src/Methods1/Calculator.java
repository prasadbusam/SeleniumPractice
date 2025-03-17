package Methods1;

public class Calculator {

    static class cal {
        int a;
        int b;

        void add() {
            int c = a + b;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        cal c1 = new cal();
        c1.a = 5; // Initialize a with a value
        c1.b = 10; // Initialize b with a value
        c1.add();
    }
}

