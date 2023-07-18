package com.epam.mjc;

import java.util.ArrayList;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x -> {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (Integer num : x){
                arrayList.add(num/divider);
            }
            return arrayList;
        };
    }
}
