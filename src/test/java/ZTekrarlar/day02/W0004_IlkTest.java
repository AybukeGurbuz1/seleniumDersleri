package ZTekrarlar.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W0004_IlkTest {
    public static void main(String[] args) {
        /*
        1- https:/www.amazon.com url ine gidin
        2- Basligin Amazon kelimesi içerdiğini test edin
        3- Url in "https:/www.amazon.com" a eşit olduğubu test edin
        4- sayfayi kapatın
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1- https:/www.amazon.com url ine gidin
        driver.get("https:/www.amazon.com");

        //2- Basligin Amazon kelimesi içerdiğini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Amazon";
        if(actualTitle.contains(arananKelime)){
            System.out.println("Title Testi PASSED");
        }else{
            System.out.println("Title " + arananKelime + "'yi içermiyor, Title Testi FAILED");
        }

        //3- Url in "https:/www.amazon.com" a eşit olduğubu test edin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https:/www.amazon.com";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Url Testi PASSED");
        }else{
            System.out.println("Url beklenen URL ' den farkli, test FAILED");
        }

        //4- sayfayi kapatın
        driver.close();

    }
}
