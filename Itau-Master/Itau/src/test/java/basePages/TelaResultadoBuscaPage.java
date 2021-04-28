package basePages;

import org.junit.Assert;

import interacoes.mobile.OrquestradorGestos;

public class TelaResultadoBuscaPage extends OrquestradorGestos
{
	private String preco;
	private String ano;
	private String marca_modelo;
	private String km;
	private String cambio;
	private String cor;

	public TelaResultadoBuscaPage()
	{
		super();
		this.preco = "br.com.icarros.androidapp:id/priceText";
		this.marca_modelo = "br.com.icarros.androidapp:id/makeAndModelText";
		this.ano = "br.com.icarros.androidapp:id/yearText";
		this.km = "br.com.icarros.androidapp:id/mileageText";
		this.cambio = "br.com.icarros.androidapp:id/transmissionText";
		this.cor = "br.com.icarros.androidapp:id/colorText";

	}

	public String getAno()
	{
		return ano;
	}

	public void setAno(String ano)
	{
		this.ano = ano;
	}

	public String getKm()
	{
		return km;
	}

	public void setKm(String km)
	{
		this.km = km;
	}

	public String getCambio()
	{
		return cambio;
	}

	public void setCambio(String cambio)
	{
		this.cambio = cambio;
	}

	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public String getPreco()
	{
		return preco;
	}

	public void setPreco(String preco)
	{
		this.preco = preco;
	}

	public String getMarca_modelo()
	{
		return marca_modelo;
	}

	public void setMarca_modelo(String marca_modelo)
	{
		this.marca_modelo = marca_modelo;
	}

	public String consultar(String elemento, String marca, String modelo)
	{
		String resultado_elemento = obterTexto(elemento);
		if (!resultado_elemento.equalsIgnoreCase(marca + " " + modelo))
		{

			Assert.fail();

		}
		return resultado_elemento;

	}

	public String consultar_elemento(String elemento, String valor_esperado)
	{
		String resultado_elemento = obterTexto(elemento);
		if (valor_esperado != null)
		{
			Assert.assertEquals(resultado_elemento, valor_esperado);

		}
		Assert.assertNotNull(resultado_elemento);
		return resultado_elemento;

	}

	public void validarTelaResultados(String elemento)
	{
		validarPresencaElemento(elemento);

	}

	public void arrastar()
	{
		rolarParaBaixo();
	}

}
