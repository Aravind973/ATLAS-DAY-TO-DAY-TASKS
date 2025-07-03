import java.util.*;

public class arraymaxnum
{
    public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    
    int arraysize=sc.nextInt();
    
    int[] a=new int[arraysize];
    
    System.out.println("Enter array elements");
    
    for(int i=0;i<arraysize;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("elements of a array : "+Arrays.toString(a));
    
    int maxnum=0;
    int maxind=0;
    
    for(int i=0;i<a.length;i++){
        if(maxnum<a[i]){
            
            maxnum=a[i];
            maxind=i;
        }
        
       
    }
     System.out.println("maxnum: "+maxnum);
    System.out.println("maxind: "+maxind);
    sc.close();
        
        
        
}
}
