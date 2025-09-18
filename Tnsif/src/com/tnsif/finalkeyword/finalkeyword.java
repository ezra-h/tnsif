package com.tnsif.finalkeyword;

class finalkeyword {

    // final variable 
    final int constantValue = 100;

    // final method 
    final void showMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        finalkeyword obj = new finalkeyword();

        // Using final variable
        System.out.println("Final Variable Value: " + obj.constantValue);

        // Calling final method
        obj.showMessage();
    }
}

// Final class (cannot be inherited)
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}
