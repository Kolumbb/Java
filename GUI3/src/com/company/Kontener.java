package com.company;

public class Kontener <T, S>{
    public T type;
    public S typeS;


    public Kontener(T type, S typeS){
        this.type = type;
        this.typeS = typeS;
    }


    public void wypisz(){
        System.out.println(type + " " + typeS);
    }
}
