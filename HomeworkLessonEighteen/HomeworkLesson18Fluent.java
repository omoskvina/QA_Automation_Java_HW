package HomeworkLessonEighteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomeworkLesson18Fluent {

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



            //ждем немного, если вдруг появится окно с опросом, откажемся - используем Fluent wait
            Wait<WebDriver> waitFluent = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(60))
                    .pollingEvery(Duration.ofSeconds(4))
                    .ignoring(NoSuchElementException.class);
            waitFluent.until(ExpectedConditions.visibilityOfElementLocated(By.id("cfi_btnNoThanks"))).click();

        }
        catch (TimeoutException ex){
            System.out.println("Окно опроса не появилось, поэтому идем дальше");
        }

        finally {
            Wait<WebDriver> waitFluent = new FluentWait<WebDriver>(driver)
                    .withTimeout(Duration.ofSeconds(60))
                    .pollingEvery(Duration.ofSeconds(4))
                    .ignoring(NoSuchElementException.class);

            //ждем появления нужного элемента карусели - №5 - и кликаем, также используем Fluent wait
            waitFluent.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-carousel\"]/div[3]/div/div/div/div/div[1]/div/div/div[6]/div[2]/div/div/a"))).click();

            Thread.sleep(7000);
            js.executeScript("scrollBy(0, 2000)"); //скроллим вниз
            Thread.sleep(7000);

            driver.navigate().back(); //назад (на стартовую)
            Thread.sleep(7000);
            driver.quit();
        }
        }
}
