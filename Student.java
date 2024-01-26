public class Student extends Person{
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    private double gpa;
    private final String position = "Student";

    public Student(){
        id = id_gen++;
    }
    public Student(String name, String surname, double gpa){
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){

        this.surname = surname;
    }
    public void setGpa(double gpa){

        this.gpa = gpa;
    }
    public String getName(){

        return surname;
    }
    public String getSurname(){

        return surname;
    }
    public double getGpa(){

        return gpa;
    }
    public int getId(){

        return id;
    }

    @Override
    public double getPaymentAmount() {
        if(getGpa() > 2.67) return 36660.0;
        else return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
