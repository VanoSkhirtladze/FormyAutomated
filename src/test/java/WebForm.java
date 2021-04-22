import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WebForm extends PageObject{
    private final String FIRST_NAME = "Vano";
    private final String LAST_NAME = "Skhirtladze";
    private final String JOB_TITLE = "Testing";
    private final String DATE= "02/21/1999";



    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id = "job-title")
    private WebElement job_title;


    @FindBy(id = "checkbox-1")
    private WebElement checkbox_1;

    @FindBy(id = "radio-button-1")
    private WebElement radio_button;

    @FindBy(id = "select-menu")
    private WebElement select_menu;
    Select select =new Select(select_menu);

    @FindBy(id = "datepicker")
    private WebElement datepicker;


    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

    public WebForm(WebDriver driver) {
        super(driver);

    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }

    public void enterJobTitle(){this.job_title.sendKeys(JOB_TITLE);}

    public void clickRadio(){
        this.radio_button.click();
    }

    public void clickGender(){
        this.checkbox_1.click();
    }

    public void selectYearsExperience(){
        this.select.selectByValue("2");

    }
    public void selectDate(){
        this.datepicker.sendKeys(DATE);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }
}
