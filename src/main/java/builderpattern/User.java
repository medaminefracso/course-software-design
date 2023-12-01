package builderpattern;

public class User {

    private String userName; // Required
    private String emailAddress; // Required
    private String firstName; // Optional
    private String lastName;  // Optional
    private int phoneNumber; // Optional
    private String address; // Optional

    private User(Builder builder) {

    }

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

    public static class Builder {

        private String userName; // Required
        private String emailAddress; // Required
        private String firstName; // Optional
        private String lastName;  // Optional
        private int phoneNumber; // Optional
        private String address; // Optional

        public Builder(String userName, String email) {
            this.userName = userName;
            this.emailAddress = email;
        }

        public Builder firstName(String value) {
            this.firstName = value;
            return this; // return an instance of Builder
        }

        public Builder lastName(String value) {
            this.lastName = value;
            return this; // return an instance of Builder
        }

        public User build() {
            return new User(this);
        }
    }
}
