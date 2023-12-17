package Methods.charAt;

public class Odd_Positions {
    public static void main(String[] args) {
        String str="Welcome to Javatpoint portal";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                System.out.println("char At :"+i+" place="+str.charAt(i));
            }
        }
    }
}
