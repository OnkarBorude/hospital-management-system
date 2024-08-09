package common;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RestUtil {
	
	static ObjectMapper objectMapper=new ObjectMapper();
	
	public static <T>T postRequest(String url, Object objectBody, Class<?> responseClassType) throws IOException, InterruptedException{
		
		String strBody= objectMapper.writeValueAsString(objectBody);
		
		HttpClient client=HttpClient.newHttpClient();
		
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create(url)).header("Content-Type", "application/json") .POST(HttpRequest.BodyPublishers.ofString(strBody)).build();
		
		HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		
		T responseObject=(T)objectMapper.readValue(response.body(), responseClassType);
		
		return responseObject;
	}
	
	public static <T>T getRequest(String url, Class<?> responseClassType) throws IOException, InterruptedException{
		HttpClient client=HttpClient.newHttpClient();
		
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
		
		HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		
		T responseObject=(T)objectMapper.readValue(response.body(), responseClassType);
		return responseObject;
	}
	
	public static <T>T deleteRequest(String url, Class<?> responseClassType) throws IOException, InterruptedException{
		
		HttpClient client=HttpClient.newHttpClient();
		
		HttpRequest request=HttpRequest.newBuilder().uri(URI.create(url)).DELETE().build();
		
		HttpResponse<String> response=client.send(request, HttpResponse.BodyHandlers.ofString());
		
		T responseObject=(T)objectMapper.readValue(response.body(), responseClassType);
		
		return responseObject;
		
		
	}

}
