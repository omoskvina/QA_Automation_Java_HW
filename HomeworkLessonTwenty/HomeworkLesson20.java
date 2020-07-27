package HomeworkLessonTwenty;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * QA Automation. Kevin. Homework 20
 * @author Olena Moskvina
 * @version dated 12/07/2020
 */
public class HomeworkLesson20 {
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


        JavascriptExecutor js = (JavascriptExecutor) driver; // драйвер для скроллинга}

        //разворачиваем окно на весь экран
        driver.manage().window().maximize();


        //открываем сайт
        driver.get("https://volcanoes.usgs.gov/index.html");


        //Работа с линками
        driver.findElement(By.xpath("//*[@id=\"vsc-header-box-right\"]/ul/li[7]/a")).click();

        // поиск ссылок в блоке Products
        WebElement blockProducts = driver.findElement(By.xpath("//*[@id=\"page-content-box\"]/div[2]"));
        List<WebElement> linksOfProducts = blockProducts.findElements(By.tagName("a"));

        for(WebElement link: linksOfProducts){
            System.out.println(link.getText()+ " with URL " + link.getAttribute("href"));
        }

        driver.navigate().back();

        // Работа с чек-боксами
        //снимаем все флаги в чек-боксах Volcano Status:
        WebElement volcanoStatusContainer = driver.findElement(By.xpath("//*[@id=\"map-controls\"]/div[6]"));
        List<WebElement> volcanoStatusCheckbox = volcanoStatusContainer.findElements(By.tagName("input"));

        for (WebElement checkbox: volcanoStatusCheckbox) {
            checkbox.click();
        }

        //Ставим флаг в чек-боксах Elevated, Normal
        driver.findElement(By.xpath("//*[@id=\"map-controls\"]/div[6]/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"map-controls\"]/div[6]/input[2]")).click();


        //Работа с выпадающим списком
        //определить количество значений в выпадающем списке
        List<WebElement>  values = driver.findElements(By.tagName("option"));
        System.out.println("The number of values in the list " + driver.findElement(By.id("vselect")).getAttribute("aria-label") +" is "+values.size());


        //поиск элемента в выпадающем списке по отображаемому тексту
        WebElement volcanoListByText= driver.findElement(By.id("vselect"));
        Select findVolcanoByText = new Select(volcanoListByText);
        //System.out.println(findVolcanoByText.getOptions());
        findVolcanoByText.selectByVisibleText("Kilauea");


        //поиск элемента в выпадающем списке по значению в теге
        WebElement volcanoListByValue= driver.findElement(By.id("vselect"));
        Select findVolcanoByValue = new Select(volcanoListByValue);
        findVolcanoByValue.selectByValue("/volcanoes/yellowstone/");

        //поиск элемента в выпадающем списке по индексу
        WebElement volcanoListByIndex= driver.findElement(By.id("volcano-vhp-dropdown"));
        Select findVolcanoByIndex = new Select(volcanoListByIndex);
        findVolcanoByIndex.selectByIndex(112);
        driver.findElement(By.id("volcano-vhp-go")).click();

        driver.quit();

    }
}