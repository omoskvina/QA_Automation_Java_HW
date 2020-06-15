package HomeworkLessonSeventeen;
/**
 * QA Automation. Kevin. Homework 17
 * @author Olena Moskvina
 * @version dated 09/06/2020
 */


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;



    public class HomeworkLesson17 {

        public static WebDriver driver;

        //раскомментровать для выбора другого браузера
        public static String browser = "chrome";
        //public static String browser = "opera";
        //public static String browser = "firefox";

        //раскомментировать для выбора другого города
        //public static String city = "Киев";
        public static String city = "Славянск";


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



            //открываем сайт
            driver.get("https://sinoptik.ua");

            //записываем в поле поиска город, указанный в переменной city, поиск элемента по Id
            driver.findElement(By.id("search_city")).sendKeys(city);
            Thread.sleep(4000);


            //кликаем на кнопку Найти, поиск элемента по xpath
            driver.findElement(By.xpath("//*[@id=\"form-search\"]/p[1]/input[2]")).click();
            Thread.sleep(3000);

            //смотрим погоду в другой день (+1 день), поиск элемента по xpath
            driver.findElement(By.xpath("//*[@id=\"bd2\"]")).click();
            Thread.sleep(3000);

            //смотрим погоду в другой день (+2 дня), поиск элемента по xpath
            driver.findElement(By.xpath("//*[@id=\"bd3\"]")).click();
            Thread.sleep(3000);

            //смотрим погоду в другой день (+3 дня), поиск элемента по xpath
            driver.findElement(By.xpath("//*[@id=\"bd4\"]")).click();
            Thread.sleep(3000);

            //смотрим погоду в другой день (+4 дня), поиск элемента по xpath
            driver.findElement(By.xpath("//*[@id=\"bd5\"]")).click();
            Thread.sleep(3000);

            //смотрим погоду в другой день (+5 дней), поиск элемента по xpath
            driver.findElement(By.xpath("//*[@id=\"bd6\"]")).click();
            Thread.sleep(3000);


            //смотрим погоду в другой день (+6 дней), поиск элемента по xpath
            driver.findElement(By.xpath("//*[@id=\"bd7\"]")).click();
            Thread.sleep(3000);


            driver.quit();

        }

    }
