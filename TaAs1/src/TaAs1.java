import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaAs1 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver\", \"D:\\Recup Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
//<<<<<<< HEAD
//=======
		driver.manage().window().fullscreen();
		driver.close();
		
		
//>>>>>>> branch 'master' of https://github.com/Naj-Amiri/Assisgnments.git
		
	}

}
