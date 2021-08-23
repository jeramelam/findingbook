import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public static List<Book> getBookList(){
		List<Book>bklist = new ArrayList<>();
		bklist.add(new Book(1,"book1",300));
		bklist.add(new Book(2,"book2",500));
		bklist.add(new Book(3,"abook3",100));
		return bklist;
	}

}
