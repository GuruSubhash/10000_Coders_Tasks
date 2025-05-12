import java.util.function.Function;
public class SensorData {
    private double temparature;
    private double humidity;
    public double getTemparature() {
        return temparature;
    }
    public void setTemparature(double temparature) {
        this.temparature = temparature;
    }
    public double getHumidity() {
        return humidity;
    }
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
    public SensorData(double temparature, double humidity) {
        this.temparature = temparature;
        this.humidity = humidity;
    }
    public static void main(String[] args) {
        SensorData sd= new SensorData(10.0, 19.0);
        Function<SensorData,Boolean> fi= new Function<SensorData,Boolean>() {
            public Boolean apply(SensorData s){
                return s.getTemparature()>25.00;
            }
        };
        double threshold=sd.temparature;
        System.out.println(threshold);
        System.out.println((fi.apply(sd)) ? "More temparature": "noraml temparature");
        
    }
    
}