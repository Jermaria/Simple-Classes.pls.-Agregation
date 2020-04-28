package by.htp.homework.seventh.task09;

public class Main {

	public static void main(String[] args) {
		
		Library belkniga = new Library();
		
		belkniga.base.add(new Book (1, "War and Peace", "Lev Tolstoy", "Svetoch", 2017, 10000, 30.5, "hard"));
		belkniga.base.add(new Book (2, "Gone with the wind", "Margaret Mitchell", "Publisher", 2000, 1037, 20.10, "soft"));
		belkniga.base.add(new Book (3, "Animal Farm", "George Orwell", "Svetoch", 2018, 112, 15.5, "soft"));
		belkniga.base.add(new Book (4, "Anna Karenina", "Lev Tolstoy", "Svetoch", 2017, 1002, 30.5, "hard"));
		
		LibraryLogic logic = new LibraryLogic();
		Printer print = new Printer();
		
		print.printBase(logic.showBooksByAuthor(belkniga, "Lev Tolstoy"));
		System.out.println();
		
		print.printBase(logic.showBooksByPublisher(belkniga, "Svetoch"));
		System.out.println();
		
		print.printBase(logic.showBooksPublishedAfter(belkniga, 2016));

	}

}
