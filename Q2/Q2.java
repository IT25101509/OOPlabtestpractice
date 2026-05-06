class Student{
    protected String Name;
    protected int age;

    public Student(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void DisplayStudentDetails(){
        System.out.println("Student's Name    : " +getName());
        System.out.println("Student's Age    : " +getAge());
    }
}

class Course extends Student{
    protected String courseName;

    public Course(String name, int age, String courseName) {
        super(name, age);
        this.courseName = courseName;
    }

    public void displayCourseDetails(){
        super.DisplayStudentDetails();
        System.out.println("The Course Namr is : " + this.courseName);
    }
}
 class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Alice" ,20,"Java programming");
        Course course2 = new Course("Bob" ,20,"Python programming");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}