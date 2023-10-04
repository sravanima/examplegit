package com.amdocs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class srav {

	public static void main(String[] args) {
	FirefoxDriver dr = new FirefoxDriver();
	dr.get("http://www.google.com");
	dr.manage().window().maximize();
	dr.findElement(By.id("APjFqb")).sendKeys("amazon");
	dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	dr.findElement(By.cssSelector(".eKjLze > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > a:nth-child(1) > h3:nth-child(2)")).click();
	dr.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
	dr.findElement(By.id("nav-search-submit-button")).click();
	dr.findElement(By.linkText("Samsung")).click();
	dr.navigate().to("https://www.amazon.in/Samsung-Segments-Smartphone-Octa-Core-Processor/dp/B0BZCSSNV7/ref=sr_1_2?keywords=Mobile&qid=1696415160&refinements=p_89%3ASamsung&rnid=3837712031&s=electronics&sr=1-2&th=1");
	dr.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	//System.out.println("Added to cart");
	}

}
