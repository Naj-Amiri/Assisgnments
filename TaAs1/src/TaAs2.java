import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaAs2 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "D:\\Recup Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Done");
		driver.close();

		

	}

}
