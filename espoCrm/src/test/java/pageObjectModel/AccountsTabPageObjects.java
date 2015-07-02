package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountsTabPageObjects {
	
	@FindBy(xpath="//*[@id='main']/div[1]/div/div[2]/div/a")
	public WebElement createAccount;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div/input")
	public WebElement name;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/input")
	public WebElement email;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/span[1]/select")
	public WebElement selectPhoneType;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div/input")
	public WebElement phoneNo;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div/input")
	public WebElement website;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/span/button[2]")
	public WebElement emailOptOutBtn;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div/textarea")
	public WebElement billingAddressStreet;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div/div/div[1]/input")
	public WebElement billingAddressCity;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div/div/div[2]/input")
	public WebElement billingAddressState;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div/div/div[3]/input")
	public WebElement billingAddress_postalCode;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div/input")
	public WebElement billingAddressCountry;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div/textarea")
	public WebElement shippingAddressStreet;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[1]/input")
	public WebElement shippingAddressCity;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[2]/input")
	public WebElement shippingAddressState;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[3]/input")
	public WebElement shippingAddress_postalCode;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div/input")
	public WebElement shippingAddress_country;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div/button")
	public WebElement copyBillingAddress;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/select")
	public WebElement accoutType;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div/input")
	public WebElement sicCode;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div/select")
	public WebElement industryType;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[1]/div[1]/div[2]/div[2]/div[3]/div/div/textarea")
	public WebElement description;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[2]/div/div/div/div[1]/div/div/input")
	public WebElement assignedUser;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[2]/div/div/div/div[1]/div/div/span/button[1]")
	public WebElement selectUserToAssign;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[2]/div/div/div/div[1]/div/div/span/button[2]")
	public WebElement cancelAssignedUser;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[2]/div/div/div/div[2]/div/div[2]/input")
	public WebElement selectTeam;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[3]/div[2]/div/div/div/div[2]/div/div[2]/span/button")
	public WebElement selectTeamButton;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[1]/div/button[1]")
	public WebElement saveAccount;
	
	@FindBy(xpath="//*[@id='account-edit-1744']/div[1]/div/button[2]")
	public WebElement lcancelAccount;
	
}
