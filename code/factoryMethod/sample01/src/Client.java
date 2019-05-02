public class Client {
    public static void main(String args[]){
        LoggerFactory factory = (LoggerFactory) XMLUtil.getBean();//可引入配置文件实现
        Logger logger = factory.createLogger();
        logger.writeLog();
    }
}
