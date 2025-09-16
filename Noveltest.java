package Bu_Pasha;

public class Noveltest {
    public static void main(String[] args) {
        Novel berkahpagi = new Novel(4714, "eel", "Slice of Life", "Berkah Pagi", 50000.0 );
        berkahpagi.display();
        Novel pamantua = new Novel(1447, "eel", "Slice of Life", "Paman Tua", 50000);
        pamantua.display();

        Novel pemuda = new Novel(0, null, null, null, 0);
        pemuda.setISBN(7441);
        pemuda.setTitle("Pemuda");
        pemuda.setAuthor("eel");
        pemuda.setGenre("Slice of Life");
        pemuda.setPrice(50000.0);
        pemuda.display();
    }
}
