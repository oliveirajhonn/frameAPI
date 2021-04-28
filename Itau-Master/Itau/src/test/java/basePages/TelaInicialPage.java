package basePages;

import interacoes.mobile.OrquestradorGestos;
import io.appium.java_client.android.AndroidDriver;

public class TelaInicialPage extends OrquestradorGestos
{
	private AndroidDriver<?> driver;
	private String search;
	private String btn_pesquisar;
	private String searchTelaCheia;

	public TelaInicialPage()
	{

		this.search = "br.com.icarros.androidapp:id/searchText";
		this.searchTelaCheia = "br.com.icarros.androidapp:id/fullSearchText";
		this.btn_pesquisar = "br.com.icarros.androidapp:id/searchButton";

	}

	public String getSearchTelaCheia()
	{
		return searchTelaCheia;
	}

	public void setSearchTelaCheia(String searchTelaCheia)
	{
		this.searchTelaCheia = searchTelaCheia;
	}

	public String getSearch()
	{
		return search;
	}

	public void setSearch(String search)
	{
		this.search = search;
	}

	public String getPesquisar()
	{
		return btn_pesquisar;
	}

	public void setPesquisar(String pesquisar)
	{
		this.btn_pesquisar = pesquisar;
	}

	public void pesquisar(String elemento, String marca, String modelo)
	{
		esconderTeclado();
		inserirTexto(elemento, marca + " " + modelo);
	}

	public void clicarNoBotao(String valor)
	{
		clicarEm(valor);
	}

	public void validarTelaInicial()
	{
		validarPresencaElemento(search);

	}

}
