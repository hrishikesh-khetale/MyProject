using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PracticalTest1
{
    public class MyException : ApplicationException
    {

        public MyException(string mess) : base(mess) { }
    }

}

