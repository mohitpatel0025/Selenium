import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class C_RegisterPage {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.nopcommerce.com/");
        //Click on Login link
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement( By.xpath("//*[@id=\"gender\"]/span[1]/label")).click();
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
        driver.findElement(By.id("Email")).sendKeys("tester1@gmail.com");
        driver.findElement(By.id("Company")).click();
        driver.findElement(By.id("Company")).sendKeys("XYZ Pvt Ltd");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).sendKeys("Abcd1234");
        driver.findElement(By.id("ConfirmPassword")).click();
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Abcd1234");
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[2]/a")).click();
        driver.findElement(By.className("ico-logout")).click();

    }
}
