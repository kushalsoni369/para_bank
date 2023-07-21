package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FundTransfer
{
    WebDriver driver;

    public FundTransfer(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='amount']")
    WebElement txtAmount;
    @FindBy(xpath = "//select[@id='fromAccountId']")
    WebElement ddFromAccount;
    @FindBy(xpath = "//select[@id='toAccountId']")
    WebElement ddToAccount;
    @FindBy(xpath = "//input[@value='Transfer']")
    WebElement btnTransfer;
    @FindBy(xpath = "//h1[@class='title']")
    WebElement msgTransferComplete;

    public void setAmount(String amt)
    {
        txtAmount.sendKeys(amt);
    }
    public void selectFromAccount(int i)
    {
        Select fromAcc=new Select(ddFromAccount);
        fromAcc.selectByIndex(i);
    }
    public void selectToAccount(int i)
    {
        Select toAcc=new Select(ddToAccount);
        toAcc.selectByIndex(i);
    }
    public void clickTransfer()
    {
        btnTransfer.click();
    }
    public boolean isMyTransferDone()
    {
        try {
            return (msgTransferComplete.isDisplayed());
        }
        catch (Exception e)
        {
            return (false);
        }
    }
}
