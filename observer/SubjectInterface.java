public interface SubjectInterface {
    void registerObserver(ObserverInterface obs);
    void removeObserver(ObserverInterface obs);
    void notifyObservers();
}
