package Bibl;


import Bibl.BookPlace;
public class BookPlace 
{
	private int �hannellId;
    public BookPlace(int id) 
    {
    	this.�hannellId = id;
    }
    public void setChannellId(int id) 
    {
        this.�hannellId = id;
    }
    public int getChannellId() 
    {
        return �hannellId;
    }

    public void using() 
    {
        try {
            Thread.sleep(10000 + new java.util.Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
