import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Person> People = new ArrayList<>();
        People.add(new Student("Danyar", "Sultanov", 2.80));
        People.add(new Student("Marat", "Karymbaev", 2.20));
        People.add(new Employee("Abdugali", "Kassenov", "Teacher", 5000000));
        People.add(new Employee("Rasul", "Adilbekov","Assiatant" , 400000));
        printData(People);
    }
    public static void printData(Iterable<Person> People){
        for(Person a: People){
            System.out.println(a.getPosition() +":"+ a.getId()+". "+ a.getName() + " "+ a.getSurname() + " earns " + a.getPaymentAmount() + " tenge");
        }
    }
}