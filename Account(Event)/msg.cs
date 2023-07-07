using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PracticalTest1
{
    public class Message
    {
        public void Email(string n, int id, double amt, double b, int flag)
        {

            if (flag == 0)
                Console.WriteLine("YOU HAVE AN EMAIL: Mr.{0} your Account Number {1} has been credited by rs {2} your Current Balance is Rs.{3}", n, id, amt, b);
            else
                Console.WriteLine("YOU HAVE AN EMAIL:Mr.{0} your Account Number {1} has been credited by rs {2} your Current Balance is Rs.{3}", n, id, amt, b);

        }

        public void Sms(string n, int id, double amt, double b, int flag)
        {

            if (flag == 0)
                Console.WriteLine("YOU HAVE A SMS: Mr.{0} your Account Number {1} has been credited by rs {2} your Current Balance is Rs.{3}", n, id, amt, b);
            else
                Console.WriteLine("YOU HAVE A SMS: Mr.{0} your Account Number {1} has been credited by rs {2} your Current Balance is Rs.{3}", n, id, amt, b);

        }

    }
}

