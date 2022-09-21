package homework.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Odev02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // sayfanın max bekleme süresi

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //b. Sign in butonuna basin
        WebElement signInButton = driver.findElement(By.linkText("Sign in"));
        //c. email textbox, password textbox, and sign in button elementlerini locate ediniz

        //d. kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in) buttonunu tıklayın:
        //i. username testtechproed@gmail.com
        //ii. Password : Test1234!

        //e. Expected user id nin testtechproed@gmail.com olduğunu doğrulayın (verify)

        //f. "Adresseses" ve "Sign Out" textlerinin görüntülendiğini (dispalyed) doğrulayın (verify)
        //3. sayfada kaç tane link olduğunu bulun





    }

}