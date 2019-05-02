/**
 * 客户端类
 */
public class Client {
    public static void main(String[] args){
        try{

            TVFactory factory = (TVFactory)XMLUtil.getBean("Hisnese");
            TV tv = factory.produceTV();
            tv.play();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
