package day02_DriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //implicitly wait gittigimiz sayfa acilincaya kadar veya  aradıgımız webelement bulununcaya kadar
        //driver'ın bekleyebilecegi max süreyi belirler.

        // bu dörtlü her test methodunun basına yazılacak.




    }
}
