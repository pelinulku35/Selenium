package day02_DriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe") ;

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");
        System.out.println(driver.getPageSource());

        //pagesource 'un MEOW icerdigini test edin

        String pageSources =driver.getPageSource();
        String expentedKelime="MEOW";

        if (pageSources.contains(expentedKelime)) {
            System.out.println("page source testi PASSED");
        }

        else {
            System.out.println("Page source testi FAİLED");
        }




    }
}
