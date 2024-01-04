import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDriver {

	public static void main(String[] args) {

        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");
        
        WebElement search_box = driver.findElement(By.id("ybar-sbq"));
        search_box.sendKeys("NPRU");
        
        WebElement btn_search = driver.findElement(By.id("ybar-search"));
        btn_search.click();    
        
        // หน่วงเวลา 3 วินาที (3000 มิลลิวินาที)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.close();

	}

}