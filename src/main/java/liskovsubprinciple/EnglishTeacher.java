package liskovsubprinciple;

public class EnglishTeacher extends Teacher {

    @Override
    public void teach() {
        System.out.println("taught English");
    }
}
