package ZTekrarlar.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class W04_WebElementMethodlar {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        1- amazon.com a gidip arama kutusunu locate edin
        2- arama kutusunun tagName inin input olduğunu test edin
        3- arama kutusunun name attribute unun değerinin field-keywords olduğunu test edin
        */

        //1- amazon.com a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //2- arama kutusunun tagName inin input olduğunu test edin
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println("TagName Testi PASSED");
        }else{
            System.out.println("TagNAme Testi FAILED");
        }

        //3- arama kutusunun name attribute unun değerinin field-keywords olduğunu test edin
        String expectedNameDegeri = "field-keywords";
        String actualNameDegeri = aramaKutusu.getAttribute("name");

        if(expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("name attribute testi PASSED");
        }else{
            System.out.println("name attribute testi FAILED");
        }
        driver.close();

    }
}
