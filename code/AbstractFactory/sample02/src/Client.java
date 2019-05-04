public class Client {
    public static void main(String[] args){
        try{
            EFactory factory = (EFactory)XMLUtil.getBean();
            Television tv = factory.produceTelevision();
            AirConditioner ac = factory.produceAirConditioner();

            tv.play();
            ac.changeTemperature();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
