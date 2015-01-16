
public interface Gen<T> 
{
	/**
	 * @method length возвращает текущую длина списка
	 * @return
	 */
	int length();
	/**
	 * @method empty возвращает значение null если список пуст
	 * @return
	 */
	boolean empty();
	/**
	 * @method get возвращает значение по номер позиции списка
	 * @param pos номер позиции в списке
	 * @return
	 */
	T get(int pos);
	/**
	 * @method set замена значения по номеру позиции списка
	 * @param pos номер позиции в списке
	 * @param value значение на которое нужно заменить
	 */
	void set(int pos, T value);
	/**
	 * @method insert вставка значения по номеру позицию списка
	 * @param pos номер позиции в списке
	 * @param value значение, которое нужно вставить
	 */
	void insert(int pos, T value);
	/**
	 * @method insertList вставка списка значений по номеру позицию списка
	 * @param pos номер позиции в списке
	 * @param values значение(число)
	 */
	void insertList(int pos, Gen<? extends T> values);
	/**
	 * @method delete удаление значения из списка по номеру позиции
	 * @param pos номер позиции в списке
	 */
	void delete(int pos);
	/**
	 * @method clear очищает список
	 */
	void clear();
}
