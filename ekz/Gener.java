class listI<T>
{	
	/**
	 * Объявление объекта
	 */
	T val;
	listI<T> next = null;
	/**
	 * Конструктор 
	 * Передача конструктору ссылки на объект типа T
	 */
	listI(T v)
	{
		val = v;
	}
	/**
	 * @method Next чтения поля next
	 * @return 
	 */
	public listI<T> getNext()
	{
		return next;
	}
	/**
	 * @method setnext запись поля next
	 * @param n
	 */
	public void setnext(listI<T> n)
	{
		next = n;
	}
	/**
	 * @method getVal чтениe поля val
	 * @return
	 */
	public T getVal()
	{
		return val;
	}
	/**
	 * @method setValue запись поля value
	 * @param v
	 */
	public void setValue (T v)
	{
		val = v;
	}
}
public class Gener<T> implements Gen<T>
{
	listI<T> nol = null;
	/**
	 * @method get возращает значение по номеру позиции списка
	 * @param pos позиция в списке
	 */
	@Override
	public T get(int pos) {
		// TODO Auto-generated method stub
		listI<T> cur = nol;
		for (int i = 0; i < pos; i++)
		{
			cur = cur.getNext();
		}
		return cur.getVal();
	}
	/**
	 * @method set заменяет значение по номеру позиции списка
	 */
	@Override
	public void set(int pos, T value) {
		// TODO Auto-generated method stub
		listI<T> cur = nol;
		for(int i = 0; i < pos; i++)
		{
			cur = cur.getNext();
		}
		cur.setValue(value);
	}
	/**
	 * @method insertList вставляет список значений по номеру позиции списка
	 * 
	 */
	@Override
	public void insertList(int pos, Gen<? extends T> values) {
		// TODO Auto-generated method stub
        int l = values.length();
        for (int i = 0; i < l; i++) {
            insert(pos+i, values.get(i));
        }
	}
	/**
	 * @method delete удаляет значение по номеру позиции списка
	 * 
	 */
	@Override
	public void delete(int pos) {
		// TODO Auto-generated method stub
        if (pos > 0) 
        {
            listI<T> cur = nol;
            for (int i=0; i<pos-1; i++) 
            {
                cur = cur.getNext();
            }
            listI<T> item = cur.getNext();
            cur.setnext(item.getNext());
        }
        else {
            listI<T> item = nol;
            nol = item.getNext();
        }
	}
	/**
	 * @method insert вставляет значение по номеру позиции списка
	 */
	@Override
	public void insert(int pos, T value) {
		// TODO Auto-generated method stub
        listI<T> item = new listI<T> (value);
        if (pos > 0) {
            listI<T> cur = nol;
            for (int i=0; i<pos-1; i++) {
                cur = cur.getNext();
            }
            item.setnext(cur.getNext());
            cur.setnext(item);
        }
        else {
            item.setnext(nol);
            nol = item;
        }
	}
	/**
	 * @method length возвращает текущую длинну списка
	 * 
	 */
	@Override
	public int length() {
		// TODO Auto-generated method stub
        listI<T> cur = nol;
        int l = 0;
        while (cur != null) 
        {
            cur = cur.getNext();
            l++;
        }
        return l;
	}
	/**
	 * @method empty проверяет пустой ли список
	 * 
	 */
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return nol == null;
	}
	/**
	 * @method clear очищает список
	 * 
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		nol = null;
	}

}
