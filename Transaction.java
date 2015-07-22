public class Transaction{

Date date;
ArrayList<LineItem> dr;
ArrayList<LineItem> cr;

public Transaction(Date d, ArrayList<LineItem> debit, ArrayList<LineItem> credit){

date = d;
dr = debit;
cr = credit;

}

}