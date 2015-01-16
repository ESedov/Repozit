package Bibl;
/**
 * @author ����� ����, ������� ������ ��-71.
 * ���� ������: ����������� ������������� ���������.
 * ������������ �����������, ��������������� ������� java.util.concurrent. 
 * �������:  ��������� ����������. �������� ��� ������ ��������� ����. 
 * �������� ����� ����� �� ���� ���� �����.
 * ���� ��� ����� ���������, �� ���������� �� ��� ������ ������������� ������� � ������.
 * ��������� ������ ��������� �� 7 ����. ���������� ����� ����� 1 �� 7 ����. 
 * ���� ��� ����� ������, ���������� ������.
 * � ���� ���������� ������ ������������ ������, 
 * � �������� ��������� ������������� ���������� � �������������� ��������;
 * ���������;
 * ����������� try/catch/finally.
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

