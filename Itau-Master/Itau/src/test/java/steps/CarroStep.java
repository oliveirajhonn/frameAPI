package steps;

import java.util.ArrayList;

import Objetos.Carro;
import basePages.TelaInicialPage;
import basePages.TelaResultadoBuscaPage;
import basePages.TelaTutorialPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import utility.ManipuladorJSON;

public class CarroStep
{
	private TelaInicialPage page = new TelaInicialPage();
	private TelaTutorialPage page2 = new TelaTutorialPage();
	private TelaResultadoBuscaPage page3 = new TelaResultadoBuscaPage();
	private ManipuladorJSON json = new ManipuladorJSON();
	private ArrayList<Carro> ar = new ArrayList<Carro>();
	Carro car1 = new Carro();
	Carro car2 = new Carro();

	@Dado("^acessar a tela tutorial do aplicativo$")
	public void acessar_a_tela_tutorial_do_aplicativo() throws Throwable
	{
		page2.validarTelaTutorial();
		page2.clicarNoBotaoPular();

	}

	@E("^acessar a tela inicial do aplicativo$")
	public void acessar_a_tela_inicial_do_aplicativo() throws Throwable
	{
		page.validarTelaInicial();
	}

	@Quando("^realizar a pesquisa de \"([^\"]*)\" e \"([^\"]*)\"$")
	public void realizar_a_pesquisa_de_e(String marca, String modelo) throws Throwable
	{
		page.clicarNoBotao(page.getSearch());
		page.pesquisar(page.getSearchTelaCheia(), marca, modelo);
		page.clicarNoBotao(page.getPesquisar());

	}

	@E("^validar as informacoes de \"([^\"]*)\" e \"([^\"]*)\"$")
	public void validar_as_informacoes_dos_carros_exibidos(String marca, String modelo) throws Throwable
	{

		page3.validarTelaResultados(page3.getPreco());

		car1.setModelo(page3.consultar(page3.getMarca_modelo(), marca, modelo));
		car1.setValor(page3.consultar_elemento(page3.getPreco(), car1.getValor()));
		car1.setAno(page3.consultar_elemento(page3.getAno().replace("'\'", ""), car1.getAno()));
		car1.setCambio(page3.consultar_elemento(page3.getCambio(), car1.getCambio()));
		car1.setCor(page3.consultar_elemento(page3.getCor(), car1.getCor()));
		car1.setKm(page3.consultar_elemento(page3.getKm(), car1.getKm()));
		page3.arrastar();

		car2.setModelo(page3.consultar(page3.getMarca_modelo(), marca, modelo));
		car2.setValor(page3.consultar_elemento(page3.getPreco(), car2.getValor()));
		car2.setAno(page3.consultar_elemento(page3.getAno().replace("'\'", ""), car2.getAno()));
		car2.setCambio(page3.consultar_elemento(page3.getCambio(), car2.getCambio()));
		car2.setCor(page3.consultar_elemento(page3.getCor(), car2.getCor()));
		car2.setKm(page3.consultar_elemento(page3.getKm(), car2.getKm()));

		ar.add(car1);
		ar.add(car2);
		System.out.println(ar.get(0).getAno());

	}

	@Então("^Salvar valores em um arquivo$")
	public void salvar_valores_em_um_arquivo() throws Throwable
	{
		json.escreverJson(ar);
	}

	@Então("^validar os valores armazenados por \"([^\"]*)\" e \"([^\"]*)\"$")
	public void validar_os_valores_armazenados(String marca, String modelo) throws Throwable
	{
		ArrayList<Carro> ar = json.lerJSON();

		car1 = new Carro(ar.get(0).getModelo(), ar.get(0).getAno(), ar.get(0).getKm(), ar.get(0).getCor(),
				ar.get(0).getCambio(), ar.get(0).getValor());
		car2 = new Carro(ar.get(1).getModelo(), ar.get(1).getAno(), ar.get(1).getKm(), ar.get(1).getCor(),
				ar.get(1).getCambio(), ar.get(1).getValor());

		validar_as_informacoes_dos_carros_exibidos(marca, modelo);

	}

}
