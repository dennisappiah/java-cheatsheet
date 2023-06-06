package OOP.intro;

public class Main {
    public static void main(String[] args){
      Student student = new Student();
      Student student2 = new Student("John", 2, 'f');

      System.out.println(student2.getName());
      student2.setName("Appiah");
      System.out.println(student2.getName());
    }


}
