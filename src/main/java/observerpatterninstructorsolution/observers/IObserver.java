package observerpatterninstructorsolution.observers;

import observerpatterninstructorsolution.domain.Employee;

public interface IObserver {

    void callMe(Employee emp, String msg);
}
