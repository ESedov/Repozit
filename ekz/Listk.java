import java.util.Scanner;

/**
 * 
 * @author ���� �����	
 * ������ ��-71
 * �������: ����������� Generic �����-��������� � ��� ����������
 * ������������ WildCards
 * ������������������ ����������� �������������� ������
 * ����������� 3-4 JavaUnit �����
 * ������������ JavaDoc
 * � ������ ��������� � �������� ���������� ������������ ������. 
 * ���� ������ ������ �������� ������������� Generic �����-��������� c �������������� WildCards
 * ������ ����� ������������� ����������� ���������� ������ ����������, �� ��������, ������, 
 * �������� �������(������ ����� ������������ WildCards), ������� ������, 
 * � ��� �� �������� ����� ������ � �������� �� ������� ������
 * �����: � �������� ������������� Generic �����-���������, ������ ����������� WildCards, � ��� ��
 * ������������ ����� ��� ���������. 
 * 
 *
 */
public class Listk {
	static Gener<Integer> list = new Gener<Integer>();
	private static Scanner sc;
	static int num;
	static int chisl;
	static int len;
	/**
	 * @method printf ������� �� ����� ��������� ����������
	 * 1. ���� �� ������.
	 * 2. ������� ����� ������.
	 * 3. �������� ������
	 * ����� ������������ ������ length(), empty(), get()
	 */
    static void printf(String str) {
        System.out.printf("��������� ������ %s:\n", str);
        if (list.empty()) {
            System.out.print("������");
        }
        else {
            System.out.print("�� ������");
        }
        len = list.length();
        System.out.printf(", �����: %d", len);
        if (len > 0) {
            System.out.print(", ��������:");
            for (int i=0; i<len; i++) {
                System.out.printf(" %d", list.get(i));
            }
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] arg) {
    	setSc(new Scanner(System.in));
        printf("��� ������ ���������");
        
        /**
         * ���������� ������ ����������
         * ����� ����������� ����� insert()
         */
        
        System.out.println("1. ���������� ������ ����������");
        for (int i=0; i<5; i++) {
        	System.out.print("������� ������� [" + (i+1) + "]= ");
            list.insert(i, sc.nextInt());
        }
        printf("����� ���������� ��������");
        
        /**
         * �������� �������� �� ������ �������
         * ����� ����������� ����� delete()
         */
        
        System.out.println("2. �������� ��������");
        
        int delEl;
        do
        {
        	System.out.print("������� ����� ��������, ������� ����� ������� ");
        	delEl = sc.nextInt() - 1;
        }while((delEl<0) || (delEl>len));
        list.delete(delEl);
        printf("����� ���������� ��������");
        
        /**
         * ������� ������ �������� �� ������ �������
         * ����� ����������� ����� insert()
         */
        
        System.out.println("4. ������� ������ �������� ");
        do
        {
        	System.out.print("������� ����� ������� ���� �������� ����� ");
        	num = sc.nextInt() - 1;
        }while((num<0) || (num>len));
        System.out.print("������� ����� ");
        chisl = sc.nextInt();
        list.insert(num, chisl);
        printf("����� ���������� ��������");
        
        /**
         * ������ �������� �� ������ ������� 
         * ����� ����������� ����� set()
         */
        
        System.out.println("5. ������ �������� �������� �� ������");
        do
        {
        	System.out.print("������� ����� ������� ������� ����� �������� ");
        	num = sc.nextInt() - 1;
        }while((num<0) || (num>len));
        System.out.print("������� ����� ");
        chisl = sc.nextInt();
        list.set(num, chisl);
        printf("����� ���������� ��������");
        
        /**
         * �������� ������� � ����� ������
         * ����� ����������� ����� insertList()
         */
        
        System.out.println("6. �������� �������");
        Gener<Integer> list2 = new Gener<Integer>();
        for (int i=0; i<5; i++) {
            list2.insert(0, i);
        }
        list.insertList(len, list2);
        printf("����� ���������� ��������");

        /**
         * �������� ������
         * ����� ����������� ����� clear()
         */
        
        System.out.println("7. ������� ������");
        list.clear();
        printf("����� ���������� ��������");
    }
	public static Scanner getSc() {
		return sc;
	}
	public static void setSc(Scanner sc) {
		Listk.sc = sc;
	}
}
