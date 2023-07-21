package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage
{
    WebDriver driver;

    public AccountPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[normalize-space()='Open New Account']")
    WebElement lnkOpenNewAcc;
    @FindBy(xpath = "//a[normalize-space()='Transfer Funds']")
    WebElement lnkTransferFund;

    public void clickOpenNewAcc()
    {
        lnkOpenNewAcc.click();
    }
    public void clickTransferFund()
    {
        lnkTransferFund.click();
    }
}
