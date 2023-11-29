package liskovsubprinciple;

public class EnglishTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("taught English");
    }
}
