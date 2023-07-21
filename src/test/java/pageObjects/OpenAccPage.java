package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenAccPage
{
    WebDriver driver;

    public OpenAccPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@id='type']")
    WebElement chkAccType;


    @FindBy(xpath = "//select[@id='fromAccountId']")
    WebElement chkMinAmmount;

    @FindBy(xpath = "//input[@value='Open New Account']")
    WebElement btnNewAcc;

    @FindBy(xpath = "//p[normalize-space()='Congratulations, your account is now open.']")
    WebElement msgAccOpen;

    public void selectAccType(String type)
    {
        Select accType=new Select(driver.findElement(By.xpath("//select[@id='type']")));
        accType.selectByVisibleText(type);

    }

    public void selectMinAmmount(int i)
    {
        Select minAmmount=new Select(chkMinAmmount);
        minAmmount.selectByIndex(i);
    }

    public void clickNewAcc()
    {
        btnNewAcc.click();
    }
    public boolean isMyAccOpen()
    {
        try
        {
            return (msgAccOpen.isDisplayed());
        }
        catch (Exception e)
        {
            return (false);
        }
    }




}



