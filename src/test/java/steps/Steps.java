package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;
import pageObjects.NewJobPage;

import java.util.concurrent.TimeUnit;

public class Steps {
    LoginPage loginPage;
    NewJobPage newJobPage;
    WebDriver driver;
    @Given("^I am logged into my account$")
    public void loggingIntoAccount(){
        System.setProperty("webdriver.chrome.driver", "E:\\proggramming\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        loginPage.navigateTo_LoginPage();
        loginPage.inputName("Admin");
        loginPage.inputPassword("admin123");
        loginPage.clickLoginButton();
    }

    @Given("^I am on https://opensource-demo\\.orangehrmlive\\.com/web/index\\.php/admin/saveJobTitle$")
    public void openTheNewJobPage() {
        driver.findElement(By.className("oxd-main-menu-item-wrapper")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Job')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Job Titles')]")).click();
        driver.findElement(By.className("oxd-button--medium")).click();
    }

    @When("^I filled in \"Job Title\", \"Job Description\" and \"Note\" fields$")
    public void fillIn(){
        newJobPage = new NewJobPage(driver);
        newJobPage.inputJobTitle("Administrator");
        newJobPage.inputJobDescription("IT administrators oversee organizations' computer systems and manage IT teams. They maintain information systems and networks,upgrade and install new hardware and software, and perform troubleshooting.");
        newJobPage.inputNote("Administrator");

    }

    @And("^click on the \"Save\" button$")
    public void clickOnTheSaveButton() {
        newJobPage.clickSaveButton();
    }

    @Then("^I should see a new field with added job$")
    public void iShouldSeeANewFieldWithAddedJob() {
        Assert.assertNotNull(driver.findElement(By.xpath("//div[text()='Administrator']")));
        driver.close();
    }

    @Given("^I am on https:\\/\\/opensource-demo.orangehrmlive.com\\/web\\/index.php\\/admin\\/viewJobTitleList$")
    public void iAmOnHttpsOpensourceDemoOrangehrmliveComWebIndexPhpAdminViewJobTitleList() {
        driver.findElement(By.className("oxd-main-menu-item-wrapper")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Job')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Job Titles')]")).click();
    }

    @When("I click on the \"Delete\" button")
    public void clickOnTheDeleteButton() {
        WebElement Delete =
                driver.findElement(By.xpath("//div[text()='Administrator']/ancestor::div[@class='oxd-table-card']//button"));
        Delete.click();
    }

    @And("click on the \"Yes,Delete\" button")
    public void clickOnTheYesDeleteButton() {
        WebElement Yes = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
        Yes.click();
    }

    @Then("I can't see this field")
    public void iCanTSeeThisField(){
        try {
            WebElement elem = driver.findElement(By.xpath("//div[text()='Administrator']"));
            Assert.fail("Should have thrown an exception");
        } catch (final NoSuchElementException e) {
            Assert.assertTrue(true);
        }
        driver.close();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}

