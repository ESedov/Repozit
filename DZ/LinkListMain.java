import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author ����
 * @version 1
 *
 */
public class LinkListMain 
{
	private static List<String> cars1;
	private static List<String> cars2;
	private static List<String> cars3;
	/**
	 * @param symbl ����������, ����������� ������� ����� ��� ����
	 */
	private static int symbl;
	private static Scanner sc;
	/**
	 * ����� infoList() ������� ��� ���������. 
	 * ���������� ������. 
	 * ������ ��������� ��������. 
	 * � ��� ���������� ���������� ����� ��������� � �������� ���������
	 * <p> ������ ����������(�������������) ������ ��� ������� ������� ���� ���������.
	 */
	public static void infoList()
	{
		System.out.println("�������� ���������: " + cars1);
		System.out.println("�������������� ���������: " + cars2);
	}
	/**
	 * 
	 * ����� enterList() ��������� ����� ������� � ���������.
	 */
	public static void enterList()
	{
		System.out.println("������� �������: ");
		String str = sc.next();
		cars1.add(str);
		System.out.println("���������");
	}
	/**
	 * 
	 * ����� removeList() ������ ������ ����� �������� � ���������,
	 * ������� ������� �������. 
	 * <p> ���� �� ����� ������ ����������� ������ ���������, �� ������ ����������� � ������� ����
	 */
	public static void removeList()
	{
		System.out.println("������� ����� �������� � ���������, ������� ������� �������: ");
		int index = sc.nextInt()-1;
		if(index > cars1.size())
			System.out.println("������� ������� ������, �� ������ �������������� � ������� � ����");
			else
			{
		cars1.remove(index);
		System.out.println("������� �����");
			};
	}
	/**
	 * ����� cloneList() ��������� �������� ���������.
	 */
	public static void cloneList()
	{
		cars2.removeAll(cars2);
		cars2.addAll(cars1);
		System.out.println("��������� ������� ������������");
	}
	/**
	 * ����� maxList() ������� ������������ ������� � ���������.
	 * <p> ���� ��������� �����, ��������� ������ ��������������� ���������
	 * � ������������ � ������� ����.
	 * 
	 */
	public static void maxList()
	{
		if(cars1.isEmpty())
		{
			System.out.println("��������� �����");
		}
		else
		{
			cars3.addAll(cars1);
			Collections.sort(cars3);
			Collections.reverse(cars3);
			System.out.println("������������ ������� � ���������: " + cars3.get(0));
			cars3.removeAll(cars3);
		}
		
	}
	/**
	 * ����� sortList() ��������� ������� ��������� �� �����������
	 */
	public static void sortList()
	{
		Collections.sort(cars1);
		System.out.println("��������� ������� ��������������");
	}
	public static void menu()
	{
		System.out.println("1. ����������� ���������");
		System.out.println("2. �������� � ���������");
		System.out.println("3. ������������� ���������");
		System.out.println("4. ����������� ���������");
		System.out.println("5. ������� ������� � ���������");
		System.out.println("6. ����� ��������� � ������������� ����������");
		System.out.println("7. ����� ������������ ������� � ���������");
		System.out.println("8. �������� ���������");
		System.out.println("9. �����");
	}
	/**
	 * ����� plusList() ������� ������������� ��������� � ������� ����������.
	 * ��������� ������������ � ������� ���������
	 */
	public static void plusList()
	{
		cars1.addAll(cars2);
		System.out.println("��������� ������� �����");
	}
	/**
	 * ����� clearList() ������� ��� ���������
	 */
	public static void clearList()
	{
		cars1.clear();
		cars2.clear();
		System.out.println("��������� �������");
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
				System.out.println("��������");
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
