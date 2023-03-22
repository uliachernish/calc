import java.util.Scanner;

public class Main {

    public static String calc(String input)
    {
        int index1 = input.indexOf('+');
        int index2 = input.indexOf('-');
        int index3 = input.indexOf('*');
        int index4 = input.indexOf('/');
        int outcalc=0;
        String ten="10";
        String nuul="0";
        String str=input;
        if (index1>0)
        {
            String substr1 = input.substring(0,index1);
            String substr2 = input.substring(index1+1);
            if (substr1.length()>2)
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr1.length()==2)&&(substr1.compareTo(ten)!=0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr1.length()==1)&&(substr1.compareTo(nuul)==0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            if (substr2.length()>2)
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr2.length()==2)&&(substr2.compareTo(ten)!=0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr2.length()==1)&&(substr2.compareTo(nuul)==0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            int i = 0;
            int j = 0;
            try {
                i = Integer.parseInt(substr1);
            } catch (NumberFormatException e) {
                System.err.println("throws Exception");
                System.exit(1);
            }
            try {
                j = Integer.parseInt(substr2);
            } catch (NumberFormatException e) {
                System.err.println("throws Exception");
                System.exit(2);
            }
            outcalc = i+j;
            str = Integer.toString(outcalc);
        }
        else if (index2>0)
        {
            String substr3 = input.substring(0,index2);
            String substr4 = input.substring(index2+1);
            if (substr3.length()>2)
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr3.length()==2)&&(substr3.compareTo(ten)!=0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr3.length()==1)&&(substr3.compareTo(nuul)==0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            if (substr4.length()>2)
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr4.length()==2)&&(substr4.compareTo(ten)!=0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr4.length()==1)&&(substr4.compareTo(nuul)==0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            int i = 0;
            int j = 0;
            try {
                i = Integer.parseInt(substr3);
            } catch (NumberFormatException e) {
                System.err.println("throws Exception");
                System.exit(1);
            }
            try {
                j = Integer.parseInt(substr4);
            } catch (NumberFormatException e) {
                System.err.println("throws Exception");
                System.exit(2);
            }
            outcalc = i-j;
            str = Integer.toString(outcalc);
        }
        else if (index3>0)
        {
            String substr1 = input.substring(0,index3);
            String substr2 = input.substring(index3+1);
            if (substr1.length()>2)
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr1.length()==2)&&(substr1.compareTo(ten)!=0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr1.length()==1)&&(substr1.compareTo(nuul)==0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            if (substr2.length()>2)
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr2.length()==2)&&(substr2.compareTo(ten)!=0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr2.length()==1)&&(substr2.compareTo(nuul)==0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            int i = 0;
            int j = 0;
            try {
                i = Integer.parseInt(substr1);
            } catch (NumberFormatException e) {
                System.err.println("throws Exception");
                System.exit(1);
            }
            try {
                j = Integer.parseInt(substr2);
            } catch (NumberFormatException e) {
                System.err.println("throws Exception");
                System.exit(2);
            }
            outcalc = i*j;
            str = Integer.toString(outcalc);
        }
        else if (index4>0)
        {
            String substr1 = input.substring(0,index4);
            String substr2 = input.substring(index4+1);
            if (substr1.length()>2)
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr1.length()==2)&&(substr1.compareTo(ten)!=0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr1.length()==1)&&(substr1.compareTo(nuul)==0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            if (substr2.length()>2)
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr2.length()==2)&&(substr2.compareTo(ten)!=0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            else if ((substr2.length()==1)&&(substr2.compareTo(nuul)==0))
            {
                System.err.println("throws Exception");
                System.exit(3);
            }
            int i = 0;
            int j = 0;
            try {
                i = Integer.parseInt(substr1);
            } catch (NumberFormatException e) {
                System.err.println("throws Exception");
                System.exit(1);
            }
            try {
                j = Integer.parseInt(substr2);
            } catch (NumberFormatException e) {
                System.err.println("throws Exception");
                System.exit(2);
            }
            outcalc = i/j;
            str = Integer.toString(outcalc);
        }
        else if ((index1<0)&&(index2<0)&&(index3<0)&&(index4<0))
        {
            System.err.println("throws Exception");
            System.exit(4);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(Main.calc(s));
    }

}
