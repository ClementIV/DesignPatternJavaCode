/**
 * Hisense TV 工厂类：具体工厂
 */
public class HisenseTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        System.out.println("海信电视机工厂生产海信电视机。");
        return new HisenseTV();
    }

}
