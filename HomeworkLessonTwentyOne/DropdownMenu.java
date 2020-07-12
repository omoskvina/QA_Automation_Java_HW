package HomeworkLessonTwentyOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;
/**
 * QA Automation. Kevin. Homework 21
 * @author Olena Moskvina
 * @version dated 12/07/2020
 */

public class DropdownMenu {

    public static WebDriver driver;

    //раскомментровать для выбора другого браузера
    public static String browser = "chrome";
    //public static String browser = "opera";
    //public static String browser = "firefox";


    public static void main(String[] args) throws InterruptedException {

        // блок выбора драйвера в зависимости от предопределенного переменной browser браузера
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("opera")) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }


        //разворачиваем окно на весь экран
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //открываем сайт
        driver.get("http://deluxe-menu.com//popup-mode-sample.html");

        Actions action = new Actions(driver); // создаем объект Actions

        //вызываем контекстное меню кликом пкм
        WebElement img = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
        action.contextClick(img).perform();

        //в меню наводим курсор на Product Info, вызывая новое выпадающее меню
        WebElement productInfo = driver.findElement(By.xpath("//*[@id=\"dm2m1i1tdT\"]"));
        action.moveToElement(productInfo).perform();

        //в меню наводим курсор на Supported Browsers, вызывая новое выпадающее меню
        WebElement supportedBrowsers = driver.findElement(By.xpath("//*[@id=\"dm2m2i4tdT\"]"));
        action.moveToElement(supportedBrowsers).perform();

        //в меню наводим курсор на Windows OS, вызывая новое выпадающее меню
        WebElement windowsOS = driver.findElement(By.xpath("//*[@id=\"dm2m4i0tdT\"]"));
        action.moveToElement(windowsOS).perform();

        //в меню кликаем на Mozilla
        driver.findElement(By.xpath("//*[@id=\"dm2m5i2tdT\"]")).click();


        Thread.sleep(3000);
        driver.quit();
    }

}
