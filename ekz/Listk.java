import java.util.Scanner;

/**
 * 
 * @author Егор Седов	
 * Группа АП-71
 * Задание: Разработать Generic класс-интерфейс и его наследника
 * Использовать WildCards
 * Продемонстрировать возможности разработанного класса
 * Разработать 3-4 JavaUnit теста
 * Документация JavaDoc
 * В данной программе в качестве наследника используется список. 
 * Цель данной работы научится разрабатывать Generic класс-интерфейс c использованием WildCards
 * Данный класс демонстрирует возможность заполнения списка элементами, их удаления, замены, 
 * массовой вставки(именно здесь используется WildCards), очистки списка, 
 * а так же проверка длины списка и проверка на пустоту списка
 * Вывод: Я научился разрабатывать Generic класс-интерфейс, изучил возможности WildCards, а так же
 * разрабтывать тесты для программы. 
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
	 * @method printf выводит на экран следующую информацию
	 * 1. Пуст ли список.
	 * 2. Текущая длина списка.
	 * 3. Элементы списка
	 * Здесь использованы методы length(), empty(), get()
	 */
    static void printf(String str) {
        System.out.printf("Состояние списка %s:\n", str);
        if (list.empty()) {
            System.out.print("пустой");
        }
        else {
            System.out.print("НЕ пустой");
        }
        len = list.length();
        System.out.printf(", длина: %d", len);
        if (len > 0) {
            System.out.print(", элементы:");
            for (int i=0; i<len; i++) {
                System.out.printf(" %d", list.get(i));
            }
        }
        System.out.println();
        System.out.println();
    }
    public static void main(String[] arg) {
    	setSc(new Scanner(System.in));
        printf("при старте программы");
        
        /**
         * Заполнение списка значениями
         * Здесь использован метод insert()
         */
        
        System.out.println("1. Заполнение списка элементами");
        for (int i=0; i<5; i++) {
        	System.out.print("Введите элемент [" + (i+1) + "]= ");
            list.insert(i, sc.nextInt());
        }
        printf("после выполнения операции");
        
        /**
         * Удаление элемента по номеру позиции
         * Здесь использован метод delete()
         */
        
        System.out.println("2. Удаление элемента");
        
        int delEl;
        do
        {
        	System.out.print("Введите номер элемента, который нужно удалить ");
        	delEl = sc.nextInt() - 1;
        }while((delEl<0) || (delEl>len));
        list.delete(delEl);
        printf("после выполнения операции");
        
        /**
         * Вставка нового элемента по номеру позиции
         * Здесь использован метод insert()
         */
        
        System.out.println("4. Вставка нового элемента ");
        do
        {
        	System.out.print("Введите номер позиции куда вставить число ");
        	num = sc.nextInt() - 1;
        }while((num<0) || (num>len));
        System.out.print("Введите число ");
        chisl = sc.nextInt();
        list.insert(num, chisl);
        printf("после выполнения операции");
        
        /**
         * Замена значения по номеру позиции 
         * Здесь использован метод set()
         */
        
        System.out.println("5. Замена значения элемента по номеру");
        do
        {
        	System.out.print("Введите номер позиции которую нужно изменить ");
        	num = sc.nextInt() - 1;
        }while((num<0) || (num>len));
        System.out.print("Введите число ");
        chisl = sc.nextInt();
        list.set(num, chisl);
        printf("после выполнения операции");
        
        /**
         * Массовая вставка в конец списка
         * Здесь использован метод insertList()
         */
        
        System.out.println("6. Массовая вставка");
        Gener<Integer> list2 = new Gener<Integer>();
        for (int i=0; i<5; i++) {
            list2.insert(0, i);
        }
        list.insertList(len, list2);
        printf("после выполнения операции");

        /**
         * Очищение списка
         * Здесь использован метод clear()
         */
        
        System.out.println("7. Очистка списка");
        list.clear();
        printf("после выполнения операции");
    }
	public static Scanner getSc() {
		return sc;
	}
	public static void setSc(Scanner sc) {
		Listk.sc = sc;
	}
}
