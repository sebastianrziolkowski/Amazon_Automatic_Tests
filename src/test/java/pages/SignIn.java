package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utility.Actions.waitForVisibilityOfElement;

public class SignIn {

    public SignIn(){
        super();
        waitForVisibilityOfElement(AMAZON_LOGO);
    }

    @FindBy(className = "a-icon a-icon-logo")
    private WebElement AMAZON_LOGO;

    @FindBy(id = "ap_email")
    private WebElement EMAIL_FIELD;

    @FindBy(id = "ap_password")
    private WebElement PASSWORD_FIELD;

    @FindBy(id = "signInSubmit")
    private WebElement SIGN_IN_BUTTON;


    public SignIn sendEmail(String email){
        EMAIL_FIELD.sendKeys(email);
        return this;
    }

    public SignIn sendPassword(String pass){
        PASSWORD_FIELD.sendKeys(pass);
        return this;
    }


    public Home clickSignInButton(){
        SIGN_IN_BUTTON.click();
        return new Home();
    }


}
