package day02_DriverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

      System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

         // sayfayi tam ekran yapalimn

        driver.manage().window().maximize();
        System.out.println("maxmize window boyutlari:"+driver.manage().window().getSize());
        System.out.println("maxmize window konum:"+driver.manage().window().getPosition());

        Thread.sleep(3000);

         driver.manage().window().fullscreen();
        System.out.println("fullscreen window boyutlari:"+driver.manage().window().getSize());
        System.out.println("fullscreen window konumu:"+driver.manage().window().getSize());


        Thread.sleep(3000);

        //Browser'ı istedigimiz konum ve boyuta getirelim
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(300,300));


        Thread.sleep(300);
        driver.close();



    }
}
