package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;

@Service
public class BookService {
	@Autowired
	BookRepo br;
	public Book saveinfo(Book gs)
	{
		return br.save(gs);
	}
	public List<Book> showinfo()
	{
		return br.findAll();
	}
	public Book changeinfo(Book ss) {
		return br.saveAndFlush(ss);
	}
	public void delete(Book ss) {
		 br.delete(ss);
	}
	public void deleteid(int id) {
		br.deleteById(id);
	}
}
