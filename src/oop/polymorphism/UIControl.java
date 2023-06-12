package oop.polymorphism;

public abstract class UIControl {
    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }

    public void isEnabled() {
        isEnabled = false;
    }

    // abstract method forces any classes that inherit from the parent class to implement this method
    public abstract void render ();
}
