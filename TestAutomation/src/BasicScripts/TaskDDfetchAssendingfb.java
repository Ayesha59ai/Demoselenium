package BasicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskDDfetchAssendingfb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement dd = driver.findElement(By.id("month"));
		Select s=new Select(dd);
		List<WebElement> opts = s.getOptions();
		int optcount = opts.size();
		System.out.println(optcount);
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=0;i<optcount;i++) {
			WebElement opt = opts.get(i);
			String text = opt.getText();
			//to all text value to array
			arr.add(text);
		}
		//to sort array
		Collections.sort(arr);
		for(String ar:arr) {
			System.out.println(ar);
		}
	driver.quit();	


	}

}
