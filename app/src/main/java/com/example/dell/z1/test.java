package com.example.dell.z1;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class test {
    public static void main(String arms[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        Method add = list.getClass().getMethod("add", Object.class);
        Object invoke = add.invoke(list, "dsijefeisejf");
        System.out.println(list);
    }

}
