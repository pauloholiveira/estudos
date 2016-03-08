package br.com.paulo.distanciaWS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@WebService
public class DistanciaWS {
	@WebMethod
	public /*static*/ double calculaDistancia(String origem, String destino) {
		URL url = null;
		try {
			url = new URL( ("http://maps.google.es/maps/api/directions/json?origin=" + origem + "&destination=" + destino + "&sensor=false").replaceAll("\\ ", "\\+") );
		} catch (MalformedURLException e) {
			
		}
 
        String json_result = getDocumento(url);
        
        return analisaXml(json_result);
		
	}
 
    private /*static*/ String getDocumento(URL url){
    	String json = "";
    	BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read); 

            json = buffer.toString();
            return json;
        } catch (IOException e) {
        	return json;
		} finally {
            if (reader != null){
				try {
					reader.close();
					return json;
				} catch (IOException e) {}
				return json;
            }
        }
    }
    
    private /*static*/ double analisaXml(String json) {
    	double dist = 0.0;
		try {
			JSONObject json_object = new JSONObject(json);
			JSONArray routes = json_object.getJSONArray("routes");
			
			JSONObject obj_routes = routes.getJSONObject(0);
			
			JSONArray legs = obj_routes.getJSONArray("legs");
			
			JSONObject obj_legs = legs.getJSONObject(0);
			
			JSONObject distance = obj_legs.optJSONObject("distance");
			
			String valor_distancia = distance.getString("text");
			
			valor_distancia = valor_distancia.replace(" km","");//3,2 km
			valor_distancia = valor_distancia.replace(",",".");
			
			dist = Double.parseDouble(valor_distancia);
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
        
		
        return dist;
    }
 /*
    public static void main(String[] args) {
        System.out.println(calculaDistancia("Rua Augusta, 500, Sao Paulo - SP",
                "Avenida Liberdade, 800, Sao Paulo - SP"));
    }*/
}
