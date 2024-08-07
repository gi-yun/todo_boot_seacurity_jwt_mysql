package com.exam.dto;

import org.apache.ibatis.type.Alias;

@Alias("Sku")
public class Sku {

	
	int id;
	String name; 
	int price;
	String image;
	
	public Sku() {
		super();
	}

	public Sku(int id, String name, int price, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Sku [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + "]";
	} 
	
	
	
	
	
}
