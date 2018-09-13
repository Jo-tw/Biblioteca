class Book {
    private String name;


    private String author;
    private int year;


    Book(String name) {
        this.name = name;
        this.author = "Martin Fowler";
        this.year = 1992;
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.year = 1992;
    }

    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }


    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }
}
