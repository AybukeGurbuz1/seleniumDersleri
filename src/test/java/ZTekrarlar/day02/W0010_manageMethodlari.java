package ZTekrarlar.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class W0010_manageMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

        /*
        Ilerde wait konusunu daha geniş olarak ele alacağız
        Bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere göre
        bir yüklenme süresine ihtiyaç vardır
        ve ya bir web elementinini kullanılabilmesi için zamana ihtyç olabilir
        implicityWait bize sayfanın yüklenmesi ve sayfada ki elementlere ulaşım için beklenecek
        MAXIMUM sureyi belirleme olanağı tanır
         */

        driver.close();
        driver.quit(); // açık olan tüm browserları kapatır
    }
}
