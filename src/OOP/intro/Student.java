package OOP.intro;

public class Student {
    // states or fields or attributes
    private String name;
    private   int age;
    protected char sex;
    private static int id = 0;

    //constructor describes the shape of the object

    //empty constructor
    public Student() {
    }

    //full constructor
    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        id++; //increase id by one for every time a student object is created
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters - returns the value of the variable
    public String getName() {
        return name;
    }

    //Setters - sets the value
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "{Student" + name + "is" + age + "}";
    }
}
