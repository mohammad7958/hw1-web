using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Threading.Tasks;

namespace Rextester
{
    class Program
    {
        static void Main(string[] args)
        {
            double num,i=0,h=0,j=0;
            StreamWriter sw = new StreamWriter("D:\\WebColorPages.html");
            string text;
            text = "<!DOCTYPE html> @ <html> @ <title>HMW1-Q1</title> @<head> @</head> @@<body>";
            text = text.Replace("@",  System.Environment.NewLine);
            sw.WriteLine(text);
            Console.Write("Enter number of columns: ");
            num=double.Parse(Console.ReadLine());
            text = "<div style=\"background-color: blue;@position: fixed;@top: 0;@left: 0;@width: 0;@height: 100%;\">@</div>";
            h=100/num;
            text = text.Replace("width: 0", "width: " + h.ToString() + "%;");
            while (i++ <= num)
            {
                text = text.Replace("@", System.Environment.NewLine);
                sw.WriteLine(text);
                text = "<div style=\"background-color: blue;@position: fixed;@top: 0;@left: 0;@width: 0;@height: 100%;\">@</div>";
                text = text.Replace("width: 0", "width: " + h.ToString() + "%;");
                if(i%3==1)
                 text = text.Replace("blue","red");
                else if (i%3==2)
                    text = text.Replace("blue", "green");
                j = 100/num *i;
                text = text.Replace("left: 0;", "left: " + j.ToString() + "%;");
               
            }
            text = "    </body>@</html>";
            text = text.Replace("@", System.Environment.NewLine);
            sw.WriteLine(text);
            sw.Close();
            
        }
    }
}
