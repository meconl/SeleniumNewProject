package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        //techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");//get() methodu ile ayni mantikda calisir
        Thread.sleep(3000);

        //amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //amazon sayfasinin basligini yazdiralim
        System.out.println("Amazon Sayfa Basligi " + driver.getTitle());
        Thread.sleep(3000);

        //techproeducation sayfasina geri donelim
        driver.navigate().back();//boylelikle geri tusuna basmis oluyoruyz
        Thread.sleep(3000);

        //sayfa basligini yazdiralim
        System.out.println("Techpro Sayfa Basligi " + driver.getTitle());
        Thread.sleep(3000);

        //amazon sayfasina tekrar gidip url i yazdiralim
        driver.navigate().forward();//ileri yapmis olduk
        System.out.println("Amazon Sayfasi Url" + driver.getCurrentUrl());
        Thread.sleep(3000);

        //amazon sayfasindakyken sayfayi yenileyelinm
        driver.navigate().refresh();
        Thread.sleep(3000);
        //sayfayi kapatalim
        driver.close();


    }
}
