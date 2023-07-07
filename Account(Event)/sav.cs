using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PracticalTest1
{
    public class Savings : Account
    {

        public Savings(string name, double bal) : base(name, bal)
        {
        }
        public override void withdraw(double amt)
        {
            if (Balance - amt < minbal)
                throw new MyException($"TRANSACTION FAILED: Mr{Name} Saving Account, Minimum Balance To Be Maintained is rs 1000 ");
            Balance -= amt;
            flag = 0;
            OnWithdraw(amt, flag);
        }

        public static double payInt(Account a)
        {
            Savings s = a as Savings;
            double pay = s.Balance * intRate;
            s.Balance = s.Balance + pay;
            return pay;
        }
    }
}
