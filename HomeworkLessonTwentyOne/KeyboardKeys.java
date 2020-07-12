package HomeworkLessonTwentyOne;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;
/**
 * QA Automation. Kevin. Homework 21
 * @author Olena Moskvina
 * @version dated 12/07/2020
 */

public class KeyboardKeys {

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
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        //сочетание клавиш с использованием объекта WebDriver
        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys("vasya@google.com");  //заполняем поле

        emailField.sendKeys(Keys.chord(Keys.CONTROL + "a")); //выделить все
        Thread.sleep(2000);
        emailField.sendKeys(Keys.chord(Keys.CONTROL + "c")); //копировать
        emailField.sendKeys(Keys.chord(Keys.CONTROL + "v")); //вставить
        Thread.sleep(2000);
        emailField.sendKeys(Keys.chord(Keys.CONTROL + "v")); //контрольный для наглядности
        Thread.sleep(2000);
        emailField.sendKeys(Keys.chord(Keys.CONTROL + "a")); //очищаем поле
        emailField.sendKeys(Keys.chord(Keys.DELETE));
        Thread.sleep(2000);

        //сочетание клавиш с использованием объекта Actions
        Actions action = new Actions(driver);
        action.sendKeys(Keys.chord("petya@gmail.com")).build().perform(); //заполняем поле
        Thread.sleep(2000);
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform(); //выделить все
        Thread.sleep(2000);
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); //копировать
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform(); //вставить
        Thread.sleep(2000);
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform(); //контрольный для наглядности
        Thread.sleep(2000);

        driver.quit();

    }

}
