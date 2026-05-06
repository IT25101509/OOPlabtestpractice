class Book{
    private String title;
    private String author;
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isShortBook(){
        if(getPageCount() < 200){
            return true;
        }
        else {
            return false;
        }
    }

    public void print(){
        System.out.println("Title : " + getTitle());
        System.out.println("Author : " + getAuthor());
        System.out.println("Page Count : " + getPageCount());
        if(isShortBook() == true){
            System.out.println("Book is a short book !");
        }
        else {
            System.out.println("Book is not a short book !");
        }
    }
}

 class Q3{
    public static void main(String[] args) {
        Book book1 = new Book("Crazy Town" , "Sterling R. Braswell" , 358);
        Book book2 = new Book("Charlie Gehringer" , "John C. Skipper" , 199);

        book1.print();
        System.out.println();
        book2.print();

    }
}