package ZTekrarlar.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class W03_Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //b. Sign in butonuna basin
        WebElement signInLinki = driver.findElement(By.linkText("Sign in"));
        signInLinki.click();
        //c. email textbox, password textbox, and sign in button elementlerini locate ediniz
        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.name("session[password]"));
        WebElement signInButtonu = driver.findElement(By.name("commit"));
        //d. kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in) buttonunu tıklayın:
             //i. username testtechproed@gmail.com
             //ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButtonu.click();
        //e. Expected user id nin testtechproed@gmail.com olduğunu doğrulayın (verify)
        WebElement actualKullaniciAdiElementi = driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiElementi.getText());
        String expectedUserMail = "testtechproed@gmail.com";

        if(expectedUserMail.equals(actualKullaniciAdiElementi.getText())){
            System.out.println("expected kullanıcı testi PASSED");
        }else{
            System.out.println("expected kullanıcı testi FAILED");
        }
        // bir webElementn üzerinde ne yazdığını görmek istersek webElementIsmi.getText() kullanırız

        //f. "Adresseses" ve "Sign Out" textlerinin görüntülendiğini (dispalyed) doğrulayın (verify)
        WebElement addressesElementi = driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi = driver.findElement(By.linkText("Sign out"));

        if(addressesElementi.isDisplayed()){
            System.out.println("adreaaes testi PASSED");
        }else{
            System.out.println(" testi FAILED");
        }

        if(signOutElementi.isDisplayed()){
            System.out.println("sign out testi PASSED");
        }else{
            System.out.println("sign out testi FAILED");
        }
        //3. sayfada kaç tane link olduğunu bulun

        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfada ki link sayisi : " + linklerListesi.size());

        driver.close();
    }
}
