package Bibl;


import Bibl.BookPlace;
public class BookPlace 
{
	private int ÑhannellId;
    public BookPlace(int id) 
    {
    	this.ÑhannellId = id;
    }
    public void setChannellId(int id) 
    {
        this.ÑhannellId = id;
    }
    public int getChannellId() 
    {
        return ÑhannellId;
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
