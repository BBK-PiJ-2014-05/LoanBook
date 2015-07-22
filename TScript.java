public class TScript{

public static void main(String[] args){

Account sch = new Account("School",6000,AccountType.EXPENSE);
Account bank = new Account("Bank",1000,AccountType.BANK);

ArrayList<LineItem> dr = new ArrayList<LineItem>();
ArrayList<LIneItem> cr = new ArrayList<LineItem>();

LineItem l1 = new LineItem(sch,"this memo",DrCr.Dr,200.0);
LineItem l2 = new LineItem(bank,"bank memo",DrCr.Cr,200.0);

dr.add(l1);
cr.add(l2);

