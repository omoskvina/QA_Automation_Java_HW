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
import java.util.concurrent.TimeUnit;
import static com.google.common.util.concurrent.Futures.withTimeout;

/**
 * QA Automation. Kevin. Homework 18
 * @author Olena Moskvina
 * @version dated 18/06/2020
 */
public class HomeworkLesson18 {

    public static WebDriver driver;

    //раскомментровать для выбора другого браузера
    public static String browser = "chrome";
    //public static String browser = "opera";
    //public static String browser = "firefox";

    // метод для проверки наличия элемента, так как часто появляется "окно" с предложением пройти опрос
    public static boolean isElementPresent(By by) {
        try {
            return driver.findElement(by) != null;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

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


        //нужный элемент не появляется сразу, т.к. это карусель, вываливается эксепшн
        //driver.findElement(By.xpath("//*[@id=\"node-carousel\"]/div[3]/div/div/div/div/div[1]/div/div/div[5]/div[2]/div/div/a")).click();

        //ждем на всякий случай 5сек, чтоб кликнуть на элемент карусели №1 - о пользе карт в исследовании природы
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"node-carousel\"]/div[3]/div/div/div/div/div[1]/div/div/div[2]/div[2]/div/div/a")).click();

        Thread.sleep(3000); // ждем пару секунд
        js.executeScript("scrollBy(0, 3000)");
        Thread.sleep(3000);
        driver.navigate().back(); //назад (на стартовую)


        //Применение Explicit wait, создание объекта WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, 30);

        //ждем появления нужного элемента (№4 - землетрясение в Пуэрто-Рико) - и кликаем
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-carousel\"]/div[3]/div/div/div/div/div[1]/div/div/div[5]/div[2]/div/div/a"))).click();

        Thread.sleep(3000); // ждем пару секунд
        js.executeScript("scrollBy(0, 3000)");
        Thread.sleep(3000);
        driver.navigate().back(); //назад (на стартовую)

        //снова крутится карусель; хотим почитать о коричневой бойге (змея такая) на Гуаме - №5
        //Применение Fluent wait, создание объекта FluentWait

        Wait<WebDriver> waitFluent = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(4))
                .ignoring(NoSuchElementException.class);

        //waitFluent.until(ExpectedConditions.visibilityOfElementLocated(By.id("cfi_btnNoThanks"))).click();

        waitFluent.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"node-carousel\"]/div[3]/div/div/div/div/div[1]/div/div/div[6]/div[2]/div/div/a"))).click();

        Thread.sleep(3000); // ждем пару секунд
        js.executeScript("scrollBy(0, 5000)");
        Thread.sleep(3000);
        driver.navigate().back(); //назад (на стартовую)
        Thread.sleep(5000); // ждем пару секунд
        driver.quit();

    }
        //если вдруг предложат пройти опрос и нужный элемент перестанет быть кликабельным
        catch(ElementClickInterceptedException ex){
            if (isElementPresent(By.id("fi_btnNoThanks"))){
                driver.findElement(By.id("fi_btnNoThanks")).click();
            }
        }
        //часто падал браузер до белого экрана, что вызывало эксепшн; не уверена чо поможет, надо воспроизвести и проверить
        catch(ElementNotVisibleException ex){
            driver.quit();
            System.out.println("Browser Error - try again");
        }
    }
}