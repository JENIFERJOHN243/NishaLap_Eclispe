
public class Sequence 
{
    public static void main(String[] args)
    {
        String s="abcdef";
        int len= s.length();
        int mid=len/2;
        if(len%2!=0)
        {
            printOddSequence(len,mid,s);
        }
        else
        {
            printEvenSequence(len,mid,s);
        }
    }
    public static void printOddSequence(int len,int mid,String s){
        int i,j;
        for(i=0;i<len;i++)
        {
            if(i<=mid)
            {
            j=i;
                while(j<=mid)
                {
                    System.out.print(s.charAt(i));
                    j++;
                }
            }
            else
            {
                j=i;
                while(j>(len/2)-1)
                {
                    System.out.print(s.charAt(i));
                    j--;
                }
            }
        }
    }
       public static void printEvenSequence(int len,int mid,String s){
        int i,j;
        for(i=0;i<len;i++)
        {
            if(i<mid)
            {
            j=i;
                while(j<mid)
                {
                    System.out.print(s.charAt(i));
                    j++;
                }
            }
            else
            {
                j=i;
                while(j>(len/2)-1)
                {
                    System.out.print(s.charAt(i));
                    j--;
                }
            }
        }
    }
 }
