package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static config.WebDriverSingleton.getInstance;
import static utility.Actions.waitForVisibilityOfElement;

public class BasePage {

    @FindBy(className = "navLeftFooter nav-sprite-v1")
    //@FindBy(linkText = "1996-2019, Amazon.com, Inc. or its affiliates")
    private WebElement pageContent;

    public BasePage(){
        PageFactory.initElements(getInstance(), this);
        waitForVisibilityOfElement(pageContent);
    }
}
