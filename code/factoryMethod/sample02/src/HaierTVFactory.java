/**
 * 海尔电视工厂类：具体工厂
 */
public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("海尔电视工厂生产海尔电视机。");
        return new HaierTV();
    }
}
