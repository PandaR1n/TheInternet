package CheckboxesTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {
    private WebDriver driver;

    @FindBy(xpath = "//form/input[1]")
    private WebElement checkbox;

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCheckbox() {
        checkbox.click();
    }



    public boolean isCheckboxSelected() {
        return checkbox.isSelected();
    }


}
