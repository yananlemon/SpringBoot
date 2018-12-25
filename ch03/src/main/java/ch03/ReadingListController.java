package ch03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;
@Controller
@RequestMapping("/")
public class ReadingListController {
	private ReadingListRepository readingListRepository;
	@Autowired
	public ReadingListController(
			ReadingListRepository readingListRepository) {
		this.readingListRepository = readingListRepository;
	}
	@RequestMapping(value="/books",method=RequestMethod.GET)
	public String readersBooks(
			Model model) {
		List<Book> readingList =
				readingListRepository.findAll();
		if (readingList != null) {
			model.addAttribute("books", readingList);
		}
		return "readingList";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home() {
	
		return "home";
	}
	
	@RequestMapping(value="/book", method=RequestMethod.POST)
	public String addToReadingList(Book book) {
		readingListRepository.save(book);
		return "redirect:/books";
	}
}
