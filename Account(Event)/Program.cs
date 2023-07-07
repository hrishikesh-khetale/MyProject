using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PracticalTest1
{
    public delegate void MyDel(string n, int id, double amt, double b, int f);
    public abstract class Account
    {

        readonly int id;
        static int setid;
        string name;
        double balance;
        public event MyDel fire;
        public const int minbal = 1000;
        protected int flag;
        protected static readonly double intRate = 0.1;

        static Account()
        {
            Console.WriteLine("************** Bank of Bharodara  *******************");
            setid = 0;
        }
        public Account(string name, double balance)
        {
            if (id >= 5)
                throw new MyException("No More Accounts");
            else
            {
                
                if (name.Length < 2 || name.Length > 15)
                    throw new MyException("DECLINED: Name range between 3 to 15 characters only");

                Name = name;
                Balance = balance;
                id = ++setid;
            }
        }

        public int Id
        {
            get { return id; }
        }

        public string Name
        {
            get
            {
                return name;
            }
            set { name = value; }
        }
        public double Balance
        {
            get
            {
                return balance;
            }
            protected set
            {
                balance = value;
            }
        }

        public abstract void withdraw(double amt);

        public void deposit(double amt)
        {

            Balance += amt;
            flag = 1;
            fire(Name, Id, amt, Balance, flag); //fire EVENT

        }

        public void OnWithdraw(double amt, int f)
        {

            fire(Name, Id, amt, Balance, f); //fire EVENT

        }



    }
}
