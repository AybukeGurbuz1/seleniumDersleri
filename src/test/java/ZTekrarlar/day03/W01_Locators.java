package ZTekrarlar.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W01_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Amazon a gidip nutella aratalım
        driver.get("https://www.amazon.com");
        // findElement (By .. locator) istediğimiz web elementini bize döndürür
        // bizde o webElementini kullanmak için bir objeye asssign ederiz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        /*
        Locator alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locator çalışmazsa alternatif locatorlar denemeliyiz
         */
        //herhangi bir webElementine istediğimiz yazıyı yollamak istersek
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        /*
        ID en popüler locator, unique olduğu için genelde en çok bu kullanılır
         */



    }
}
