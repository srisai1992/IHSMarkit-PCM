package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	final WebDriver driver;
	
	@FindBy(xpath="//*[@id='run-button']") 		public WebElement RunBtn;
	@FindBy(xpath="//*[@id='save-button']") 	public WebElement SaveBtn;
	@FindBy(xpath="//*[@id='login-modal']") 	public WebElement LoginWindow;
	@FindBy(xpath="//*[@data-dismiss='modal']") public WebElement LoginWindowClose;
	@FindBy(xpath="//*[@id='output']") 			public WebElement Output;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickRunBtn() {
		RunBtn.click();
	}
	
	public void clickSaveBtn() {
		SaveBtn.click();
	}
	
	public String getOutput() {
		return Output.getText();
	}
	
	public Boolean isLoginWindowOpened() {
		String windowOpened=LoginWindow.getAttribute("aria-hidden");
		if(windowOpened.contentEquals("false")) {
			return true;
		}else return false;
	}
	
	public void closeLoginWindon() {
		if(isLoginWindowOpened()) {
			LoginWindowClose.click();
		}
	}
}
