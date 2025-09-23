package com.tnsif.finalkeyword;

class finalkeyword {
    final int constantValue = 100;
    final void showMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {
        finalkeyword obj = new finalkeyword();
        System.out.println("Final Variable Value: " + obj.constantValue);
        obj.showMessage();
    }
}
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}
