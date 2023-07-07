
namespace PracticalTest1
{
    internal class Demo
    {
        static void Main(string[] args)
        {
            Message m = new Message();
            Account[] a = new Account[6];
            try
            {
                a[0] = new Savings("Ankur", 98765);
            }
            catch (MyException e)
            {
                Console.WriteLine(e.Message);
            }
            try
            {
                a[1] = new Current("Hrishikesh", 87432);
            }
            catch (MyException e)
            {
                Console.WriteLine(e.Message);
            }
            try
            {
                a[2] = new Savings("Swapnil", 10003);
            }
            catch (MyException e)
            {
                Console.WriteLine(e.Message);
            }
            try
            {
                a[3] = new Current("Kaustubh", 33789);

            }
            catch (MyException e)
            {
                Console.WriteLine(e.Message);
            }
            try
            {

                a[4] = new Current("Pratik", 78565);
            }
            catch (MyException e)
            {
                Console.WriteLine(e.Message);
            }
            try
            {
                a[5] = new Savings("Ganesh", 98765);
            }
            catch (MyException e)
            {
                Console.WriteLine(e.Message);
            }
            for (int i = 0; i < a.Length; i++)
            {
                try
                {
                    a[i].fire += m.Email;
                    a[i].fire += m.Sms;
                }
                catch
                {
                    Console.WriteLine("Accont Not Created");
                }
            }
            try
            {
                a[1].deposit(19786);
            }
            catch (MyException e)
            {
                Console.WriteLine(e.Message);
            }
            try
            {
                a[2].withdraw(1000);
            }
            catch (MyException e)
            {
                Console.WriteLine(e.Message);
            }
            Console.WriteLine("Interest received is : " + Savings.payInt(a[0]));

        }

    }
}