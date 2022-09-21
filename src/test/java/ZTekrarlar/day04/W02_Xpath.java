package ZTekrarlar.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class W02_Xpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna basın
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        // Delete butonunun görünür olduğunu test edin
        WebElement deleteButtonu = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButtonu.isDisplayed()) {
            System.out.println("delete butonu testi PASSED");
        } else {
            System.out.println("delete butonu testi FAILED");
        }

        // Delete tuşuna basın
        deleteButtonu.click();

        // "Add/Remove Elements" yazısının görünür olduğunu test edin //*[@id="content"]/h3
        WebElement addRemoveYaziElementi = driver.findElement(By.xpath("//h3"));
        if (addRemoveYaziElementi.isDisplayed()) {

            System.out.println("addRemoveYaziElementi testi PASSED");
        } else {
            System.out.println("addRemoveYaziElementi testi FAILED");

        }
            driver.close();


    }
}
