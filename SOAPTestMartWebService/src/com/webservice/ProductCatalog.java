package com.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService //this means this class is a Web Service
public class ProductCatalog {

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Sports");
		return categories;
	}
	
}
