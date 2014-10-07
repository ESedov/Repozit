import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Егор
 * @version 1
 *
 */
public class LinkListMain 
{
	private static List<String> cars1;
	private static List<String> cars2;
	private static List<String> cars3;
	/**
	 * @param symbl переменная, считывающая нажатие цифры для меню
	 */
	private static int symbl;
	private static Scanner sc;
	/**
	 * Метод infoList() выводит две коллекции. 
	 * Изначально пустые. 
	 * Первая коллекция основная. 
	 * В ней происходит добавление новых элементов и удаление элементов
	 * <p> Вторая коллекциия(Клоннированая) служит для примера слияния двух коллекций.
	 */
	public static void infoList()
	{
		System.out.println("Основная коллекция: " + cars1);
		System.out.println("Клоннированная коллекция: " + cars2);
	}
	/**
	 * 
	 * Метод enterList() добавляет новый элемент в коллекцию.
	 */
	public static void enterList()
	{
		System.out.println("Введите элемент: ");
		String str = sc.next();
		cars1.add(str);
		System.out.println("Добавлено");
	}
	/**
	 * 
	 * Метод removeList() Просит ввести номер элементе в коллекции,
	 * который следует удалить. 
	 * <p> Если вы ввели индекс превышающий размер коллекции, вы будете возвращенны в главное меню
	 */
	public static void removeList()
	{
		System.out.println("Введите номер элемента в коллекции, который следует удалить: ");
		int index = sc.nextInt()-1;
		if(index > cars1.size())
			System.out.println("Слишком большой индекс, вы будете перенаправлены в главное в меню");
			else
			{
		cars1.remove(index);
		System.out.println("Элемент удалён");
			};
	}
	/**
	 * Метод cloneList() клонирует основную коллекцию.
	 */
	public static void cloneList()
	{
		cars2.removeAll(cars2);
		cars2.addAll(cars1);
		System.out.println("Коллекция успешно клонированна");
	}
	/**
	 * Метод maxList() находит максимальный элемент в коллекции.
	 * <p> Если коллекция пуста, программа выдаст соответствующее сообщение
	 * и перенаправит в главное меню.
	 * 
	 */
	public static void maxList()
	{
		if(cars1.isEmpty())
		{
			System.out.println("Коллекция пуста");
		}
		else
		{
			cars3.addAll(cars1);
			Collections.sort(cars3);
			Collections.reverse(cars3);
			System.out.println("Максимальный элемент в коллекции: " + cars3.get(0));
			cars3.removeAll(cars3);
		}
		
	}
	/**
	 * Метод sortList() Сортирует главную коллекцию по возрастанию
	 */
	public static void sortList()
	{
		Collections.sort(cars1);
		System.out.println("Коллекция успешно отсортированна");
	}
	public static void menu()
	{
		System.out.println("1. Просмотреть коллекцию");
		System.out.println("2. Добавить в коллекцию");
		System.out.println("3. Отсортировать коллекцию");
		System.out.println("4. Клонировать коллекцию");
		System.out.println("5. Удалить элемент в коллекции");
		System.out.println("6. Слить коллекцию с клонированной коллекцией");
		System.out.println("7. Найти максимальный элемент в коллекции");
		System.out.println("8. Очистить коллекции");
		System.out.println("9. Выход");
	}
	/**
	 * Метод plusList() Сливает клонированную коллекцию с главной коллекцией.
	 * Результат записывается в главную коллекцию
	 */
	public static void plusList()
	{
		cars1.addAll(cars2);
		System.out.println("Коллекции успешно слиты");
	}
	/**
	 * Метод clearList() очищает обе коллекции
	 */
	public static void clearList()
	{
		cars1.clear();
		cars2.clear();
		System.out.println("Коллекции очищены");
	}
	public static <E> void main(String[] args)
	{
		//1ListClass<E> ListClass1 = new ListClass<E>();
		setcars1(new LinkedList<String>());
		setcars2(new LinkedList<String>());
		setcars3(new LinkedList<String>());
		setSc(new Scanner(System.in));
		while(symbl != 9)
		{
			menu();
			symbl = sc.nextInt();
			switch(symbl)
			{
			case 1: 
				infoList();
				System.out.println();
				break;
			
			case 2: 
				enterList();
				System.out.println();
				break;
			case 3: 
				sortList();
				System.out.println();
				break;
			case 4: 
				cloneList();
				System.out.println();
				break;
			case 5: 
				removeList();
				System.out.println();
				break;
			case 6: 
				plusList();
				System.out.println();
				break;
			case 7: 
				maxList();
				System.out.println();
			break;
			case 8:
				clearList();
				System.out.println();
				break;
			case 9:
				System.out.println("Покедова");
				break;
			}
			}
		}
		
		
	

	public static List<String> getcars2() 
	{
		return cars2;
	}

	public static void setcars2(List<String> cars2) 
	{
		LinkListMain.cars2 = cars2;
	}

	public static List<String> getcars1() 
	{
		return cars1;
	}

	public static void setcars1(List<String> cars1) 
	{
		LinkListMain.cars1 = cars1;
	}

	public static Scanner getSc() 
	{
		return sc;
	}

	public static void setSc(Scanner sc) 
	{
		LinkListMain.sc = sc;
	}

	public static int getSymbl() 
	{
		return symbl;
	}

	public static void setSymbl(int symbl) 
	{
		LinkListMain.symbl = symbl;
	}

	public static List<String> getcars3() {
		return cars3;
	}

	public static void setcars3(List<String> cars3) {
		LinkListMain.cars3 = cars3;
	}
}
