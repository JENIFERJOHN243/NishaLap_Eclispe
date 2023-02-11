import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class API {

	public static void main(String[] args) throws IOException, ParseException {
		try {
			URL url = new URL("https://637cc19472f3ce38eaac9c29.mockapi.io/api/v1/leads/LEAD");
			HttpsURLConnection  httpsURLConnection = (HttpsURLConnection)url.openConnection();
			httpsURLConnection.setRequestMethod("GET");
			int responseCode =  httpsURLConnection.getResponseCode();
			System.out.println(responseCode);
			if(responseCode != 200)
			{
				System.out.println("Url MisMatched");
			}
			else
			{
				StringBuilder stringValue = new StringBuilder();
				Scanner reader = new Scanner(url.openStream());
				while(reader.hasNext()){  
					
					JSONParser parser = new JSONParser();
					JSONArray jsonArray = (JSONArray)parser.parse(reader.nextLine()); 
					//System.out.println(jsonArray);
					System.out.println(jsonArray.size());
					System.out.println(jsonArray.get(0));
					System.out.println(((JSONObject)jsonArray.get(0)).get("name"));
					}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
