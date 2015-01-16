package Bibl;

import Bibl.BookPlace;
import Bibl.ResourceException;
import Bibl.BookSelect;

import Bibl.Book;
public class Book extends Thread{
    private BookSelect<BookPlace> bibl;
    public Book(BookSelect<BookPlace> bibl) {
        this.bibl = bibl;
    }

    public void run() {
    	BookPlace channel = null;
        try {
        	//do
        	//{
            channel = bibl.getResource(10000);
        	//}while (channel == null);
            System.out.println("���������� " + this.getId()
                    + " ���� ����� " + channel.getChannellId());
            channel.using();
        } catch (ResourceException e) {
            System.out.println("���������� " + this.getId() + " �� �������� "+e.getMessage());

        } finally {
            if (channel != null) {
                System.out.println("���������� " + this.getId() + " ��������� ����� "
                        + channel.getChannellId() );
                bibl.returnResource(channel);
            }
        }
    }

}
