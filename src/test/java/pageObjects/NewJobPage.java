package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewJobPage {
    public NewJobPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    WebElement jobTitle;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
    WebElement jobDescription;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")
    WebElement jobNote;

    @FindBy(xpath="//button[@type='submit']")
    WebElement saveButton;

    public void inputJobTitle(String title) {
        jobTitle.sendKeys(title);
    }

    public void inputJobDescription(String description) {
        jobDescription.sendKeys(description);
    }

    public void inputNote(String note) {
        jobNote.sendKeys(note);
    }

    public void clickSaveButton() {
        saveButton.click();
    }
}
