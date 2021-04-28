package interacoes.mobile;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import utility.Hook;

public class OrquestradorGestos
{

	private Log logger = LogFactory.getLog(OrquestradorGestos.class);

	private AndroidDriver<?> driver;

	public OrquestradorGestos()
	{
		this.driver = Hook.getDriver();
	}

	protected void inserirTexto(String elemento, String valor)
	{
		try
		{
			logger.info(" -- Inserindo texto: '" + valor + "' no elemento: '" + elemento + "', no dispositivo");
			clicarEm(elemento);
			if (driver.isKeyboardShown())
			{
				esconderTeclado();
			}

			driver.findElement(By.id(elemento)).sendKeys(valor);
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possivel localizar o elemento: '" + elemento
					+ "' em tela.");
		}
	}

	protected void esconderTeclado()
	{

		try
		{
			if (driver.isKeyboardShown())
			{

				driver.hideKeyboard();
				
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	protected void clicarEm(String elemento)
	{
		try
		{
			logger.info(" -- Acionando elemento: '" + elemento + "' no dispositivo");
			driver.findElement(By.id(elemento)).click();
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possivel localizar o elemento: '" + elemento
					+ "' em tela.");
		}
	}

	/*
	 * Valida se elemento existe, falha o cenario caso NAO exista.
	 */
	public boolean validarPresencaElemento(String elemento)
	{
		logger.info(" -- Verificando existencia de elemento: '" + elemento + "', no dispositivo");
		try
		{
			driver.findElement(By.id(elemento));
			logger.info(" -- Elemento: '" + elemento + "' encontrado no dispositivo");
			return true;
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possa�vel localizar o elemento: '" + elemento
					+ "' em tela.");
			return false;
		}
	}

	/*
	 * Somente informa se elemento existe ou nao existe
	 * 
	 */
	public boolean verificarElemento(String elemento)
	{
		logger.info(" -- Verificando existencia de elemento: '" + elemento + "', no dispositivo");
		try
		{
			driver.findElement(By.id(elemento));
			logger.info(" -- Elemento: '" + elemento + "' encontrado no dispositivo");
			return true;
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			return false;
		}
	}

	public String obterTexto(String elemento)
	{
		try
		{
			logger.info(" -- Verificando existencia de elemento: '" + elemento + "', no dispositivo");
			return driver.findElement(By.id(elemento)).getText();
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possivel localizar o elemento: '" + elemento
					+ "' em tela.");
			return "";
		}
	}

	public String obterTextoXpath(String elemento)
	{
		try
		{
			logger.info(" -- Verificando existencia de elemento: '" + elemento + "', no dispositivo");
			return driver.findElement(By.xpath(elemento)).getText();
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possivel localizar o elemento: '" + elemento
					+ "' em tela.");
			return "";
		}
	}

	public List<String> obterTextos(String elemento)
	{
		try
		{
			logger.info(" -- Verificando existencia de elemento: '" + elemento + "', no dispositivo");
			System.out.println(driver.findElements(By.id(elemento)).size() + " tamanho");
			return (List<String>) driver.findElements(By.id(elemento));
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possivel localizar o elemento: '" + elemento
					+ "' em tela.");
		}
		return null;
	}

	public void pressionar(WebElement elemento)

	{
		TouchAction action = new TouchAction(driver);
		action.longPress(longPressOptions().withElement(element(elemento))).perform().release();

	}

	@SuppressWarnings("unused")
	protected void aguardarElementoPor(String elemento, int tempo)
	{
		try
		{
			WebElement elementoEsperado = (new WebDriverWait(driver, tempo))
					.until(ExpectedConditions.presenceOfElementLocated(By.id(elemento)));
		} catch (Exception exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possivel localizar o elemento: '" + elemento
					+ "' em tela.");
		}
	}

	/*
	 * Replicando gestos anteriores, porem com utilizacao do 'Xpath' no lugar de
	 * 'ID'.
	 */

	protected void inserirTextoPorXPath(String elemento, String valor)
	{
		try
		{
			logger.info(" -- Inserindo texto: '" + valor + "' no elemento: '" + elemento + "', no dispositivo");
			driver.findElement(By.xpath(elemento)).sendKeys(valor);
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possivel localizar o elemento: '" + elemento
					+ "' em tela.");
		}
	}

	protected void clicarEmPorXpath(String elemento)
	{
		try
		{
			logger.info(" -- Acionando elemento: '" + elemento + "' no dispositivo");
			driver.findElement(By.xpath(elemento)).click();
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possa�vel localizar o elemento: '" + elemento
					+ "' em tela.");
		}
	}

	/*
	 * Valida se elemento existe, falha o cenario caso NAO exista.
	 * 
	 */
	public boolean validarPresencaElementoPorXpath(String elemento)
	{
		logger.info(" -- Verificando existencia de elemento: '" + elemento + "', no dispositivo");
		try
		{
			driver.findElement(By.xpath(elemento));
			logger.info(" -- Elemento: '" + elemento + "' encontrado no dispositivo");
			return true;
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possa�vel localizar o elemento: '" + elemento
					+ "' em tela.");
			return false;
		}
	}

	/*
	 * Somente informa se elemento existe ou nao existe
	 * 
	 * 
	 */
	public boolean verificarElementoPorXpath(String elemento)
	{
		logger.info(" -- Verificando existencia de elemento: '" + elemento + "', no dispositivo");
		try
		{
			driver.findElement(By.xpath(elemento));
			logger.info(" -- Elemento: '" + elemento + "' encontrado no dispositivo");
			return true;
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			return false;
		}
	}

	public String obterTextoPorXpath(String elemento)
	{
		try
		{
			logger.info(" -- Verificando existencia de elemento: '" + elemento + "', no dispositivo");
			return driver.findElement(By.xpath(elemento)).getText();
		} catch (NoSuchElementException exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possivel localizar o elemento: '" + elemento
					+ "' em tela.");
			return "";
		}
	}

	
	protected void aguardarElementoPorXpath(String elemento, int tempo)
	{
		try
		{
			WebElement elementoEsperado = (new WebDriverWait(driver, tempo))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elemento)));
		} catch (Exception exc)
		{
			logger.warn(" -- Elemento: '" + elemento + "' NAO encontrado no dispositivo");
			Assert.fail(LocalDateTime.now() + " -- Teste falhado  NAO foi possivel localizar o elemento: '" + elemento
					+ "' em tela.");
		}
	}

	public void rolarParaBaixo()
	{
		int eixoX = driver.manage().window().getSize().width / 2;
		int eixoY = driver.manage().window().getSize().height * 4 / 5;
		int topoY = driver.manage().window().getSize().height / 8;

		String movimento = "baixo (Scroll Down).";

		realizarArraste(eixoX, eixoY, eixoX, topoY, movimento);
	}

	private void realizarArraste(int origemX, int origemY, int destinoX, int destinoY, String movimento)
	{
		logger.info(" -- Navegando para " + movimento);
		TouchAction pressionar = new TouchAction(driver);
		pressionar.longPress(PointOption.point(origemX, origemY)).moveTo(PointOption.point(destinoX, destinoY))
				.release().perform();
	}

}
