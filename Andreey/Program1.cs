using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Program
    {
        static void Main(string[] args)
        {
            Random rand = new Random();
            int n = rand.Next(5) + 1;
            int m = rand.Next(5) + 1;
            int[,] matr = new int[n,m];
            int[] posl = new int[n];
            int x;
            int max = 0;
            int maxS = 0;
            int num = 0;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    Console.Write("Введите " + "[ " + i + " ][ " + j + " ] =");
                    matr[i,j] = int.Parse(Console.ReadLine());
                }
            }
            Console.WriteLine("Сформированная матрица: ");
            for (int i = 0; i < n; i++)
            {
                Console.WriteLine();
                for (int j = 0; j < m; j++)
                {
                    Console.Write(matr[i, j] + " ");
                }
            }
            for (int j = 0; j < m; j++)
            {
                
                x = 0;
                for (int i = 0; i < n; i++)
                {
                    if (matr[i, j] == 0)
                    {
                        x++;
                        maxS++;
                    }
                }
                if (x >= max)
                {
                    max = x;
                    num = j;
                }
            }
            Console.WriteLine();
            if (num == m - 1) //Если количество нулей возрастает из столбца в столбец
            {
                Console.Write(" Количество Нулей " + maxS);
            }
            else //Если количество нулей не возрастает
                Console.Write(" Столбец в котором больше всего нулей" + num);
            Console.ReadLine();
        }
    }
}
