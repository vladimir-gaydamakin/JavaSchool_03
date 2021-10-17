package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        return getNumber(firstNumber) + getNumber(secondNumber);
    }

    private Integer getNumber(List<Integer> number) {
        long res = number.get(0);
        for (int i = 1; i < number.size(); i++) {
            res += number.get(i) * (long) Math.pow(10, i);
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("The number cannot be converted");
        }
        return  (int) res;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        } else if (list.size() == 1) {
            return Collections.singletonList(list.get(0));
        }
        List<T> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.size() == 0) {
            return Collections.emptyList();
        } else if (list.size() == 1) {
            return Collections.singletonList(list.get(0));
        }        
        List<T> newList = new ArrayList<>();
        newList.add(list.get(0));
        newList.add(list.get(list.size() - 1));
        return newList;
    }
}
