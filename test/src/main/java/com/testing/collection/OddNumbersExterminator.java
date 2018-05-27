package com.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public OddNumbersExterminator(){

    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> lista){

        ArrayList<Integer> nowalista = new ArrayList<Integer>();

        for(int i=0;i<lista.size();i++){
            if(lista.get(i)%2==0){
                nowalista.add(lista.get(i));
            }
        }
        return nowalista;
    }
}
