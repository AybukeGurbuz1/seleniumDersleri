package ZTekrarlar.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W0003_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // sayfayı tam sayfa yapar

        driver.get("https://www.amazon.com");
        System.out.println("actual title : "+ driver.getTitle());
        System.out.println("actual url : "+ driver.getCurrentUrl());

        driver.close();


    }
}
