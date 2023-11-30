package observerpatternmysolution.departments;

public class HRDepartment extends IObserver {

    @Override
    public void callMe() {
        System.out.println("HR Department notified...");
    }
}
