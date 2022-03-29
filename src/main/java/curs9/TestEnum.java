package curs9;

public class TestEnum {

    public static void main (String[] args){
        //System.out.println(EnumExample.DEV.getUrl());

        for (EnumExample e: EnumExample.values()){
            System.out.println(e.name());
            System.out.println(e.getUrl());

        }

    }

}
