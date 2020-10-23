package pq1;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BasePage{

	@Test(priority=1)
	public void verifyClickRunBtn() {
		LP.clickRunBtn();
		String output=LP.getOutput();
		try {
			Assert.assertTrue(output.contains("Hello World"), "Hello World text displayed after clicking Run Button");
		}catch(Exception e) {
			Assert.fail();
		}
			
	}
	
	@Test(priority=2)
	public void verifyClickSaveBtn() {
		LP.clickSaveBtn();
		wait.until(ExpectedConditions.elementToBeClickable(LP.LoginWindowClose));
		Assert.assertTrue(LP.isLoginWindowOpened(), "Login window displayed after clicking Save Button");
		LP.closeLoginWindon();
	}
}
