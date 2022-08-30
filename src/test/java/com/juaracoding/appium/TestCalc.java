package com.juaracoding.appium;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.appium.pages.Calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestCalc {

	private static AndroidDriver<MobileElement> driver;
	private Calculator calculator;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Redmi Note 8 Pro");
		capabilities.setCapability("uuid", "fyhafirwj7fiov4d");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "10.0");
		capabilities.setCapability("appPackage", "com.miui.calculator");
		capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
//		capabilities.setCapability("appium:appWaitDuration", "60000");
//		capabilities.setCapability("appium:adbExecTimeout", "60000");
		capabilities.setCapability("automationName", "UiAutomator1");
		
//		capabilities.setCapability("appium:deviceName", "SM-N960F");
//	    capabilities.setCapability("appium:uuid", "285817131a047ece");
//	    capabilities.setCapability("platformName", "Android");
//	    capabilities.setCapability("appium:platfromVersion", "10.0");
//	    capabilities.setCapability("appium:appPackage", "com.dencreak.dlcalculator");
//	    capabilities.setCapability("appium:appActivity", "com.dencreak.dlcalculator.DLCalculatorActivity");
//	    capabilities.setCapability("appium:automationName", "UiAutomator1");

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
	}
	@BeforeMethod
	public void pageObject() {
		calculator = new Calculator(driver);
	}
	@Test(priority=1)
	public void testTambah() {
		try {
			Thread.sleep(3000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			calculator.calcTambah();
			System.out.println("Hasil "+calculator.getResult());
			assertEquals(calculator.getResult(), "3");
			calculator.clear();
	}
	@Test(priority=2)
	public void testKurang() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		calculator.calcKurang();
		System.out.println("Hasil "+calculator.getResult());
		assertEquals(calculator.getResult(), "1");
		calculator.clear();
	}
	@Test(priority=3)
	public void testKali() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		calculator.calcKali();
		System.out.println("Hasil "+calculator.getResult());
		assertEquals(calculator.getResult(),"6");
//		calculator.clear();
	}
	@Test(priority=4)
	public void testBagi() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		calculator.calcBagi();
		System.out.println("Hasil "+calculator.getResult());
		assertEquals(calculator.getResult(),"2");
//		calculator.clear();
	}
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}