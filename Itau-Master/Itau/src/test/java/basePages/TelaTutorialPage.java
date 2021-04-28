package basePages;

import org.junit.Assert;

import interacoes.mobile.OrquestradorGestos;

public class TelaTutorialPage extends OrquestradorGestos
{

	private String btn_pular;

	public TelaTutorialPage()
	{
		super();
		this.btn_pular = "br.com.icarros.androidapp:id/skipButton";

	}

	public void validarTelaTutorial()
	{
		validarPresencaElemento(btn_pular);

	}

	public void clicarNoBotaoPular()
	{
		clicarEm(btn_pular);
	}
}
