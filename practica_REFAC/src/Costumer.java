public class Costumer {
    private String firstName;
    private String lastName;

    public Costumer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

