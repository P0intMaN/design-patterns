public class HeatIndexDisplay implements ObserverInterface, DisplayInterface{
    private float temp;
    private float humidity;
    private float pressure;

    private SubjectInterface weatherdata;

    public HeatIndexDisplay(SubjectInterface weatherdata) {
        this.weatherdata = weatherdata;

        this.weatherdata.registerObserver(this);
    }

    @Override
    public void display() {
        float heatIndex = calculateHeatIndex(this.temp, this.humidity);

        System.out.println("HeatIndex is: " + heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    public float calculateHeatIndex(float temp, float humidity) {
        return (temp*humidity - 16.923f - 8.149761f);
    }
}
