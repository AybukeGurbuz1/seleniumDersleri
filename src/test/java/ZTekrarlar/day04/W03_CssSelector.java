package ZTekrarlar.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class W03_CssSelector {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://a.testaddressbook.com/sign_in adresine gidin
        driver.get("https://a.testaddressbook.com/sign_in");
        // Locate email textbox
        WebElement emailTextBox = driver.findElement(By.cssSelector("#session_email"));
        // Locate password textbox ve
        WebElement passwordTextBox = driver.findElement(By.cssSelector("#session_password"));
        // Locate signin button
        WebElement signinTextBox = driver.findElement(By.cssSelector("input[value='Sign in']"));
        //Aşağıdaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
            // i. Username : testtechproed@gmail.com
            // ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signinTextBox.click();
    }
}
