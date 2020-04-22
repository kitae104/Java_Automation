import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

	//WebDriver
    private WebDriver driver;
    
    // 기본 속성(Properties)
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "./resources/chromedriver.exe";
        
    private String base_url;	//크롤링 할 URL
    
    public SeleniumTest() {
        super();
 
        // 시스템 속성 설정 
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        
        // 드라이서 설정
        ChromeOptions chromeOptions = new ChromeOptions(); 
        chromeOptions.addArguments("headless");         
        driver = new ChromeDriver(chromeOptions);        
        base_url = "http://cyber.inhatc.ac.kr/";
    }
	
	public static void main(String[] args) {
		SeleniumTest selTest = new SeleniumTest();
        selTest.crawl();
	}
	
	private void crawl() {
		try {
            //get page (= 브라우저에서 url을 주소창에 넣은 후 request 한 것과 같다)
            driver.get(base_url);
            System.out.println(driver.getPageSource());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
	}
}
