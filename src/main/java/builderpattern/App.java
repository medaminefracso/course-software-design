package builderpattern;

public class App {

    public static void main(String[] args) {
        User websiteUser = new User.Builder("bobMax", "bobMax@gmail.com")
                .firstName("bob")
                .lastName("max")
                .phoneNumber(611485201)
                .address("Wall Street Avenue, Trump building, 21st floor")
                .build();

        System.out.println(websiteUser);
    }
}
