package ZTekrarlar.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W0007_navigate {
    public static void main(String[] args) throws InterruptedException {

        /*
        Eğer testimiz sırasında birden fazla sayfa arasında ileri geri hareket edeceksek
        driver.get() yerine driver.navigate.to() methodunu kullanırız
        ve sonrasındaa forward(), back(), refresh() methodları kullanırız
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        // amazona geri dönelim
        driver.navigate().back();
        Thread.sleep(2000);

        // yeniden facebook a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayı refresh yapalım
        driver.navigate().refresh();
        Thread.sleep(2000);

        // sayfayi kapatalım
        driver.close();

    }
}
