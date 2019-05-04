

/**
 * 客户端测试代码
 *
 */
public class Client {
    public static void main(String[] args){
        //使用抽象层定义
        SkinFactory factory = (SkinFactory)XMLUtil.getBean();
        Button bt = factory.createButton();
        TextField tf = factory.createTextField();
        ComboBox cb = factory.createComboBox();

        //display
        bt.display();
        tf.display();
        cb.display();
    }
}
