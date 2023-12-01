package observerpatterninstructorsolution.subjects;

import observerpatterninstructorsolution.observers.IObserver;

public interface ISubject {

    void registerObserver(IObserver o);

    void removerObserver(IObserver o);

    void notifyObservers();
}
