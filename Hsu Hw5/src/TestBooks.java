import java.util.Scanner;
public class TestBooks {
    public static void main(String[] args){
        int numberBooks;
        int pages = 0;
        String publisher;
        Book biggestBook = null;
        double totalPages = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of books to review: ");
        numberBooks = scan.nextInt();
        scan.nextLine();
        for(int i=0; i < numberBooks; i++){
            pages = (int)((Math.random() * (100-1)) + 1);
            System.out.println("Enter a name for the publisher: ");
            publisher = scan.nextLine();
            Book book = new Book(pages,publisher);
            totalPages += pages;
            if(biggestBook == null || book.compareTo(biggestBook) == 1){
                biggestBook = book;
            }
        }
        double averagePages = totalPages/(numberBooks/1.0);
        System.out.println("The summary of the biggest book is " + biggestBook + " and the average number of pages is " + averagePages);
    }
}
