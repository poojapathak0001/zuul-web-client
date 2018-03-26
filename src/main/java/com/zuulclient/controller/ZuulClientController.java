package com.zuulclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.zuulclient.model.Book;
import com.zuulclient.model.Hotel;


@Controller
public class ZuulClientController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/search")
	public String searchBooks(@RequestParam("author") String author, ModelMap map) {
		String uri="http://localhost:9000/api/orders/search-books/"+author;
		List<Book> bookList = restTemplate.getForObject(uri, List.class);
		map.addAttribute("bookList", bookList);
		return "final";
	}
	@RequestMapping(value="/order/{bookId}")
	public String orderBook(@PathVariable("bookId") int id,ModelMap map){
		String uri="http://localhost:9000/api/orders/one-book/"+id;
		String message = restTemplate.getForObject(uri,String.class);
		map.addAttribute("message", message);
		return "final"; 
	}
	@RequestMapping(value = "/showHotels")
	public String showHotels(ModelMap map) {
		String uri="http://localhost:9000/api/hotels/all-hotels";
		List<Hotel> hotelList = restTemplate.getForObject(uri, List.class);
		System.out.println(hotelList);
		map.addAttribute("hotelList", hotelList);
		return "hoteldetails";
	}
}
