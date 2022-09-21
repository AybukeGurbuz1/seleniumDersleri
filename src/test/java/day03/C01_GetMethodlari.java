package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetMethodlari {
    public static void main(String[] args) {
        /*
       -Amazon sayfasına gidiniz
       -Arama kutusunu locate ediniz
       -Arama kutusunun tagName'inin input olduğunu test ediniz
       -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
       -Sayfayı kapatınız
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // -Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //-Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("TagName Testi PASSED :" + actualTagName);
        } else System.out.println("TagName Testi FAILED" + actualTagName);
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributeName = "field-keywords";
        String actualAtributeName = aramaKutusu.getAttribute("name");
        if (actualAtributeName.equals(expectedAtributeName)) {
            System.out.println("Attribute Testi PASSED");
        } else System.out.println("Attribute Testi FAILED");

        // Arama kutusunun konumunu yazdırınız
        System.out.println("Arama kutusu konumu :"+aramaKutusu.getLocation());

        //-Sayfayı kapatınız
        driver.close();


    }
}
