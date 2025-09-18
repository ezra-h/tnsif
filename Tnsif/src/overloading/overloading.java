package overloading;

class methodoverloading {

    // Method 1 - different parameter type (int, int)
    void display(int a, int b) {
        System.out.println("Method with int, int parameters: " + (a + b));
    }

    // Method 2 - different parameter type (double, double)
    void display(double a, double b) {
        System.out.println("Method with double, double parameters: " + (a + b));
    }

    // Method 3 - different sequence of parameters (int, double)
    void display(int a, double b) {
        System.out.println("Method with int, double parameters: " + (a + b));
    }

    // Method 4 - different sequence of parameters (double, int)
    void display(double a, int b) {
        System.out.println("Method with double, int parameters: " + (a + b));
    }
}
public class overloading {

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();

        obj.display(10, 20);          // calls int, int
        obj.display(5.5, 6.5);        // calls double, double
        obj.display(10, 15.5);        // calls int, double
        obj.display(7.5, 5);          // calls double, int
    }
}
