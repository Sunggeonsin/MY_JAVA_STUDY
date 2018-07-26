package icehs.science.workshop3.account;

public class Account {
    
    private String account;
    private int    balance;
    private double interestRate;
    
    public Account() {
        
    }
    
    public Account( String account, int balance, double interestRate ) {
        this.account = account;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    /**
     * 이자를 계산하여 반환한다.
     * 
     * @return
     */
    public int calculateInterest() {
        //TODO 메소드 작성
        
        return 0;
    }
    
    /**
     * 입금을 통해 잔액을 증가시킨다.
     * 
     * @param money
     */
    public void deposit( int money ) {
        System.out.println(money + "원을 입금합니다.");
        if(money < 0) {
        	System.out.println("[에러] 입금액은 음수 일 수 없습니다.");
        }else{
        	System.out.println("계좌 정보 :" + account + ", 잔액 : " + (money + balance) + ", 이자율 : " + interestRate);
        }
    }
    
    /**
     * 출금을 통해 잔액을 감소시킨다.
     * 
     * @param money
     */
    public void withdraw( int money ) {
        System.out.println(money + "원을 출금합니다.");
        if(money < 0) {
        	System.out.println("[에러] 출금액은 음수 일 수 없습니다.");
        }else if(balance < money) {
        	System.out.println("[에러] 잔액이 부족합니다.");
        }
        
    }
    
    /**
     * 계좌 정보를 출력한다.
     */
    public void printAccountInfo() {
        System.out.print( "계좌 정보 : " + account );
        System.out.print( ", 잔액 : " + balance );
        System.out.println( "원, 이자율 : " + interestRate + "%" );
    }
}