public class Task20{

    public static void main(String[] args){
        char[] Name={'A','r','a','v','i','n','d'};
        System.out.println(Name);
        
        int n=Name.length;
        System.out.println("There are " +n+" letters in my name");

        System.out.println("Letters in my name:");

        for(int i=0;i<n;i++){
            System.out.print( Name[i]);
        }


    
        
    }
}