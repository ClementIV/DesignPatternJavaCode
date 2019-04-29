public class TVFactory {
    public static TV produceTV(String type){
        TV tv = null;
        if(type.equalsIgnoreCase("Haier")){
            tv = new HaierTV();
            System.out.println("装备Haier TV");
        }else if(type.equalsIgnoreCase("Hisense")){
            tv = new HisenseTV();
            System.out.println("装备Hisense TV");
        }
        return tv;
    }
}
