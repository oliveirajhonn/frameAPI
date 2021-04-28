package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hook
{

	private static AndroidDriver<?> driver;

	@Before
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability("UDID", "ce081718e892df3a04");
		cap.setCapability("deviceName", "Galaxy s8");
		cap.setCapability("noReset", false);
		cap.setCapability("resetKeyboard", true);
		cap.setCapability("appPackage", "br.com.icarros.androidapp");
		cap.setCapability("appActivity", "br.com.icarros.androidapp.ui.SplashActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown()
	{
		driver.quit();
	}

	public static AndroidDriver<?> getDriver()
	{
		return driver;
	}
}
