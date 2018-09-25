import ru.gorshckov.book.Book;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadLibrary {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("libr.bin");
             ObjectInputStream ois = new ObjectInputStream(fis);) {

            Book[] books = (Book[]) ois.readObject();
            //System.out.println(Arrays.toString(books));
            ois.close();
            /**
             * Проверка состояния книг в библиотеке
             */
            System.out.println("список книг:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " " + book.getAuthorName() + " " + book.getYearofPublish());
            }


        } catch (IOException e) {
            System.out.println("Файл не найден.Возможно файл поврежден или удален.Проверьте файл");;
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка.класс Book не найден.Проверьте наличие класса");
        }
    }
}
