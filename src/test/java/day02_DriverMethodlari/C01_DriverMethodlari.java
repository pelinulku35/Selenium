package day02_DriverMethodlari;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        // Biz  browser'ları olusturdugumuz driver sayesinde otomate edebiliyoruz
        //Bunun icin her testin basında mutlaka bir driver objesi olusturacagız.

       System.setProperty("webdriver.chrome.driver,","src/drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver() ;

        driver.get("http://www.amazon.com");

        //acılan sayfanın baslıgının amazon icerdigini test edin.

        String expectedKelime= "amazon";

        String actualResult= driver.getTitle();

        if (actualResult.contains(expectedKelime)){
            System.out.println("Title testi PASSED");

        }

        else {
            System.out.println("Title amazon icermiyor,test FAILED");
            System.out.println(driver.getTitle());
        }

        // Gittigimiz sayfanin URL'inin https://www.amazon.com/ oldugunu test edin

        String expectedUrl="https://www.amazon.com/";
         String actualUrl= driver.getCurrentUrl();

         if (expectedUrl.contains(actualUrl)){
             System.out.println("Url testi PASTED");
         }
         else {
             System.out.println("Url testi FAILED");
         }


        Thread.sleep(5000);
        driver.close();





    }
}
