package HomeworkLessonSixteen;
/**
 * QA Automation. Kevin. Homework 16
 * @author Olena Moskvina
 * @version dated 08/06/2020
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeworkLesson16 {

    public static WebDriver driver;

    //раскомментровать для выбора другого браузера
    public static String browser = "chrome";
    //public static String browser = "opera";
    //public static String browser = "firefox";

    //раскомментировать для выбора другого города
    //public static String city = "Киев";
    public static String city = "Славянск";


    public static void main(String[] args) {
    // блок выбора драйвера в зависимости от предопределенного переменной browser браузера
    if(browser.equals("chrome")) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }else if(browser.equals("firefox")) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }else if(browser.equals("opera")) {
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
    }

        //открываем сайт
        driver.get("https://sinoptik.ua/");

        System.out.println(driver.getTitle()); //получили название страницы

        //разворачиваем окно на весь экран
        driver.manage().window().maximize();

        //записываем в поле поиска город, указанный в переменной city, поиск элемента по Id
        driver.findElement(By.id("search_city")).sendKeys(city);

        //кликаем на кнопку Найти, поиск элемента по xpath
        driver.findElement(By.xpath("//*[@id=\"form-search\"]/p[1]/input[2]")).click();

        //смотрим погоду в четверг, поиск элемента по xpath
        driver.findElement(By.xpath("//*[@id=\"bd4\"]")).click();


        //driver.quit();

    }

}
