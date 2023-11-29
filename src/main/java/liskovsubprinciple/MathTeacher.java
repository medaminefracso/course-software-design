package liskovsubprinciple;

public class MathTeacher extends Teacher {

    @Override
    public void teach() {
        System.out.println("taught Math");
    }
}
