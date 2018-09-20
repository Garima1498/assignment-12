import java.io.*;
class Project1
{
      public static void main(String args[])
      {
        File a = new File("C:/class java/Assignment 12/abc.txt");
        File b = new File("C:/class java/Assignment 12/xyz.txt");
        char c[]=new char[1000];
          int i,k=0;
          try
          {
          FileInputStream ab=new FileInputStream(a);
                      i=ab.read();
                     while(i!=-1)
                     {
                      c[k]=(char)i;
                     k++;
                     i=ab.read();
                   }
                  }
                 catch(IOException e)
                 {
                   System.out.println(e);
                 }
                  try{
                   FileOutputStream fout=new FileOutputStream(b);
                   for(i=0;i<k;i++)
                    fout.write(c[i]);
                   System.out.println("File is copied");
                 }
                 catch(IOException e)
                 {
                   System.out.println(e);
                  }
                 try
                 {
            FileInputStream ab=new FileInputStream(b);
        int i2;
        i2 = ab.read();
        while(i2 != -1)
        {
            c[k++] = (char)i2;
            System.out.print((char)i2);
            i2 = ab.read();
        }
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
      }
}