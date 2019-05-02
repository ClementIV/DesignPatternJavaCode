import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * config文件读取
 */
public class XMLUtil {
    //该方法从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean(String beanName){
        try{
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node  bean=null;
            for(int i=0;i<nl.getLength();i++){
                if(nl.item(i).getParentNode().getNodeName().equals(beanName)){
                    bean = nl.item(i).getFirstChild();break;
                }
            }
            String cName = bean.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
