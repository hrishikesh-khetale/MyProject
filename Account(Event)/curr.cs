using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PracticalTest1
{
    public class Current : Account
    {

        public Current(string name, double bal) : base(name, bal)
        {
        }
        public override void withdraw(double amt)
        {
            if ((Balance - amt) < 0)
            {
                Console.WriteLine($"The amount entered is not avaiable so giving you loan of{amt}");
            }
            else
            {
                Balance -= amt;
                flag = 0;
                OnWithdraw(amt, flag);
            }

        }
    }
}
