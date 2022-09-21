package ZTekrarlar.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class W01_AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazona gidin
        driver.get("https://www.amazon.com");

        // Search (ara) "city bike"
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        // Amazon da görülen ilgili sonuçların sayısını yazdırın
        List<WebElement> istenenElementListesi = driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi = istenenElementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());
        //karşınıza çıkan ilk resme tıklayın
        List<WebElement> urunResimleriList = driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi = urunResimleriList.get(0);
        ilkUrunResmi.click();

    }
}
