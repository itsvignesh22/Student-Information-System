public class Student {
    private String name;
    private int age;
    private double grade;
    private String contact;



    public Student(String name, int age, double grade, String contact){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.contact = contact;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public double getGrade() {
        return grade;
    }

    public String getContact() {
        return contact;
    }

    public void displayStudent() {
        System.out.println("Name    : "+ name);
        System.out.println("Age     : "+ age);
        System.out.println("Grade   : "+ grade);
        System.out.println("Contact : "+ contact);
        System.out.println("--------------------------------");
    }
}