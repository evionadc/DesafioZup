package Pages;

import org.openqa.selenium.By;

import Utils.Base;

public class produtoPage extends Base {
	
	public void addCarrinho() {
		
		clicarBotao(By.xpath("//*[@id='btn-buy']/div/span"));
	}

}
