package frameworks;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;



public class Mainclass extends Baseclass {

		public static void main(String[] args) throws IOException {
			
			getdriver("chrome");
            geturl(url);
			max();		
			PageFactory.initElements(driver, Element.class);

			clicks(signin);
			sk(username,"");
			sk(password,"");
			clicks(login);
         	clicks(tshirt);
			clicks(item);
			clicks(addtocart);
			explicitwait(proceed);
			clicks(proced);
			clicks(procedadd);
			clicks(checkbox);
			clicks(procedcr);
			clicks(cheque);
			clicks(order);
			screenshort(payment);
			
		}
}

