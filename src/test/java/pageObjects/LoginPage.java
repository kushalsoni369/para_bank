package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='username']")
    WebElement txtUsername;

    @FindBy(xpath = "//input[@name='password']")
    WebElement txtPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement btnLogin;

    @FindBy(xpath = "//h1[@class='title']")
    WebElement msgAccount;


    public void setUsername(String uname)
    {
        txtUsername.sendKeys(uname);
    }
    public void setPassword(String upwd)
    {
        txtPassword.sendKeys(upwd);
    }
    public void clickLogin()
    {
        btnLogin.click();
    }
    public boolean isMyAccountPageExists()
    {
        try {
            return (msgAccount.isDisplayed());
        }
        catch (Exception e)
        {
            return (false);
        }
    }


}
