package Methods.charAt;

public class Count_Frequency_char {
    public static void main(String[] args) {
        int count=0;
        String str="Welcome to javatpoint portal";
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='t') {
                count++;
                
            }
        }
        System.out.println("Frequency of t:"+count);
    }
    
}
