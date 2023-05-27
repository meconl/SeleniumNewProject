package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_ImlicitlyWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       /*
           implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri görünür olana kadar(sayfada oluşana kadar)
         maximum 20 saniye bekler. Eğer webelementler 2 saniyede oluşursa 2 saniye bekler ve alt satıra geçer. Fakat
         belirttiğimiz max. süre boyunca internetten yada sayfadan kaynaklı olarak webelementler oluşmazsa testtimiz
         fail verir.
           Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler. 30 saniye beklemesini belirtirsem
         30 saniye bekler ve alt satıra geçer.
         */
        //techprroed sayfasina gidelim
        driver.get("https://techproeducation.com");

        //amazona gidelim
        driver.get("https://amazon.com");

        //techpro sayfasina geri donelim
        driver.navigate().back();

        //sayfa basligini techpro icerdigini test edelim
        String actualTitle = driver.getTitle();
        String aranankelime = "Techpro";
        if (actualTitle.contains(aranankelime)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILEd" + actualTitle);

        //tekrar amazon sayfasina gidelim
        driver.navigate().forward();

        //sayfa basliginin amazon icerdigin test edelim
        if (driver.getTitle().contains("Amazon")){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED" );
        //sayfayi kapatiniz
        driver.close();

    }
}
