package com.programmers;

import java.util.*;
import java.util.stream.Collectors;

// 21-04-24
public class ListSetArray {

    public static void main(String []args){
        //List, Set, stream, 정렬(sort, sorted), map, filter, Collectors.toList(), toSet()
        java.util.List<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(1);
        list.add(1);
        // 0 LIST-LinkedList
        System.out.println(list);

        // 1 LIST-ArrayList, sort(오름차순)정렬
        ArrayList<Integer> arrayList = new ArrayList<>(list);
        arrayList.sort(null);
        System.out.println("1 LIST : " + arrayList);

        // 2 SET- HashSet TreeSet(이진 탐색 트리) 자동정렬
        Set<Integer> set = new TreeSet<>(list);
        System.out.println("2 SET : " + set);

        // 3 ARRAY
        Integer[] array = new Integer[set.size()];
        set.toArray(array);
        // System.out.println(array); // [Ljava.lang.Integer;@511d50c0 형식으로 나옴
        System.out.println("3 Array : " + Arrays.toString(array));
        System.out.println("=========");

        // 4 Filter map
        List<Integer> numList = Arrays.asList(7,1,2,3,4,5,6);
        numList = numList.stream().sorted().collect(Collectors.toList());
        System.out.println(numList);
        // 각 요소 중 홀수만 2배로 정렬해서 중복제거하고 모으기
        List<Integer> oddList = numList.stream()
                .filter(t->t%2==1)
                .map(t->t*2)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(oddList);
    }
}


