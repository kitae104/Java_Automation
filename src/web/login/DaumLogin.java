package web.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/******************************************
 * 파일명 : DaumLogin.java
 * 설명   : 셀레니움을 이용해서 다음에 로그인 하기 
 *          - 
 * @author 김기태
 * @version : 1.0
 * @date  : 2020. 4. 15. 
 ******************************************/
public class DaumLogin {

	//WebDriver
    private WebDriver driver;
    
    // 기본 속성(Properties)
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "./resources/chromedriver.exe";
        
    private String base_url;	//크롤링 할 URL

	private WebElement webElement; // 엘리먼트 
    
    public DaumLogin() {
        super();
 
        // 시스템 속성 설정 
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        
        // 웹 드라이버 설정
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver();
        base_url = "https://www.daum.net/";
    }
	
	public static void main(String[] args) {
		DaumLogin selTest = new DaumLogin();
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
            driver.manage().window().maximize();
            
            // 로그인 버튼 찾아 클릭 --> 필요한 경우 아이디와 클래스이름을 같이 사용 
            webElement = driver.findElement(By.id("inner_login").className("link_login"));       
            webElement.click();
            
            
            driver.findElement(By.id("id")).sendKeys("test");
            driver.findElement(By.id("inputPwd")).sendKeys("test");
            driver.findElement(By.id("loginBtn")).click();
            
            Thread.sleep(10000);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
	}
}
