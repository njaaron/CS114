public class Book {
    public int pages;
    public String publisher;
    public Book(int pages,String publisher){
        this.pages = pages;
        this.publisher = publisher;
    }
    public int getPages(){
        return pages;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setPublisher(){
        this.publisher = publisher;
    }
    public String toString(){
        return "publisher " + publisher + " and the amount of pages in the book is " + pages;
    }
    public boolean equals(Book book){
        if(pages == book.pages && publisher == book.publisher){
            return true;
        }
        else{
            return false;
        }
    }
    public int compareTo(Book otherBook){
        if(this.pages == otherBook.pages){
            return 0;
        }else if(this.pages < otherBook.pages){
            return -1;
        }else{
            return 1;
        }
    }
}
