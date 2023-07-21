package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
    WebDriver driver;

    public RegisterPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement txtFname;
    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement txtLname;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    WebElement txtAddress;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    WebElement txtCity;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    WebElement txtState;
    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    WebElement txtZipcode;
    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    WebElement txtPhnumber;
    @FindBy(xpath = "//input[@id='customer.ssn']")
    WebElement txtSsn;
    @FindBy(xpath = "//input[@id='customer.username']")
    WebElement txtUsername;
    @FindBy(xpath = "//input[@id='customer.password']")
    WebElement txtPassword;
    @FindBy(xpath = "//input[@id='repeatedPassword']")
    WebElement txtConpassword;
    @FindBy(xpath = "//p[contains(text(),'Your account was created successfully. You are now')]")
    WebElement msgRegistration;
    @FindBy(xpath = "//input[@value='Register']")
    WebElement btnRegister;


    public void setFname(String fname)
    {
        txtFname.sendKeys(fname);
    }
    public void setLname(String lname)
    {
        txtLname.sendKeys(lname);
    }
    public void setAddress(String address)
    {
        txtAddress.sendKeys(address);
    }
    public void setCity(String city)
    {
        txtCity.sendKeys(city);
    }
    public void setState(String state)
    {
        txtState.sendKeys(state);
    }
    public void setZipcode(String zipcode)
    {
        txtZipcode.sendKeys(zipcode);
    }
    public void setPhnumber(String phnumber)
    {
        txtPhnumber.sendKeys(phnumber);
    }
    public void setSsn(String ssn)
    {
        txtSsn.sendKeys(ssn);
    }
    public void setUsername(String username)
    {
        txtUsername.sendKeys(username);
    }
    public void setPassword(String password)
    {
        txtPassword.sendKeys(password);
    }
    public void setConpassword(String conpassword)
    {
        txtConpassword.sendKeys(conpassword);
    }
    public void clickRegister()
    {
        btnRegister.click();
    }
    public boolean isMyAccRegSuccessful()
    {
        try {
            return (msgRegistration.isDisplayed());
        }
        catch (Exception e)
        {
            return (false);
        }
    }


}
