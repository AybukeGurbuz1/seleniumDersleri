package ZTekrarlar.day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W0008_manageMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("pencere olculeri = " + driver.manage().window().getSize());
        System.out.println("pencere konumu  = " + driver.manage().window().getPosition());

        // pencerenin konumunu  ve büyüklüğünü değiştirelim
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));


    }
}
