package mercury;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import java.util.Scanner;
public class Mercury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Abhishek\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Title: ");
		String expected=sc.nextLine();//Welcome: Mercury Tours
		String url = "https://demo.guru99.com/test/newtours/";
		
		WebDriver driver=new EdgeDriver();
		driver.get(url);
		if(driver.getTitle().equals(expected)) {
			System.out.println("Test Passed : Title Matched");
		}
		else
			System.out.println("Test Failed : Title Mismatch");
		driver.close();
		sc.close();
	}

}
