package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Objetos.Carro;

public class ManipuladorJSON
{
	public void escreverJson(ArrayList<Carro> ar)
	{

		JSONArray jsonArray = new JSONArray();

		for (int i = 0; i < ar.size(); i++)
		{
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Modelo", ar.get(i).getModelo());
			jsonObject.put("Ano", ar.get(i).getAno().replace("'\'", ""));
			jsonObject.put("Km", ar.get(i).getKm());
			jsonObject.put("Cor", ar.get(i).getCor());
			jsonObject.put("Cambio", ar.get(i).getCambio());
			jsonObject.put("Valor", ar.get(i).getValor());
			// jsonObject.put("Modelo", ar.get(i).getModelo());
			jsonArray.add(jsonObject);

		}
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Carros", jsonArray);

		FileWriter writeFile = null;

		try
		{
			writeFile = new FileWriter("resources\\saida.json");
			// Escreve no arquivo conteudo do Objeto JSON
			writeFile.write(jsonObject.toJSONString());
			writeFile.close();
		} catch (IOException e)
		{
			e.printStackTrace();
		}

		// Imprimne na Tela o Objeto JSON para vizualização
		System.out.println(jsonObject);

	}

	public ArrayList<Carro> lerJSON()
	{
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		// Cria o parse de tratamento
		JSONParser parser = new JSONParser();
		// Variaveis que irao armazenar os dados do arquivo JSON
		ArrayList<Carro> ar = new ArrayList<Carro>();

		try
		{

			// Salva no objeto JSONObject o que o parse tratou do arquivo
			jsonObject = (JSONObject) parser.parse(new FileReader("resources\\saida.json"));
			System.out.println(jsonObject);
			jsonArray = (JSONArray) jsonObject.get("Carros");
			System.out.println(jsonArray.size());

			for (int i = 0; i < jsonArray.size(); i++)
			{
				Carro carro = new Carro();
				// jsonArray.get(i);

				JSONObject jsonObject2 = new JSONObject();
				jsonObject2 = (JSONObject) jsonArray.get(i);

				carro.setModelo(jsonObject2.get("Modelo").toString());
				carro.setAno(jsonObject2.get("Ano").toString().replace("'\'", ""));
				carro.setKm(jsonObject2.get("Km").toString());
				carro.setCor(jsonObject2.get("Cor").toString());
				carro.setCambio(jsonObject2.get("Cambio").toString());
				carro.setValor(jsonObject2.get("Valor").toString());
				ar.add(carro);
				System.out.println(carro.getAno());
			}

		}

		// Trata as exceptions que podem ser lançadas no decorrer do processo
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		} catch (ParseException e)
		{
			e.printStackTrace();
		}

		return ar;
	}

}
