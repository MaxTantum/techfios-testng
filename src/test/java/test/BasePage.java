package test;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitForElement() {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
	    wait.until(ExpextedConditions.visibilityOfElementLocated(locator));	
	}
}
