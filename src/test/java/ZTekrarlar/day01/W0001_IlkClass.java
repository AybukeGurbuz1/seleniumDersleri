package ZTekrarlar.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W0001_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /*
        en ilkel haliyle bir otomasyon yapmak için
        class ımıza otomasyon için gerekli olan webdriver in yerini göstermemiz gerekir
        bunun için java kütüphanesinden System.setProperty() methodu kullanırız
        method iki parametre istemektedir
        ilki kullanacağımız driver : webriver.chrome.driver
        ikincisi ise bu driverın fiziki yolu : src/resources/drivers/chromedriver.exe
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        driver.get("https://www.techproeducation.com");
        Thread.sleep(3000);

        driver.get("https://www.facebook.com");
        Thread.sleep(3000);

        driver.close();


    }

}
