package module2.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(6);
        hashSet.add(1);
        hashSet.add(22);
        hashSet.add(1);
        hashSet.add(10);
        hashSet.remove(6);
        hashSet.remove(2);

        System.out.println("HashSet");
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(6));
        System.out.println(hashSet);
        System.out.println("****************************");
        System.out.println();


        Set<Integer> linked = new LinkedHashSet<>();
        linked.add(88);
        linked.add(9);
        linked.add(8);
        linked.add(123);
        System.out.println("linked");
        System.out.println(linked);
        System.out.println("*****************");


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(88);
        treeSet.add(9);
        treeSet.add(8);
        treeSet.add(123);

        System.out.println("TreeSet");
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        System.out.println("******************");


    }
}
