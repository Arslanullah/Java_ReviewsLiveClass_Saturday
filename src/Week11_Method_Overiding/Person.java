package Week11_Method_Overiding;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()|| name==null)
            System.err.println("Name cannot be null or empty");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("invalid age "+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +'\'' ;

    }
    public  void eat(){
        System.out.println( name +"is eating");
    }
    public void sleep(){
        System.out.println(name +  "is sleeping");

    }
    public  void drinking(){
        System.out.println(name + " drinking water");

    }
}
