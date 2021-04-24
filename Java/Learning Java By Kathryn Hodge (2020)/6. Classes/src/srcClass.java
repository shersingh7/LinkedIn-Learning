public class srcClass {

    String name;
    int age;
    String gender;

    public srcClass(String iName,  String iGender, int iAge)
    {
        this.name = iName;
        this.age = iAge;
        this.gender = iGender;
    }

    public void info()
    {
        System.out.println("Student Name is " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender);
    }
}
