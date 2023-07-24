package org.example.fn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {

//        Fn1 fn1 = (s1, s2, s3) -> s1.concat(s2).concat(s3);
//
//        System.out.printf(fn1.m1("A", "B", "C"));

//        Function<String, Integer> myFunc= (s1) -> s1.length();
//
//        System.out.println(myFunc.apply("Mahdieh"));

//        Test1 test1 = new Test1();
//        test1.myM2(( s1,  s2,  i1) -> ((String) s1).concat((String) s2));
//        test1.myM();
//        Fn2 fn2 = ( s1,  s2,  i1) -> ((String) s1).concat((String) s2);
//        fn2.m1("AB", "CD", 1);

//        Fn2 fn3 = ( s1,  s2,  i1) -> String.valueOf((Integer) s1 + (Integer) s2);
//        System.out.println(fn3.m1(100, 200, 1));


        List<MyClass1> list = new ArrayList<>();
        MyClass1 myClass1= new MyClass1("A", "B", "C", "D");
        MyClass1 myClass2= new MyClass1("A1", "B1", "C1", "D1");
        MyClass1 myClass3= new MyClass1("A2", "B2", "C2", "D2");
        MyClass1 myClass4= new MyClass1("A3", "B3", "C3", "D3");
        MyClass1 myClass5= new MyClass1("A4", "B4", "C4", "D4");
        MyClass1 myClass6= new MyClass1("A3", "B5", "C5", "D5");
        list.add(myClass1);
        list.add(myClass2);
        list.add(myClass3);
        list.add(myClass4);
        list.add(myClass5);
        list.add(myClass6);

        Test1 test1 = new Test1();
//        list.forEach(test1::myConsumer);
//        list.forEach((s)-> System.out.println(s.toString()));
//        list.stream().filter((i)-> i.str1.contains("3"))
//                .map(s-> s.str1)
//                .forEach(test1::myConsumer2);

        List<List<String>> innerList = new ArrayList<>();
        List<String> list1 = Arrays.asList("A", "B");
        innerList.add(list1);
        List<String> list2 = Arrays.asList("A2", "B2");
        innerList.add(list2);
        List<String> list3 = Arrays.asList("A3", "B3");
        innerList.add(list3);

        List<String> innerList2 = new ArrayList<>();


        Optional<String> optionalS = innerList.stream().flatMap(item -> item.stream()).findFirst();
        if (optionalS.isPresent())
            System.out.println(optionalS.get());

        Optional<String> optionalS2 = innerList2.stream().findFirst();
        if (optionalS2.isPresent())
            System.out.println(optionalS2.get());
    }

    private void myConsumer(MyClass1 myClass1){
        System.out.println(myClass1.toString());
    }

    private void myConsumer2(String str){
        System.out.println(str);
    }


    private void myM(){
        Fn2 mah = (st,stt,sttt) -> String.valueOf(((Integer)st + (Integer)stt));
        String s = mah.m1(10, 20, null);
        System.out.println(s);
    }

    private void myM2(Fn2 fn2){
        System.out.println(fn2.m1("Dear","Mah", ""));
    }


}