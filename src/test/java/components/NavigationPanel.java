package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.*;

import static config.WebDriverSingleton.getInstance;

public class NavigationPanel extends BasePage {

    public NavigationPanel() {
        super();
    }


    @FindBy(id = "nav-link-accountList")
    private WebElement NAV_ACCOUNT_LIST;

    @FindBy(id = "nav-cart")
    private WebElement NAV_CART;

    @FindBy(className = "nav-search-scope nav-sprite")
    private WebElement NAV_SEARCH_DEPARMENTS;

    @FindBy(className = "nav-search-field ")
    private WebElement NAV_SEARCH_FIELD;

    @FindBy(className = "nav-search-submit nav-sprite")
    private WebElement NAV_SEARCH_GO_BUTTON;

    @FindBy(className = "nav-logo-link")
    private WebElement NAV_LOGO_HOME_LINK;

    @FindBy(css = "#nav-flyout-ya-signin > a > span")
    private WebElement SIGN_IN_BUTTON;

    @FindBy(id = "nav-item-signout")
    private WebElement SIGN_OUT_LINK;

    @FindBy(css = "#nav-link-accountList > span.nav-line-1")
    private WebElement NAV_HELLO_NAME_LABEL;

    public  NavigationPanel moveToNavAccount(){
        Actions builder = new Actions(getInstance());
        builder.moveToElement(NAV_ACCOUNT_LIST)
                .build()
                .perform();
        return this;
    }


    public SignIn clickSignInButton(){
        SIGN_IN_BUTTON.click();
        return new SignIn();
    }


    public SignIn clickSignOutLink(){
        SIGN_OUT_LINK.click();
        return new SignIn();
    }


    public CartDetails clickCartIcon(){
        NAV_CART.click();
        return new CartDetails();
    }

    public NavigationPanel setDeparmentsSearch_ByVisibleText(String deparment){
        new Select(NAV_SEARCH_DEPARMENTS).selectByVisibleText(deparment);
        return this;
    }

    public NavigationPanel setSearchItemText(String item){
        NAV_SEARCH_FIELD.sendKeys(item);
        return this;
    }

    public SearchDetails clickSearchButton(){
        NAV_SEARCH_GO_BUTTON.click();
        return new SearchDetails();
    }

    public Home clickHomeButton(){
        NAV_LOGO_HOME_LINK.click();
        return new Home();
    }

    public String getHelloNameLabel(){
        return NAV_HELLO_NAME_LABEL.getTagName();
    }
}
