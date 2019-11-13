package webHW;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		double num,i=0,h=0,j=0;
		Scanner sc = new Scanner(System.in);
		OutputStream outputStream = new FileOutputStream("HMW.html");
        OutputStreamWriter out = new OutputStreamWriter(outputStream);
        String text;
        
        text = "<!DOCTYPE html> @ <html> @ <title>HMW1-Q1</title> @<head> @</head> @@<body>";
        text = text.replace("@",  "\n");
        out.write(text+"\n");
        System.out.println("Enter number of columns: ");
        num = sc.nextDouble();
        sc.close();
        text = "<div style=\"background-color: blue;@position: fixed;@top: 0;@left: 0;@width: 0;@height: 100%;\">@</div>";
        h=100/num;
        text = text.replace("width: 0", "width: " + Double.toString(h) + "%;");
        while (i++ <= num)
        {
            text = text.replace("@", "\n");
            out.write(text+"\n");
            text = "<div style=\"background-color: blue;@position: fixed;@top: 0;@left: 0;@width: 0;@height: 100%;\">@</div>";
            text = text.replace("width: 0", "width: " + Double.toString(h) + "%;");
            if(i%3==1)
                text = text.replace("blue","red");
               else if (i%3==2)
                   text = text.replace("blue", "green");
               j = 100/num *i;
               text = text.replace("left: 0;", "left: " + Double.toString(j) + "%;");
              
           }
        text = "    </body>@</html>";
        text = text.replace("@", "\n");
        out.write(text+"\n");
        out.close();
        

	}

}
