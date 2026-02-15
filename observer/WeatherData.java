import java.util.ArrayList;
import java.util.List;

public class WeatherData implements SubjectInterface {
    // create a list to attach observers
    private List<ObserverInterface> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(ObserverInterface obs) {
        this.observers.add(obs);
    }

    public void removeObserver(ObserverInterface obs) {
        int i = this.observers.indexOf(obs);

        if (i >= 0) {
            this.observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0 ; i <= this.observers.size(); i++) {
            ObserverInterface observer = (ObserverInterface) this.observers.get(i);
            observer.update(this.temp, this.humidity, this.pressure);
        }
    }

    
    public void measuermentsChanged() {
        notifyObservers();
    }
    
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measuermentsChanged();
    }
}
