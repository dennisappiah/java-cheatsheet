package oop.intro;

public class TextBox {
    // states or fields or attributes
    public String text = "";

    private static int id = 0;

    //constructor describes the shape of the object

    //empty constructor
    public TextBox() {
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }

}

