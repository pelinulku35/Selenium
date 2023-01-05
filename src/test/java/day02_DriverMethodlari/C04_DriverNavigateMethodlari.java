package day02_DriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com/");

        //get ile ayni işlevi yapar.

        Thread.sleep(3000);

        driver.get("https://www.wisequarter.com");

         Thread.sleep(3000);

        // Yeniden amazon'a dönelim.

           driver.navigate().back();

           Thread.sleep(3000);

          //Tekrar wisequarter.com 'a dönelim.
        driver.navigate().forward();




        Thread.sleep(3000);
        driver.quit();













        driver.quit();










    }
}
