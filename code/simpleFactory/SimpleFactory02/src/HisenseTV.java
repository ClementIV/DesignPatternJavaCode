public class HisenseTV implements TV {
    public HisenseTV(){
        System.out.println("Hisense TV init");
    }
    @Override
    public void play() {
        System.out.println("Hisense TV Play");
    }
}
