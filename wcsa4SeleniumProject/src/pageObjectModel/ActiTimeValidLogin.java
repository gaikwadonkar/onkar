package pageObjectModel;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) {

		// for open the browser
				BaseTest bt = new BaseTest();	
				bt.openBrowser();

				
				// read the data from property file
				Flib flib = new Flib();

				
				LoginPage lp = new LoginPage(driver);

				lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));

	}

}
