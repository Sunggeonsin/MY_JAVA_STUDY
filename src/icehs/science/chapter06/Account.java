package icehs.science.chapter06;

public class Account {
String accName;
String accNo;
int balance;

void deposit(int money) {

if(money<0) {
	System.out.println(" [����] �ݾ��� ������ �Է��� �� �����ϴ�.");
}else{
	balance += money;
}
}


void withdraw(int money) {
	
	if(balance < money) {
		System.out.println("[����] �ܾ��� �����մϴ�.");
	}else if(money < 0){
		System.out.println(" [����] �ݾ��� ������ �Է��� �� �����ϴ�.");
	}
	
	else {
		balance -= money;
	}
}

void printAccountInfo() {
	
	System.out.println(" ���� " + accNo + " ( ������ : " + accName + " )");
	System.out.println(" �ܾ� : " + balance + "��");

}

public int getBalance() {
	return balance;
}
}