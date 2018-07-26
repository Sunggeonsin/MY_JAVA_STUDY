package icehs.science.workshop3.book;

public class Book {
    
    private String isbn;
    private String title;
    private String author;
    private int    price;
    private String issueDate;
    
    public Book( String title, String author ) {
        this.title  = title;
        this.author = author;
    }
    
    public Book( String isbn, String title, String author, int price ) {
        //TODO 수정하시오
    }
    
    public Book( String isbn, String title, String author, int price, String issueDate ) {
        //TODO 수정하시오
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void printBookInfo() {
        
        System.out.print( "[제목] " + title + "\t[저자] " + author );
 
        //가격이 0이상일때 탭키를 사용해서 가격을 표시하시오.
      
        
        //발행일이 null값이 아닐때 발행일을 나타내도록 하는데 printDate 메서드를 사용해서 나타내시오.
        
        
        
        System.out.println();
    }
    
    private void printDate( String date ) {
        //TODO YYYY-MM-DD 의 형식으로 맞추어서 표시하도록 프로 그램하시오.
        
    }
}