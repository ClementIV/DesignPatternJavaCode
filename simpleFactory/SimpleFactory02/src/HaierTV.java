public class HaierTV implements TV {
    public HaierTV(){
        System.out.println("Haier TV 初始化！");
    }
    @Override
    public void play() {
        System.out.println("Haier TV的使用！");
    }
}
