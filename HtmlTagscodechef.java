import java.util.*;
class HtmlTagscodechef{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            int flag = 0;
            String str = sc.nextLine();

            if((str.charAt(0) == '<') && (str.charAt(1) == '/') 
            && (str.charAt(2) == '>'))
            {
                flag = 1;
            }
            else if((str.charAt(0) == '<') && (str.charAt(1) == '/') 
            && (str.charAt(str.length()-1)=='>'))
            {
                for(int i=2;i<str.length()-1;i++)
                {
                    if(((str.charAt(i) >= '0') && (str.charAt(i) <= '9')) 
                    || ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')))
                    {
                        continue;
                    }
                    else
                    {
                        flag = 1;
                        break;
                    }
                }
            }
            else
            {
                flag = 1;
            }

            if(flag == 0)
            {
                System.out.println("Success");
            }
            else
            {
                System.out.println("Error");
            }
        }
    }
}