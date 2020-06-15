package HomeworkLessonEighteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

/**
 * QA Automation. Kevin. Homework 18
 * @author Olena Moskvina
 * @version dated 09/06/2020
 */
public class HomeworkLesson18 {
    public static WebDriver driver;

    //раскомментровать для выбора другого браузера
    public static String browser = "chrome";
    //public static String browser = "opera";
    //public static String browser = "firefox";

    public static void main(String[] args) {

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



        //открываем сайт
        driver.get("https://www.usgs.gov");


        //driver.findElement(By.xpath("//*[@id=\"node-carousel\"]/div[3]/div/div/div/div/div[1]/div/div/div[2]/div[2]/div/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"node-carousel\"]/div[3]/div/div/div/div/div[1]/div/div/div[5]/div[2]/div/div/a")).click();



        //driver.get("https:www.worldpressphoto.org");



    }
}
