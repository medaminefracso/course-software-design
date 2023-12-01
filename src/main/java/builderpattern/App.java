package builderpattern;

public class App {

    public static void main(String[] args) {
        User websiteUser = new User.Builder("bobMax", "bobMax@gmail.com").build();
    }
}
