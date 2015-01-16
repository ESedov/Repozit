package Bibl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import Bibl.BookSelect;

public class BookSelect<T> {
	private final static int POOL_SIZE = 7; 
    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);
    private final Queue<T> resources = new LinkedList<T>();
    public BookSelect(Queue<T> source) {
        resources.addAll(source);
    }
    public T getResource(long maxWaitMillis) throws ResourceException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
            	T res;
                do
                {
            	res = resources.poll();
                }while(res == null);
                
                return res;
            }
        } catch (InterruptedException e) {
            throw new ResourceException(e);
        }
        throw new ResourceException("нужной книги");
    }
    public void returnResource(T res) {
        resources.add(res); 
        semaphore.release();
    }
}
