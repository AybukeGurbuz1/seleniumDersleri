package ZTekrarlar.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W0005_getPageSource {
    public static void main(String[] args) {
        // amazon sitesine gidip kaynak kodlarında "Gateway" yazdığını test edin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https:/www.amazon.com");
        String sayfaKaynakKodlari = driver.getPageSource(); // sayfa kaynağını veriyor
        String arananKelime = "Gateway";
        if (sayfaKaynakKodlari.contains(arananKelime)){
            System.out.println("Kaynak kodu Testi PASSED");
        }else{
            System.out.println("Kaynak kodlarİnda " + arananKelime + " yok, test FAILED");
        }
        driver.close();


    }
}
