package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import pageObjects.*;

import java.time.Duration;

public class steps {
    WebDriver driver;
    LoginPage lpg;
    HomePage hp;
    RegisterPage rpg;
    AccountPage ap;
    OpenAccPage oap;
    FundTransfer ftp;

    @Given("user launch browser")
    public void user_launch_browser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("Open URL {string}")
    public void open_url(String url) {
        lpg = new LoginPage(driver);
        driver.get(url);
        driver.manage().window().maximize();

    }

    @When("User enter username as {string} and password as {string}")
    public void user_enter_username_as_and_password_as(String unm, String pwd) {
        lpg = new LoginPage(driver);
        lpg.setUsername(unm);
        lpg.setPassword(pwd);

    }

    @When("Click on login button")
    public void click_on_login_button() {
        lpg.clickLogin();
    }

    @Then("User navigate to myaccount page")
    public void user_navigate_to_myaccount_page() {
        boolean targetpage = lpg.isMyAccountPageExists();
        if (targetpage) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        driver.close();
    }

    //================================================================================================
    //REGISTER----------------------------------------------------------------------------------------

    @When("Click on Register link")
    public void click_on_register_link() {
        hp = new HomePage(driver);
        hp.clickRegister();

    }

    @When("Enter information into mandatory fields username as {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void enter_information_into_mandatory_fields_username_as_and_and_and_and_and_and_and_and_and_and(String fnm, String lnm, String adrs, String city, String state, String zcode, String phn, String ssn, String unm, String pwd, String cpwd) {
        rpg = new RegisterPage(driver);
        rpg.setFname(fnm);
        rpg.setLname(lnm);
        rpg.setAddress(adrs);
        rpg.setCity(city);
        rpg.setState(state);
        rpg.setZipcode(zcode);
        rpg.setPhnumber(phn);
        rpg.setSsn(ssn);
        rpg.setUsername(unm);
        rpg.setPassword(pwd);
        rpg.setConpassword(cpwd);


    }

    @When("Click on register button")
    public void click_on_register_button() {
        rpg.clickRegister();

    }

    @Then("User successfully navigate to myaccount page")
    public void user_successfully_navigate_to_myaccount_page() {
        boolean regconpage = rpg.isMyAccRegSuccessful();
        driver.close();
        if (regconpage) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

    }

    //===============================================================================================================
    //Account Open

    @When("Click on open new account link")
    public void click_on_open_new_account_link()
    {
        ap = new AccountPage(driver);
        ap.clickOpenNewAcc();

    }

    @When("Enter new account information into mandatory fields")
    public void enter_new_account_information_into_mandatory_fields()
    {
        oap = new OpenAccPage(driver);
        oap.selectAccType("SAVINGS");
        oap.selectMinAmmount(0);
    }

    @When("Click on open new account button")
    public void click_on_open_new_account_button()
    {
        oap.clickNewAcc();
    }

    @Then("User successfully navigate to account page")
    public void user_successfully_navigate_to_account_page()
    {
        boolean accopenconfirm = oap.isMyAccOpen();
        driver.close();
        if (accopenconfirm)
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }
    }

    //==========================================================================================================
    //Fund Transfer

    @When("Click on Transfer Fund link")
    public void click_on_transfer_fund_link()
    {
        ap=new AccountPage(driver);
        ap.clickTransferFund();

    }
    @When("Enter fund transfer details into mandatory fields")
    public void enter_fund_transfer_details_into_mandatory_fields()
    {
        ftp=new FundTransfer(driver);
        ftp.setAmount("100");
        ftp.selectFromAccount(1);
        ftp.selectToAccount(0);

    }
    @When("Click on transfer button")
    public void click_on_transfer_button()
    {
        ftp.clickTransfer();

    }
    @Then("Successfully transfer from one account to other")
    public void successfully_transfer_from_one_account_to_other()
    {
        boolean transferDone = ftp.isMyTransferDone();
        driver.close();
        if (transferDone)
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

    }








}
