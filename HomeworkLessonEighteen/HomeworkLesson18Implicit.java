package HomeworkLessonEighteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

/**
 * QA Automation. Kevin. Homework 18
 * @author Olena Moskvina
 * @version dated 18/06/2020
 */
public class HomeworkLesson18Implicit {

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

        JavascriptExecutor js = (JavascriptExecutor) driver; // драйвер для скроллинга

        try {
            //разворачиваем окно на весь экран
            driver.manage().window().maximize();


            //открываем сайт
            driver.get("https://www.usgs.gov");

            //ждем немного, если вдруг появится окно с опросом, откажемся - используем Impliсit wait
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.id("cfi_btnNoThanks")).click();
        }
        catch (NoSuchElementException ex){
            System.out.println("Окно опроса не появилось, поэтому идем дальше");
        }

        finally {



            //ждем, чтоб кликнуть на элемент карусели №1 - используем Impliсit wait
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//*[@id=\"node-carousel\"]/div[3]/div/div/div/div/div[1]/div/div/div[2]/div[2]/div/div/a")).click();

            Thread.sleep(7000);
            js.executeScript("scrollBy(0, 2000)");  //скроллим вниз
            Thread.sleep(7000);
            driver.navigate().back(); //назад (на стартовую)
            driver.quit();
        }
    }

}
