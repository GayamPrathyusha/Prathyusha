package com.demo;

import java.util.ArrayList;

public class Fibbo {

    /**
     * @param limit
     * @return
     */
    public ArrayList<Integer> perform(Integer limit) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer num = 0, n1 = 0, n2 = 1;
        while (num<=limit) {
            num = n1 + n2;
            if (num <= limit) {
                list.add(n1);
            }
            n1 = n2;
            n2 = num;
        }
        return list;
    }

}
