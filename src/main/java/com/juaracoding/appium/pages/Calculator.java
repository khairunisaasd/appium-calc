package com.juaracoding.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Calculator {

	public AndroidDriver<MobileElement>driver;
	public Calculator(AndroidDriver<MobileElement> driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	By btnSatu = By.id("com.miui.calculator:id/btn_1_s");
	By btnDua = By.id("com.miui.calculator:id/btn_2_s");
	By btnTiga = By.id("com.miui.calculator:id/btn_3_s");
	By btnEmpat = By.id("com.miui.calculator:id/btn_4_s");
	By btnTambah = By.id("com.miui.calculator:id/btn_plus_s");
	By btnKurang = By.id("com.miui.calculator:id/btn_minus_s");
	By btnKali = By.id("com.miui.calculator:id/btn_mul_s");
	By btnBagi = By.id("com.miui.calculator:id/btn_div_s");
	By btnEquals = By.id("com.miui.calculator:id/btn_equal_s");
	By result = By.id("com.miui.calculator:id/result");
	By btnclear = By.id("com.miui.calculator:id/btn_c_s");
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_1_s")
//	private MobileElement btnSatu;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_2_s")
//	private MobileElement btnDua;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_3_s")
//	private MobileElement btnTiga;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_4_s")
//	private MobileElement btnEmpat;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_5_s")
//	private MobileElement btnLima;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_plus_s")
//	private MobileElement btnTambah;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_minus_s")
//	private MobileElement btnKurang;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_mul_s")
//	private MobileElement btnKali;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_div_s")
//	private MobileElement btnBagi;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_equal_s")
//	private MobileElement btnEquals;
//	@AndroidFindBy(id = "com.miui.calculator:id/result")
//	private MobileElement Result;
//	@AndroidFindBy(id = "com.miui.calculator:id/btn_c_s")
//	private MobileElement btnClear;
	
	public void calcTambah() {
		driver.findElement(btnSatu).click();
		driver.findElement(btnTambah).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnEquals).click();
	}
	public void calcKurang() {
		driver.findElement(btnEmpat).click();
		driver.findElement(btnKurang).click();
		driver.findElement(btnTiga).click();
		driver.findElement(btnEquals).click();
	}
	public void calcKali() {
		driver.findElement(btnTiga).click();
		driver.findElement(btnKali).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnEquals).click();
	}
	public void calcBagi() {
		driver.findElement(btnEmpat).click();
		driver.findElement(btnBagi).click();
		driver.findElement(btnDua).click();
		driver.findElement(btnEquals).click();
	}
	//public String getResult
	public String getResult() {
		return driver.findElement(result).getText();
	}
	
//	public void calcTambah() {
//		btnSatu.click();
//		btnTambah.click();
//		btnDua.click();
//		btnEquals.click();
//		btnClear.click();
//	}
//	public void calcKurang() {
//		btnEmpat.click();
//		btnKurang.click();
//		btnTiga.click();
//		btnEquals.click();
//		btnClear.click();
//	}
//	public void calcKali() {
//		btnTiga.click();
//		btnKali.click();
//		btnDua.click();
//		btnEquals.click();
//		btnClear.click();
//	}
//	public void calcBagi() {
//		btnEmpat.click();
//		btnBagi.click();
//		btnDua.click();
//		btnEquals.click();
//		btnClear.click();
//	}
//	public String getTxtResult() {
//		return Result.getText();
//	}
	public void clear(){
		driver.findElement(btnclear).click();
	}
}
