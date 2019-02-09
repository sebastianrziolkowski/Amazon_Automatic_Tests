package pages;

import components.NavigationPanel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchDetails {

    NavigationPanel navigationPanel;

    public SearchDetails(){
        super();
        navigationPanel = new NavigationPanel();
    }

    @FindBy(xpath ="//*[@id=\\\"result_0\\\"]/div/div/div/div[2]/div[1]/div[1]/a")
    private WebElement FIRST_SEARCH_ELEMENT;

    public String getFirstItemTitle(){
        return FIRST_SEARCH_ELEMENT.getText();
    }

    public ProductDetails clickFirstProduct(){
        FIRST_SEARCH_ELEMENT.click();
        return new ProductDetails();
    }

}
