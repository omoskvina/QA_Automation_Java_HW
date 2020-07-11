package HomeworkLessonNineteen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * QA Automation. Kevin. Homework 19
 * @author Olena Moskvina
 * @version dated 10/07/2020
 */
public class HomeworkLesson19css {

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

        //разворачиваем окно на весь экран
        driver.manage().window().maximize();


        //открываем сайт - Геологическая служба США
        driver.get("https://www.usgs.gov");


        try {
            //ждем немного, если вдруг появится окно с опросом, откажемся - используем Expliсit wait
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cfi_btnNoThanks"))).click();
        }
        catch (TimeoutException ex){
            System.out.println("Окно опроса не появилось, поэтому идем дальше");
        }
        finally {
            //ждем появления нужного элемента карусели - №4 - и кликаем, также используем Expliсit wait

            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#node-carousel > div.panel-pane.pane-views.pane-dynamic-carousel-homepage > div > div > div > div > div.carousel-slider.slick-initialized.slick-slider > div > div > div:nth-child(5) > div.container.carousel-container > div > div > a"))).click();
            Thread.sleep(3000);

            js.executeScript("scrollBy(0, 1000)"); //скроллим вниз
            Thread.sleep(3000);

            driver.navigate().back(); //назад (на стартовую)
        }

        try {
            //ждем немного, если вдруг появится окно с опросом, откажемся - используем Expliсit wait
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cfi_btnNoThanks"))).click();
        }
        catch (TimeoutException ex){
            System.out.println("Окно опроса не появилось, поэтому идем дальше");
        }
        finally {
            //Идем в хедер, кликаем раздел Science
            driver.findElement(By.cssSelector("#navbar > div > div.row > div.first.leaf.hidden-xs.header-nav-link.col-sm-1.menu-7191 > a > b")).click();
        }

        try {
            //ждем немного, если вдруг появится окно с опросом, откажемся - используем Expliсit wait
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cfi_btnNoThanks"))).click();
        }
        catch (TimeoutException ex){
            System.out.println("Окно опроса не появилось, поэтому идем дальше");
        }
        finally {
            //В разделе Science в подразделе Science Explorer выбираем Geology
            driver.findElement(By.cssSelector("#navbar > div > div.header-menu-container > div > div > div.header-menu-dropdown.col-sm-9.col-sm-offset-3.active-dropdown > div:nth-child(1) > li > div > div > ul > li:nth-child(7) > a")).click();
        }

        try {
            //ждем немного, если вдруг появится окно с опросом, откажемся - используем Expliсit wait
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cfi_btnNoThanks"))).click();
        }
        catch (TimeoutException ex){
            System.out.println("Окно опроса не появилось, поэтому идем дальше");
        }
        finally {
            //Выбираем тему tectonic processes
            driver.findElement(By.cssSelector("#block-system-main > div > div > section > div > div.related-terms > div:nth-child(38) > a")).click();
        }

        try {
            //ждем немного, если вдруг появится окно с опросом, откажемся - используем Expliсit wait
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cfi_btnNoThanks"))).click();
        }

        catch (TimeoutException ex){
            System.out.println("Окно опроса не появилось, поэтому идем дальше");
        }

        finally {
            //Кликаем на ссылку в блоке View USGS Science and Products on a Map, чтобы открыть карту
            driver.findElement(By.cssSelector("#block-system-main > div.row > aside > div.well.mapAd > a")).click();
        }

        try {
            //ждем немного, если вдруг появится окно с опросом, откажемся - используем Expliсit wait
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cfi_btnNoThanks"))).click();
        }
        catch (TimeoutException ex){
            System.out.println("Окно опроса не появилось, поэтому идем дальше");
        }
        finally {
            //Кликаем на лого USGS чтобы перейти на главную страницу - Home
            driver.findElement(By.cssSelector("#navbar > div > div.row > div.col-sm-2.col-md-3.col-xs-5.logo-header-container > a > img")).click();
            js.executeScript("scrollBy(0, 1000)"); //скроллим вниз
            Thread.sleep(3000);

            driver.quit();
        }

    }


}


