package com.example.readinglist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
/**
 * Book 资源类
 * @author yanan
 *
 */
@Path("/books")
@Component
public class BookResource {

	@Autowired
	private ReadingListRepository readingListRepository;
	
	
	@GET
	@Produces("application/json")
	public Books readersBooks() {
		List<Book> readingList =
				readingListRepository.findAll();
		Books books = new Books(readingList);
		return books;
	}
	
	/*@RequestMapping(value="/book", method=RequestMethod.POST)
	public String addToReadingList(Book book) {
		readingListRepository.save(book);
		return "redirect:/books";
	}*/
	
	
}
