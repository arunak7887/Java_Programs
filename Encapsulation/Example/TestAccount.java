package Encapsulation.Example;

public class TestAccount {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setAcc_no(123456);
        acc.setName("Arun Budhaji kinwad");
        acc.setEmail("arunlinwad02@gmail.com");
        acc.setAmount(500000);
        System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());
    }
    
}
