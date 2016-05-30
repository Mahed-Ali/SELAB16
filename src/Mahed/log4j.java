package Mahed;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class log4j {
	private static Logger logger = Logger.getLogger(log4j.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("hn hn ke a");
        System.out.println("hn hn ke a");
        System.out.println("hn hn ke a");
        System.out.println("hn hn ke a");
        System.out.println("hn hn ke a");
		//DOMConfigurator.configure("log4j.xml");
				PropertyConfigurator.configure("log4j.properties");
				//BasicConfigurator.configure();
				try{
					int i = 0;
					i = i / 0;
				}catch(Exception e){
					logger.error(e.getMessage());
				}
	}

}
