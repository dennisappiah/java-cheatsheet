package oop.polymorphism;

public class TextBox extends  UIControl{

    public String text = "";

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void render() {
        System.out.println("TextBox render");
    }
}
