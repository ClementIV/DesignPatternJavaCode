/**
 * 具体产品类
 */
public class HaierAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调");
    }
}
