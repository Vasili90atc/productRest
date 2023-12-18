package gr.atc.training.productRestAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class APIHandler {

	ArrayList<Product> products = null;
	
	public void fetch_and_parse_products() {
		String str_url = "https://dummyjson.com/products";
		StringBuffer content = new StringBuffer();
		try {
			URL url =  new URL(str_url);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
			    content.append(inputLine);
			}
			in.close();
			con.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Gson jsonReader = new Gson();
		ProductListWrapper plw = jsonReader.fromJson(content.toString(), new TypeToken<ProductListWrapper>(){}.getType());
		products = (ArrayList<Product>) plw.getProducts();
	}
	
	public void print_products() {
		System.out.println("Product Count: " + products.size());
		for (int i=0; i<products.size(); i++) {
			System.out.println(products.get(i));
		}
	}
}
