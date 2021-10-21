package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseclass{
	
	@And("verify HomePage")
	public void verifyHomePage() {
		String title = driver.getTitle();
		if (title.contains("Products – Sola Paygo")) {
			System.out.println("verified");
		} else
			System.out.println("Not matchhing");

	}
	
	@When("click On Complete Package")
	public void clickOnCompletePackage() {
		driver.findElement(By.xpath("//ul[@class='product-categories']/li[1]")).click();

	}
	
	@And("select D180 Package")
	public void selectD180Package() {
		driver.findElement(By.xpath("//a[text()='D180 – Solar Home System']")).click();

	}
	
	@And("click Add To Cart")
	public void clickAddToCart() {
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

	}
	
	@And("verify Product D180 Added To Cart")
	public void verifyProductD180AddedToCart() {
		String cart1 = driver.findElement(By.xpath("//td[@class='product-name']//a")).getText();
        if (cart1.contains("D180 - Solar Home System")) {
			System.out.println("D180 - Solar Home System added in cart");
		} else
			System.out.println("Not added");

	}
	
	@And("click On Continue Shop")
	public void clickOnContinueShop() {
		driver.findElement(By.xpath("//a[text()='Continue shopping']")).click();

	}
	
	@And("select M100 Package")
	public void selectM100Package() {
		 driver.findElement(By.xpath("//a[text()='M100 – CONNECT LIKE NEVER BEFORE']")).click();

	}
	
	@And("verify Product M100 Added To Cart")
	public void verifyProductM100AddedToCart() {
		 String cart2 = driver.findElement(By.xpath("(//td[@class='product-name']//a)[2]")).getText();
	        if (cart2.contains("M100 - CONNECT LIKE NEVER BEFORE")) {
				System.out.println("M100 - CONNECT LIKE NEVER BEFORE added in cart");
			} else
				System.out.println("Not added");

	}
	
	@And("final Amount In Cart")
	public void finalAmountInCart() {
		 String FinalAmt = driver.findElement(By.xpath("//table[@class='shop_table shop_table_responsive']//td")).getText();
	        System.out.println("Final amount is: " + FinalAmt);

	}
	
	@Then("proceed Check out")
	public void proceedCheckout() {
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();

	}


}
