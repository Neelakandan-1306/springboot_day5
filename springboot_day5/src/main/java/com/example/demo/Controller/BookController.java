package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bser;
	@PostMapping("addbook")
	public Book add(@RequestBody Book gs)
	{
		return bser.saveinfo(gs);
	}
	@GetMapping("bookshow")
	public List<Book> show(){
		return bser.showinfo();
	}
	@PutMapping("bookmap")
	public Book modify(@RequestBody Book ss)
	{
		return bser.changeinfo(ss);
	}
	@DeleteMapping("bookdel")
	public String delete(@RequestBody Book ss)
	{
		bser.delete(ss);
		return "Deleted successfully";
	}
	@DeleteMapping("bookdelid")
	public String deleteEmployee(@RequestParam int id) {
	    bser.deleteid(id);  
	    return "deleted beauttifully";
	}
}
