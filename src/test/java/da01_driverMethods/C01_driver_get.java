package da01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        // Sayfayi tam ekran  yapalim.git

        driver.manage().window().maximize();
        System.out.println("maximize window boyutlari"+driver.manage().window().getSize());

        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        System.out.println("fullscreen window boyutlari"+driver.manage().window().getSize());



        Thread.sleep(3000);
        driver.close();
    }
}
