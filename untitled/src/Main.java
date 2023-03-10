import java.util.Scanner;

public class Main {

    public static String calc(String input)
    {
        int index1 = input.indexOf('+');
        int index2 = input.indexOf('-');
        int index3 = input.indexOf('*');
        int index4 = input.indexOf('/');
        int outcalc=0;
        String str=input;
        if (index1>0)
        {
            String substr1 = input.substring(0,index1);
            String substr2 = input.substring(index1);
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
            if ((i>10)||(i<0)||(j>10)||(j<0))
            {
                System.out.println("throws Exception");
                System.exit(3);
            }

            outcalc = i+j;
            str = Integer.toString(outcalc);
        }
        else if (index2>0)
        {
            String substr3 = input.substring(0,index2);
            String substr4 = input.substring(index2+1);
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
            if ((i>10)||(i<0)||(j>10)||(j<0))
            {
                System.out.println("throws Exception");
                System.exit(3);
            }

            outcalc = i-j;
            str = Integer.toString(outcalc);
        }
        else if (index3>0)
        {
            String substr1 = input.substring(0,index3);
            String substr2 = input.substring(index3+1);
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
            if ((i>10)||(i<0)||(j>10)||(j<0))
            {
                System.out.println("throws Exception");
                System.exit(3);
            }

            outcalc = i*j;
            str = Integer.toString(outcalc);
        }
        else if (index4>0)
        {
            String substr1 = input.substring(0,index4);
            String substr2 = input.substring(index4+1);
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
            if ((i>10)||(i<0)||(j>10)||(j<0))
            {
                System.out.println("throws Exception");
                System.exit(3);
            }

            outcalc = i/j;
            str = Integer.toString(outcalc);
        }
        else if ((index1<0)&&(index2<0)&&(index3<0)&&(index4<0))
        {
            System.out.println("throws Exception");
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
