import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class B_Bingconcept {

    public static void main(String[] args) {


        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");

        String  PageTitle = driver.getTitle();

        System.out.println("Page Title is: "+PageTitle);

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        driver.manage().window().maximize();

        System.out.println("Current Url is: "+driver.getCurrentUrl());

        //   driver.close();
        //   driver.quit();

    }
}




