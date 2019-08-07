package TestForm;

import org.testng.Assert;
import org.testng.annotations.Test;

import entregaFinal.AgreeClause;
import entregaFinal.CartButton;
import entregaFinal.CheckOutButton;
import entregaFinal.ConfirmButton;
import entregaFinal.FunctionalTest;
import entregaFinal.PaymentButton;
import entregaFinal.PaymentMethodButton;
import entregaFinal.ProductPrice;
import entregaFinal.ProductZero;
import entregaFinal.ReceiptButtom;
import entregaFinal.SearchBar;
import entregaFinal.SearchBarButtom;
import entregaFinal.ShippingButton;
import entregaFinal.ShippingMethodButton;
import entregaFinal.SignUpButtomLogin;
import entregaFinal.SignUpEmail;
import entregaFinal.SignUpLoginOption;
import entregaFinal.SignUpMyAccount;
import entregaFinal.SignUpPassword;




public class RegisterOrderFormTest extends FunctionalTest {

	@Test
	public void RegisterOrder(){
				
		driver.get(url);
		
		SignUpMyAccount sUMA = new SignUpMyAccount(driver);
		Assert.assertTrue(sUMA.isInitialized());
		
		SignUpLoginOption sULO = new SignUpLoginOption(driver);
		Assert.assertTrue(sULO.isInitialized());
		
		SignUpEmail sEMAIL = new SignUpEmail(driver);
		Assert.assertTrue(sEMAIL.isInitialized());
		sEMAIL.enterEmail("gs.salinas@gmail.com");
		
		SignUpPassword sPASS = new SignUpPassword(driver);
		Assert.assertTrue(sPASS.isInitialized());
		sPASS.enterPassword("darlina217");

		SignUpButtomLogin sBUTT = new SignUpButtomLogin(driver);
		Assert.assertTrue(sBUTT.isInitialized());
		ReceiptButtom rBUTT=sBUTT.submit();

		Assert.assertEquals("My Account", rBUTT.confirmationText());
		
		SearchBar sBAR = new SearchBar(driver);
		Assert.assertTrue(sBAR.isInitialized());
		sBAR.enterSearch("Samsung");
		
		
		SearchBarButtom bBUTT = new SearchBarButtom(driver);
		Assert.assertTrue(bBUTT.isInitialized());
		
		ProductZero pZERO=bBUTT.submit();
		Assert.assertTrue(pZERO.isInitialized());
		ProductPrice pPRIC =pZERO.ClickProductZero();
		
		Assert.assertEquals("Ex Tax: $200.00",pPRIC.getValueProductPrice().trim());
		
		CartButton cBUTT = new CartButton(driver);
		Assert.assertTrue(cBUTT.isInitialized());
		cBUTT.CartButtonClick();
		
		CheckOutButton kBUTT = new CheckOutButton(driver);
		Assert.assertTrue(kBUTT.isInitialized());
		kBUTT.CheckOutButtonClick();
		
				
		PaymentButton pBUTT = new PaymentButton(driver);
 		Assert.assertTrue(pBUTT.isInitialized());
		pBUTT.PaymentButtonClick();
		
		ShippingButton spBUTT = new ShippingButton(driver);
		Assert.assertTrue(spBUTT.isInitialized());
		spBUTT.ShippingButtonClick();
		
		ShippingMethodButton spmBUTT = new ShippingMethodButton(driver);
		Assert.assertTrue(spmBUTT.isInitialized());
		spmBUTT.ShippingMethodButtonClick();
		
		AgreeClause aBUTT = new AgreeClause(driver);
		Assert.assertTrue(aBUTT.isInitialized());
		aBUTT.AgreeClauseClick();
		
		PaymentMethodButton pmbBUTT = new PaymentMethodButton(driver);
		Assert.assertTrue(pmbBUTT.isInitialized());
		pmbBUTT.PaymentMethodButtonClick();
		
		ConfirmButton cmfBUTT = new ConfirmButton(driver);
		Assert.assertTrue(cmfBUTT.isInitialized());
		cmfBUTT.ConfirmButtonClick(); 
		
		
	}	
}