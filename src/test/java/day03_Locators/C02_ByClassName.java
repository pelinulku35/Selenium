package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static void main(String[] args) throws InterruptedException {

        // amazon'a gidip nutella icin arama yapın
        //ilk sayfada cıkan urunlerin icerisinde
        //en yuksek fıyatı bulun

        System.setProperty("webdrive.chrome.driver", "src/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https//www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);            Thread.sleep(3000);
        driver.close();



        List<WebElement> fiyatlarListesi = driver.findElements(By.className("a-price-whole"));


        //WebElement bir obje oldugundan direk yazdirilamaz.
        System.out.println(fiyatlarListesi);


        //Bunun icin for-each loop kullanarak her bir WebElement uzerindeki yazilari tek tek yazdirmaliyiz

        for (WebElement each : fiyatlarListesi
        ) {
            System.out.println(each.getText() + " ");
        }

        // En yüksek fiyati bulabilmek için java bilgimizi kullanmalıyız
        //1-web elementlerden getTex ile fiyati String olarak alin
        //2-string fiyati kıyaslama yapabilmek için Integer'a cevirin
        //3-en yüksek fiyati bulup yazdirin

        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat = 0;

        for (WebElement each : fiyatlarListesi
        ) {
            fiyatStr = each.getText();
            fiyatInt = Integer.parseInt(fiyatStr);

            if (fiyatInt > enYuksekFiyat) {
                enYuksekFiyat = fiyatInt;
            }

        }

        System.out.println("En yuksek urun fiyati:"+enYuksekFiyat);

        Thread.sleep(3000);
        driver.close();



    }

}