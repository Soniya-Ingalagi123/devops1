 public class Student{
    String name; 


    Student(String name) {
        this.name = name;
        
    }

    static void display(Student s) {
        System.out.println("Name: " + s.name);
        
        
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice" );
        display(s1);
    }
}