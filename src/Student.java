public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student(String firstName, String lastName, int age, int yearLevel) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.yearLevel=yearLevel;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public boolean equals(Student student) {
        return (this.equals(student)); // this refers to the Student object that the method is being invoked upon
    }
    public String toString() {
        return "Student{id="+id+", firstName='"+firstName+"', lastName='"+lastName+"', age="+age+", yearLevel="+yearLevel+"}";
    }
}
