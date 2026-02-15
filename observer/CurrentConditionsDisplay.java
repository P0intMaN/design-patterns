public class CurrentConditionsDisplay implements ObserverInterface, DisplayInterface{
    
    private float temp;
    private float humidity;
    private float pressure;
    
    private SubjectInterface weatherData;

    public CurrentConditionsDisplay(SubjectInterface weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("Current Conditions: %sF degress, %s humidity", this.temp, this.humidity));
    }


}
