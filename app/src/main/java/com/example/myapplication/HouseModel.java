package com.example.myapplication;

import java.util.ArrayList;

public class HouseModel {
    ArrayList<House> houses = new ArrayList<>() ;

    public HouseModel() {
    this.houses.add(new House(1,"birziet",144,8,100000,"fornished",true,false, R.drawable.house)) ;
        this.houses.add(new House(2,"jefna",144,8,100000,"fornished",true,false, R.drawable.house)) ;
        this.houses.add(new House(3,"almazra3a",144,8,100000,"fornished",true,false, R.drawable.house)) ;
        this.houses.add(new House(4,"kober",144,8,100000,"fornished",true,false, R.drawable.house)) ;
        this.houses.add(new House(5,"birziet",144,8,100000,"fornished",true,false, R.drawable.house)) ;

    }

}
