package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtil;

public class LoginPage {
	
	protected WebDriver driver;
	protected WaitUtil waitUtil;
	private static final Logger log = LogManager.getLogger(LoginPage.class);

	private By txtUsername = By.id("user-name");
	private By txtPassword = By.id("password");
	private By btnLogin = By.id("login-button");
	private By lblError = By.xpath("//h3[@data-test='error']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		waitUtil = new WaitUtil(driver);
	}
	
	public ProductsPage login(String userName, String password) {
		try {
			waitUtil.waitForElementToBeClickable(txtUsername).sendKeys(userName);
			log.info("Entered '" + userName + "' in the username textbox.");
			waitUtil.waitForElementToBeClickable(txtPassword).sendKeys(password);
			log.info("Entered '" + password + "' in the password textbox.");
			waitUtil.waitForElementToBeClickable(btnLogin).click();
			log.info("Clicked on the Login button.");
			return new ProductsPage(driver);
		} catch (Exception e) {
			log.info("Unable to login. Exception occured: " +e.getMessage());
			return null;
		}
	}
	
	public boolean isPageDisplayed() {
		try {
			boolean isVisible = waitUtil.waitForElementToBeVisible(btnLogin).isDisplayed();
			if (isVisible) {
				log.info("Login page displayed.");
			} else {
				log.warn("Login button not visible, Login page might not be displayed.");
			}
			return isVisible;
		} catch (Exception e) {
			log.error("Unable to display Login page. Exception occurred: ", e);
			return false;
		}
	}
	
	public String getErrorText() {
		try {
			if (waitUtil.waitForElementToBeVisible(lblError).isDisplayed()) {
				String errorMsg = waitUtil.waitForElementToBeVisible(lblError).getText();
				log.info("Error message displayed on Login page.");
				return errorMsg;
			} else {
				log.warn("Error message not displayed.");
				return "";
			}
		} catch (Exception e) {
			log.error("Unable to get error message from Login page. Exception occurred: ", e);
			return "";
		}
	}

}
