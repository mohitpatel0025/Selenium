import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_RegisterChrome {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/span[1]/label")).click();


        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Tester");
        driver.findElement(By.id("LastName")).click();
        driver.findElement(By.id("LastName")).sendKeys("Testing");

        driver.findElement(By.name("DateOfBirthDay")).click();
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("25");

        driver.findElement(By.name("DateOfBirthMonth")).click();
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("April");

        driver.findElement(By.name("DateOfBirthYear")).click();
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("2000");

        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).sendKeys("tester2@gmail.com");

        driver.findElement(By.id("Company")).click();
        driver.findElement(By.id("Company")).sendKeys("XYZ Pvt Ltd");

        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).sendKeys("Abcd1234");

        driver.findElement(By.id("ConfirmPassword")).click();
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abcd1234");

        driver.findElement(By.id("register-button")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.className("ico-logout")).click();


    }
}
