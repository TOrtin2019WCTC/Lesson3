package Lesson3Challenge1;



public class Person implements Weighable {
    private String firstName;
    private String lastName;
    private int age;
    private static final String species = "human";
    private double weight = 0;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public Person(String lastName) {
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
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


    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static String getSpecies() {
        return species;
    }
    @Override
    public String toString(){
        if (getWeight() != 0){
            return String.format("%s %s is a %s that is %d years old, they weigh %.1f pounds.", getFirstName(), getLastName(), getSpecies(), getAge(), getWeight());
        }else{
            return String.format("%s %s is a %s that is %d years old.", getFirstName(), getLastName(), getSpecies(), getAge());
        }

    }

    @Override
    public double addWeight(double pounds) throws NumberFormatException {
        try{
            weight = getWeight() + pounds;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return weight;
    }

    @Override
    public double loseWeight(double pounds) throws NumberFormatException {
        try{
            weight = getWeight() - pounds;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return weight;
    }
}

