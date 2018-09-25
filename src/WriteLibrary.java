import ru.gorshckov.book.Book;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteLibrary {
    private static Book[] books = new Book[0];

    public static void main(String[] args) {

        try (
                FileOutputStream fos = new FileOutputStream("libr.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            addBooks();
            oos.writeObject(books);
        } catch (IOException e) {
            System.out.println("файл не записался.отсутствукт файл на диске.проверьте файл");
        }
    }


    /**
     *  Добавление книги в библиотеку
     * @param book = новая книга
     */

    public static void addBook(Book book) {
        final int newSize = books.length + 1;
        Book[] newBooks = new Book[newSize];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[newSize - 1] = book;
        books = newBooks;
    }

    private static void addBooks() {
        Book b1 = new Book("Война и Мир", "Л.Н.Толстой", 1865);
        addBook(b1);
        Book b2 = new Book("Турецкий Гамбит", "Б.Акунин", 1998);
        addBook(b2);
        Book b3 = new Book("Воровка книг", "Марк Зусак", 2005);
        addBook(b3);

    }



    }
