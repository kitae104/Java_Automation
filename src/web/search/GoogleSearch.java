package web.search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/******************************************
 * 파일명 : LoginTest.java
 * 설명 : 
 * @author 김기태
 * @version : 1.0
 * @date : 2020. 4. 15. 
 ******************************************/
public class GoogleSearch {

	//WebDriver
    private WebDriver driver;
    
    // 기본 속성(Properties)
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "./resources/chromedriver.exe";
        
    private String base_url;	//크롤링 할 URL

	private WebElement webElement; // 엘리먼트 
    
    public GoogleSearch() {
        super();
 
        // 시스템 속성 설정 
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        
        // 웹 드라이버 설정
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver();
        base_url = "https://www.google.co.kr/";
    }
	
	public static void main(String[] args) {
		GoogleSearch selTest = new GoogleSearch();
        selTest.crawl();
	}
	
	/**********************************************
	 * @date : 2020. 4. 15.
	 * 설명 : 실제 크롤링 동작이 이루어지는 부분   
	 **********************************************/
	private void crawl() {
		try {
            //get page (= 브라우저에서 url을 주소창에 넣은 후 request 한 것과 같다)
            driver.get(base_url);
            System.out.println(driver.getPageSource());
            
            // 검색어 입력  
            webElement = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
            String keyword = "투표 현황";
            webElement.sendKeys(keyword);
            
            // 엔터친것과 같은 기능 
            webElement.submit();
            
            Thread.sleep(10000);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
	}
}
