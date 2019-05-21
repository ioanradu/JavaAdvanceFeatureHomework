package encapsulation;

public class User {
    private String username;
    private String firstName;
    private String lastName;

    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String generateDisplayName() {
        return "Full name of the username " + username + " is: " + firstName + " " + lastName;
    }

    public static void main(String[] args) {
        User user = new User("ioanradu", "Ioan", "Radu");
        System.out.println(user.generateDisplayName());
    }
}
