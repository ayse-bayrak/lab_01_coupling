package com.cydeo.loosely;

import java.math.BigDecimal;

public class BalanceService {

    public boolean checkout(Balance balance, BigDecimal checkoutAmount){

        BigDecimal balanceAmount = balance.getAmount();//100
        BigDecimal subtracted = balanceAmount.subtract(checkoutAmount);//40

        //if we have enough money to checkout(subtracted>=0), proceed and return true, if not return false.
        if(subtracted.compareTo(BigDecimal.ZERO) >=0){
            balance.setAmount(subtracted);
            return true;
        }

        return false;
    }
}