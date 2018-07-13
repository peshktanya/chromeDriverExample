import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestClass {
    protected WebDriver driver;

    @Test
    public void simpleTest() {
        WebDriver driver = new ChromeDriver();

        String eTitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
        String aTitle = "";

        // запустить firefox и перейти по адресу
        driver.get("http://www.guru99.com/");
        // разворачивает окно браузера
        driver.manage().window().maximize();
        // получить значение у тайтла страницы
        aTitle = driver.getTitle();

        // выполняем проверку
        Assert.assertEquals(aTitle, eTitle);

        // закрываем окно браузера
        driver.close();
    }
}
