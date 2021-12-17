package com.teachmeskills.lesson_5.maintask.method.test;
import com.teachmeskills.lesson_5.maintask.method.creditcard.CreditCard;

public class Test {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.accountnumber = 122121;
        creditCard.currentmount = 33323;

        CreditCard creditCard1 = new CreditCard();
        creditCard1.accountnumber = 333232;
        creditCard1.currentmount = 43434343;

        CreditCard creditCard2 = new CreditCard();
        creditCard2.accountnumber = 233232;
        creditCard2.currentmount = 21212313;

        creditCard.addmount(232332);

        creditCard1.addmount(342344);

        creditCard2.offmount(343434);

    }
}
