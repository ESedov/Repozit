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
            int n = rand.Next(10);
            int m = rand.Next(10);
            int[,] matr = new int[n,m];
            int[] posl = new int[n];
            int x;
           
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
            for (int i = 0; i < n; i++)
            {
                x = 0;
                for (int j = 0; j < m; j++)
                {
                    if (matr[i, j] > 0)
                        x = x + matr[i, j];
                }
                if (x > 0)
                    posl[i] = x/n;
                else
                    posl[i] = 0;
            }
            Console.WriteLine();
            Console.Write("Одномерный массив: ");
            for (int i = 0; i < n; i++)
            {
                Console.Write(posl[i] + " ");
            }
            Console.ReadLine();
        }
    }
}
