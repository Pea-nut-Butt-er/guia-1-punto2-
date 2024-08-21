package service;

import model.Banco;

public class BancoService {

    public Double addCredit (Banco account, Double deposit){
        Double total=0.00;
        total= account.getBalance()+deposit;
        account.setBalance(total);
        return total;
    }
    public void showAccount (Banco account){
        System.out.println("Account : -ID: " + account.getId() + " -Name: " + account.getName()  + " -Balance: " + account.getBalance());
    }
    public Double deductCredit (Banco account, Double withdrawal) {
        Double total = 0.00;

        total = account.getBalance() - withdrawal;
        if (total>=0){
            account.setBalance(total);
        }
        else {
            System.out.println("Error, balance insuficiente");
            total = account.getBalance();
        }

        return total;

    }


}
