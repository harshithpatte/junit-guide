public class Citizen {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Citizen(String firstName, String LastName, int age) {
        this.firstName = firstName;
        lastName = LastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
