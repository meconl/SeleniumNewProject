package techproed.day01_IlkTest_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //java uygulamalarinda sistem ozelliklerini ayarlamak icin setProperty methodu ile kullaniriz.
        //setProperty methodu ile class imiza web driver in fiziki yolu belirleriz
        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile key degerini girerek value ya ulasabilirim
        WebDriver driver  = new ChromeDriver();
        //chromedriver turunde yeni bir obje olusturduk
        driver.get("https://techproeducation.com");
        //get () merhodu ile string olarak girilen url e gideriz
    }
}
