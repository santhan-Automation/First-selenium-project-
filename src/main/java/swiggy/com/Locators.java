package swiggy.com;

import org.openqa.selenium.By;

public class Locators {
	
/************* Login Page ***************/
	public static By Login =By.xpath("//a[text()='Login']");
	public static By Phone =By.xpath("//input[@name='mobile']");
	public static By Submit =By.xpath("(//a[text()='Login'])[2]");
	public static By otp =By.xpath("//input[@name='otp']");
	public static By veryfyOtp =By.xpath("//a[text()='VERIFY OTP']");
	public static By create_An_account =By.xpath("//a[text()='create an account']");
	public static By signup =By.xpath("//a[text()='Sign up']");
	
	/********************sign-Up-page****************/
	public static By Mobilenumber =By.xpath("//input[@id='mobile']");
	public static By name =By.xpath("//input[@id='name']");
	public static By email =By.xpath("//input[@id='email']");
	public static By password =By.xpath("//input[@id='password']");
	public static By referal =By.xpath("//div[text()='Have a referral code?']");
	public static By Continue =By.xpath("//a[text()='CONTINUE']");
	
}
