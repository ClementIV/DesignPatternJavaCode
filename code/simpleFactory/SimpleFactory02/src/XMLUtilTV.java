

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtilTV {
    //该方法用于从XML配置文件汇中提取品牌名称，并返回该品牌名称
    public static String getBrandName(){
        try{
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/configTV.xml"));

            //获取包含品牌名称的文本节点
            NodeList n1 = doc.getElementsByTagName("brandName");
            Node classNode = n1.item(0).getFirstChild();
            String brandName = classNode.getNodeValue().trim();

            return brandName;

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return null;
    }
}
