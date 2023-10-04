import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       ChromeDriver driver = new ChromeDriver();
       driver.get("http://www.google.com");
       driver.get("https://www.saucedemo.com/");
       Thread.sleep(2000);
       driver.findElement(By.id("user-name")).sendKeys("standard_user");
       Thread.sleep(2000);
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
       Thread.sleep(2000);
       driver.close();
       
       
	}

}
