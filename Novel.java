package Bu_Pasha;

public class Novel {
    //property
    int ISBN;
    String title;
    String author;
    String genre;
    Double price;

    //construcktor parameter
    public Novel(int I, String a, String g, String t, double p) {
        ISBN = I;
        title = t;
        author = a;
        genre = g;
        price = p;
    }

    //getter
    public int getISBN(){
        return ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public double getPrice(){
        return price;
    }

    //setter
    public void setISBN(int I){
        ISBN = I;
    }
    public void setTitle(String t) {
        title = t;
    }
    public void setAuthor(String a){
        author = a;
    }
    public void setGenre(String g){
        genre = g;
    }
    public void setPrice(double p){
        price = p;
    }
    public void display(){
        System.out.println("=====================");
        System.out.println("ISBN: "+ ISBN);
        System.out.println("Judul: "+title);
        System.out.println("Pengarang "+ author );
        System.out.println("Genre: "+genre);
        System.out.println("Harga: "+price);
        System.out.println("=====Terimakasih=====");
    }
}

