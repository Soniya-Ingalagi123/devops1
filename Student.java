public class Student{
    String name; int age; 


    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void display(Student s) {
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20 );
        display(s1);
    }
}