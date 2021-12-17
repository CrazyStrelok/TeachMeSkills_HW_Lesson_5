package com.teachmeskills.lesson_5.maintask.method.creditcard;
public class CreditCard {
        public int accountnumber;
        public int currentmount;

        public void addmount(int plusmount){
        this.currentmount = plusmount + currentmount;
                System.out.println(getCurrentmount());
        }
        public void offmount(int minusmount){
        this.currentmount = currentmount - minusmount;
                System.out.println(getCurrentmount());
        }
        int getCurrentmount(){
                return this.currentmount;
        }
}

