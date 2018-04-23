package I.module2.AbstractClassesAndInterfaces.InterfacesAndSortCompareTo;

public class Human implements Movable ,Comparable{

    private int age;
    private double salary;
    private String firstName;
    private String lastName;


    public Human(int age, double salary, String firstName, String lastName) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void move() {
        System.out.println("Human moves");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Human human = (Human) o;
//        if(this.salary<human.salary)return 1;
//        if(this.salary>human.salary)return -1;
//return 0;
        return this.firstName.compareTo(human.firstName);//сортировка по буквам
    }
}
