
public interface Gen<T> 
{
	/**
	 * @method length ���������� ������� ����� ������
	 * @return
	 */
	int length();
	/**
	 * @method empty ���������� �������� null ���� ������ ����
	 * @return
	 */
	boolean empty();
	/**
	 * @method get ���������� �������� �� ����� ������� ������
	 * @param pos ����� ������� � ������
	 * @return
	 */
	T get(int pos);
	/**
	 * @method set ������ �������� �� ������ ������� ������
	 * @param pos ����� ������� � ������
	 * @param value �������� �� ������� ����� ��������
	 */
	void set(int pos, T value);
	/**
	 * @method insert ������� �������� �� ������ ������� ������
	 * @param pos ����� ������� � ������
	 * @param value ��������, ������� ����� ��������
	 */
	void insert(int pos, T value);
	/**
	 * @method insertList ������� ������ �������� �� ������ ������� ������
	 * @param pos ����� ������� � ������
	 * @param values ��������(�����)
	 */
	void insertList(int pos, Gen<? extends T> values);
	/**
	 * @method delete �������� �������� �� ������ �� ������ �������
	 * @param pos ����� ������� � ������
	 */
	void delete(int pos);
	/**
	 * @method clear ������� ������
	 */
	void clear();
}
