package flipkart;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import java.util.Scanner;
public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Abhishek\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Url: ");//https://flipkart.com
		String url = sc.nextLine();
		String expected= "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!" ;
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		if(driver.getTitle().equals(expected)) {
			System.out.println("Test Passed : Web page loaded successfully");
		}else
			System.out.println("Test Failed : Web page Title Mismatch");
		System.out.println("Waiting 5 seconds...");
			try {
				Thread.sleep(5000);
			}
			catch(Exception e) {
				System.out.println("Exception occured");
			}
		driver.close();
		System.out.println("Web browser closed.");
		sc.close();
	}

}
