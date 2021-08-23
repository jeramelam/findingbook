import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookMain {
	public static void main(String[] args) {
		List<Book> lsb = BookDAO.getBookList();	
	//	Collections.sort(lsb, (a, b)-> a.getPage() - b.getPage());
		Collections.sort(lsb, new SortbyPage());
		for(Book ls: lsb) {
			System.out.println(ls);
		}		
	}
}
class SortbyPage implements Comparator<Book> {
    public int compare(Book a, Book b)
    {
        return a.getPage() - b.getPage();
    }
}
// consumer // predicate //
