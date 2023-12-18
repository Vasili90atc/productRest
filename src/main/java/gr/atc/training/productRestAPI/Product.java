package gr.atc.training.productRestAPI;

import java.util.ArrayList;

public class Product {
	public int id;
	public String title;
	public String description;
	public float price;
	public float discountPercentage;
	public float rating;
	public float stock;
	public String brand;
	public String category;
	public String thumbnail;
	public ArrayList<String> images;
	
	public Product(int id, String title, String description, float price, float discountPercentage, float rating,
			float stock, String brand, String category, String thumbnail, ArrayList<String> images) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.discountPercentage = discountPercentage;
		this.rating = rating;
		this.stock = stock;
		this.brand = brand;
		this.category = category;
		this.thumbnail = thumbnail;
		this.images = images;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", discountPercentage=" + discountPercentage + ", rating=" + rating + ", stock=" + stock + ", brand="
				+ brand + ", category=" + category + ", thumbnail=" + thumbnail + ", images=" + images + "]";
	}
	
}
