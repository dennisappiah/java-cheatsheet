package oop.intro;

public class Main {
    public static void main(String[] args){
        var textbox1 = new TextBox();

        textbox1.setText("Hello");
        textbox1.setText("Box2");
        System.out.println(textbox1.text);
        System.out.println(textbox1.text.toUpperCase());
    }
}
