package liskovsubprinciple;

public abstract class Teacher {
    public abstract void teach();

    private void makeAnnouncements() {
        System.out.println("made announcements..");
    }

    private void takeAttendence() {
        System.out.println("took attendence..");
    }

    private void collectPaperWork() {
        System.out.println("conducted hallway duties..");
    }

    public void performOtherResponsibilities() {
        makeAnnouncements();
        takeAttendence();
        collectPaperWork();
    }
}
