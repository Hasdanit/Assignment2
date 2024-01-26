public class Employee extends Person {
    private int id;
    private static int id_gen=1;
    private String name;
    private String surname;
    private String position;
    private double salary;
    public Employee(){

        id = id_gen++;
    }
    public Employee(String name, String surname, String position, double salary){
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    public void setName(String name){

        this.name = name;
    }
    public void setSurname(String surname){

        this.surname = surname;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }
    public void setPosition(String position){
        this.position = position;
    }

    public String getName(){

        return surname;
    }
    public String getSurname(){

        return surname;
    }
    public String getPosition(){

        return position;
    }
    public int getId(){

        return id;
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
