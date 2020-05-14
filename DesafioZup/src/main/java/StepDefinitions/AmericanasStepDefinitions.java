package StepDefinitions;
import Pages.cartPage;
import Pages.homePage;
import Pages.produtoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmericanasStepDefinitions {
	
	homePage hp = new homePage();
	produtoPage pp = new produtoPage();
	cartPage cp = new cartPage();
	
	private static String _produto;
	@Given("que acessei o site pela url {string}")
	public void que_acessei_o_site_pela_url(String url) {
	    hp.acessarUrl(url);
	}

	@When("realizar a busca pelo produto {string}")
	public void realizar_a_busca_pelo_produto(String produto) {
	    // Write code here that turns the phrase above into concrete actions
		hp.realizarbusca(produto);
	}

	@When("clicar no produto {string}")
	public void clicar_no_produto(String produto) {
		_produto = hp.clicarnoProduto(produto);
	}

	@When("adicionar o produto {string} ao carrinho")
	public void adicionar_o_produto_mouse_ao_carrinho() {
	    // Write code here that turns the phrase above into concrete actions
		pp.addCarrinho();
	   
	}

	@Then("valido que a busca retornou o produto {string} corretamente no site.")
	public void valido_que_a_busca_retornou_o_produto_corretamente_no_site(String produto) {
		// Write code here that turns the phrase above into concrete actions
		hp.validarbuscadeproduto(produto);
	}
	
	@Then("valido que o produto foi adicionado corretamente ao carrinho de compras.")
	public void valido_que_o_produto_foi_adicionado_corretamente_ao_carrinho_de_compras() {
	    // Write code here that turns the phrase above into concrete actions
	    cp.validarProduto(_produto);
	}



	

}
