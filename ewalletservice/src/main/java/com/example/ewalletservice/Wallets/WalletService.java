package com.example.ewalletservice.Wallets;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WalletService {


    private List<Wallet> wallets = new ArrayList<>(Arrays.asList(
           new Wallet( "01022020","James Moses",2500.00,"Naira","0905736453"),
           new Wallet( "02022020","Jamila Mohammed",34100.10,"Naira","09073526352"),
           new Wallet( "03022020","Daniel Amange",1200.54,"Dollar","07046352746")

    ));

    public List<Wallet> getAllWallets(){
        return wallets;
    }

    public Wallet getWallet(String acctNumber){
        return wallets.stream().filter(w->w.getAccNumber().equals(acctNumber)).findFirst().get();
    }

    public void addWallet(Wallet wallet){
        wallets.add(wallet);
    }

    public void updateWallet(Wallet wallet, String acctNumber){
        for(int i = 0; i < wallets.size(); i++){
            Wallet w = wallets.get(i);
            if(w.getAccNumber().equals(acctNumber)){
                wallets.set(i, wallet);
            }
        }


    }

    public void deleteWallet(String accNumber){
        wallets.remove(accNumber);
    }

}
