package builderpattern;

public class User {

    private String userName; // Required
    private String emailAddress; // Required
    private String firstName; // Optional
    private String lastName;  // Optional
    private int phoneNumber; // Optional
    private String address; // Optional

    public User(String username, String emailAddress) {
        this.userName = username;
        this.emailAddress = emailAddress;
    }

    public User(String username, String emailAddress, String firstName, String lastName) {
        this.userName = username;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", emailAddress=" + emailAddress
                + ", firstName=" + firstName + ", lastName=" + lastName
                + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
    }
}
