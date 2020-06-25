package practice.Program.Program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testt {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table=driver.findElement((By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")));
		int row=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold'] div:nth-child(3)")).size();
		
		for(int i=0;i<count;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold'] div:nth-child(3)")).get(i).getText());
		}
	}
	
}
