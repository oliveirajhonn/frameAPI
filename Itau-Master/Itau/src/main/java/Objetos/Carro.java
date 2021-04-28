package Objetos;

public class Carro
{

	private String modelo;
	private String ano;
	private String km;
	private String cor;
	private String cambio;
	private String valor;

	public Carro(String modelo, String ano, String km, String cor, String cambio, String valor)
	{
		super();

		this.modelo = modelo;
		this.ano = ano;
		setKm(km);
		this.cor = cor;
		this.cambio = cambio;
		setValor(valor);
	}

	public Carro()
	{

	}

	public String getModelo()
	{
		return modelo;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
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

	public String getCor()
	{
		return cor;
	}

	public void setCor(String cor)
	{
		this.cor = cor;
	}

	public String getCambio()
	{
		return cambio;
	}

	public void setCambio(String cambio)
	{
		this.cambio = cambio;
	}

	public String getValor()
	{
		return valor;
	}

	public void setValor(String valor)
	{
		this.valor = valor;
	}

}
