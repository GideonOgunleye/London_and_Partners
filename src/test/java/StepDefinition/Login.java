package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/*import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
*/
//import BaseUtilities.AlertBox;
//import BaseUtilities.Chrome2;
//import BaseUtilities.CsR;
//import BaseUtilities.ExtentFactory;
//import BaseUtilities.TakeScreenShot;
//import PageFactory.Client.Client_AddToBasketPage;
//import PageFactory.Client.Client_BillingPage;
//import PageFactory.Client.Client_CertificateDetailsPage;
//import PageFactory.Client.Client_CertificateValidationPage;
//import PageFactory.Client.Client_DomainNamesEditPage;
//import PageFactory.Client.Client_EditUserPage;
//import PageFactory.Client.Client_IssuedCertificatesPage;
//import PageFactory.Client.Client_LoginPage;
//import PageFactory.Client.Client_MyProductsPage;
//import PageFactory.Client.Client_MySslDashBoard;
//import PageFactory.Client.Client_MyUsersPage;
//import PageFactory.Client.Client_NavigationLinks;
//import PageFactory.Client.Client_NewUserPage;
//import PageFactory.Client.Client_PendingCertificatesPage;
//import PageFactory.Client.Client_RegisterDomainPage;
//import PageFactory.Client.Client_ShoppingBasketPage;
//import PageFactory.Client.Client_ViewOrderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	static WebDriver driver;


	@Given("^user is on login page$")
	public void user_is_on_Home_Page() {
		
		System.out.println("Login Successful");

	}

	@When("^user enters correct username and password$")
	public void user_enters_Username_and_Password() throws InterruptedException {
		
		System.out.println("Login Successful");
		
	}

	@Then("^user gets confirmation$")
	public void a_message_is_displayed() {
		
		System.out.println("Login Successful");
	}
    

}
