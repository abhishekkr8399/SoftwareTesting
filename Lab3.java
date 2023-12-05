package gmailTest;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Abhishek\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		Scanner sc = new Scanner(System.in);
		String baseUrl = "https://www.gmail.com";
		
		System.out.print("Enter Title: ");
		String expected= sc.nextLine();
		WebDriver driver=new EdgeDriver();
		driver.get(baseUrl);
		if(driver.getTitle().equals(expected)) {
			System.out.println("Test Passed : Title Matched");
			driver.findElement(By.id("identifierId")).clear();
			driver.findElement(By.id("identifierId")).sendKeys("nmamit.abhishek@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
				System.out.println("Exception occured");
			}
			driver.findElement(By.name("Passwd")).sendKeys("01-09-2002");
			driver.findElement(By.id("passwordNext")).click();
		}
		else
			System.out.println("Test Failed : Title Mismatch");
		driver.close();
		sc.close();
	}

}
