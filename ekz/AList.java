package Bibl;
/**
 * @author Седов Егор, студент группы АП-71.
 * Цель работы: Разработать многопоточное приложеие.
 * Использовать возможности, предоставляемые пакетом java.util.concurrent. 
 * Задание:  Маленькая библиотека. Доступны для чтения несколько книг. 
 * Читатель может брать на руки одну книгу.
 * Если все книги разобраны, то посетитель не ждёт больше определенного времени и уходит.
 * Программа создаёт коллекцию из 7 книг. Посетитель может взять 1 из 7 книг. 
 * Если все книги заняты, посетитель уходит.
 * В ходе выполнения данной лабораторной работы, 
 * Я научился создавать многопоточные приложения с использованием семафора;
 * Коллекций;
 * Конструкции try/catch/finally.
 */
import java.util.LinkedList;
import Bibl.Book;
import Bibl.BookSelect;
import Bibl.BookPlace;
public class AList {
		   public static void main(String[] args) {
		        LinkedList<BookPlace> list = new LinkedList<BookPlace>() {
		            {
		                this.add(new BookPlace(1));
		                this.add(new BookPlace(2));
		                this.add(new BookPlace(3));
		                this.add(new BookPlace(4));
		                this.add(new BookPlace(5));
		                this.add(new BookPlace(6));
		                this.add(new BookPlace(7));
		            }

		        };
		        int kolvo_pos = 20;
		        BookSelect<BookPlace> pool = new BookSelect<BookPlace>(list);
		        for (int i = 0; i < kolvo_pos; i++) {
		            new Book(pool).start();
		        }

		    }
}

