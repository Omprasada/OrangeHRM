package com.LoginSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("User enters into LoginPage")
	public void user_enters_into_login_page() {
	    System.out.println("Step1: User is on LoginPage");
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String uname, String pswd) {
	    System.out.println("Step2: User enter uname and pswd");
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pswd);
	}

	@And("Click on LoginBtn")
	public void click_on_login_btn() {
	    System.out.println("Step3: Clicking on LoginBtn");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

	@Then("User lands on HomePage")
	public void user_lands_on_home_page() {
	    System.out.println("Step4: User lands on HomePage");
	    driver.close();
	}

}
