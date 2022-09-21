package homework.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {

    public static void main(String[] args) {
        /*
        Yeni bir class olusturalim (Homework)
        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
        https://www.walmart.com/ sayfasina gidin.
        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        Tekrar “facebook” sayfasina donun
        Sayfayi yenileyin
        Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
        */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tr-tr.facebook.com");

        String title = driver.getTitle();
        if (title.contains("facebook")) {
            System.out.println("title'de facebook var ");
        } else System.out.println(title);

        String url = driver.getCurrentUrl();
        if (url.contains("facebook")) {
            System.out.println("sayfa urlesinde facebook var");
        } else System.out.println(url);

        driver.navigate().to("https://www.walmart.com");

        String urll = driver.getCurrentUrl();
        if (urll.contains("walmart.com")) {
            System.out.println("sayd url'sinde walmart.com var");
        } else System.out.println("sayfa urlesinde walmart.com yok!!");

        driver.navigate().back();

        driver.navigate().refresh();

        driver.manage().window().maximize();

        driver.close();


    }
}
