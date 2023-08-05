package org.example.fn;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {

    public static void main(String[] args) {

        Test1 test1 = new Test1();

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
        MyClass1 myClass1 = new MyClass1("A", "B", "C", "D", 100);
        MyClass1 myClass2 = new MyClass1("A1", "B1", "C1", "D1", 70);
        MyClass1 myClass3 = new MyClass1("A2", "B2", "C2", "D2", 20);
        MyClass1 myClass4 = new MyClass1("A3", "B3", "C3", "D3", 200);
        MyClass1 myClass5 = new MyClass1("A4", "B4", "C4", "D4", 250);
        MyClass1 myClass6 = new MyClass1("A3", "B5", "C5", "D5", 3);
        list.add(myClass1);
        list.add(myClass2);
        list.add(myClass3);
        list.add(myClass4);
        list.add(myClass5);
        list.add(myClass6);

        Stream<MyClass1> stream1 = list.stream();
        //*************************************
//        try {
//            stream1.forEach(h -> System.out.println(h.toString()));
//            stream1.forEach(h -> System.out.println(h.toString()));  // stream is used so we ger error
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        //********************************
//        IntSummaryStatistics lista3 = stream1.filter(s -> s.str1.equals("A3")).collect(Collectors.summarizingInt(s->s.int5));
//        System.out.println("");
        //********************************

//        Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);
//        List<Integer> collect = infiniteStream
//                .skip(2)
//                .limit(5)
//                .collect(Collectors.toList());
//
//        System.out.println("");
//        list.stream().parallel().      proccessing list as parallel

//        Test1 test1 = new Test1();
//        list.forEach(test1::myConsumer);
//        list.forEach((s)-> System.out.println(s.toString()));
//        list.stream().filter((i)-> i.str1.contains("3"))
//                .map(s-> s.str1)
//                .forEach(test1::myConsumer2);

//        List<List<String>> innerList = new ArrayList<>();
//        List<String> list1 = Arrays.asList("A", "B");
//        innerList.add(list1);
//        List<String> list2 = Arrays.asList("A2", "B2");
//        innerList.add(list2);
//        List<String> list3 = Arrays.asList("A3", "B3");
//        innerList.add(list3);
//
//        List<String> innerList2 = new ArrayList<>();
//
//
//        Optional<String> optionalS = innerList.stream().flatMap(item -> item.stream()).findFirst();
//        if (optionalS.isPresent())
//            System.out.println(optionalS.get());
//
//        Optional<String> optionalS2 = innerList2.stream().findFirst();
//        if (optionalS2.isPresent())
//            System.out.println(optionalS2.get());


//        ChildBook childBook = new ChildBook();
//        System.out.println(childBook.getName());
//
//        ParentBook parentBook = new ParentBook();
//        System.out.println(parentBook.getName());

//        test1.testDistinct();
//        test1.matchOperators();
//        test1.specialFun();
//        test1.testReductions();
//        test1.collectorJoining();
//        test1.whenApplySummarizing_thenGetBasicStats();
//        test1.whenStreamPartition_thenGetMap();
//        test1.whenStreamGroupBy_thenGetMap();
//        test1.whenStreamMapping_thenGetMap();
//        test1.whenStreamGroupingAndReducing_thenGetMap();
//        test1.parallelTesting();
        test1.whenStreamToFile_thenGetFile();
    }

    private void myConsumer(MyClass1 myClass1) {
        System.out.println(myClass1.toString());
    }

    private void myConsumer2(String str) {
        System.out.println(str);
    }


    private void myM() {
        Fn2 mah = (st, stt, sttt) -> String.valueOf(((Integer) st + (Integer) stt));
        String s = mah.m1(10, 20, null);
        System.out.println(s);
    }

    private void myM2(Fn2 fn2) {
        System.out.println(fn2.m1("Dear", "Mah", ""));
    }

    private void testDistinct() {
//        List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
//        List<Integer> distinctIntList = intList.stream().distinct().collect(Collectors.toList());
//
//        distinctIntList.forEach(s-> System.out.println(s));

        Employee emp1 = new Employee(1, "a", 20);
        Employee emp2 = new Employee(2, "b", 21);
        Employee emp3 = new Employee(3, "a", 20);
        Employee emp4 = new Employee(4, "c", 23);
        Employee emp5 = new Employee(5, "b", 24);

        List<Employee> list = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        List<Employee> empDisList = list.stream().distinct().collect(Collectors.toList());

        empDisList.forEach(s -> System.out.println(s));


    }

    private void matchOperators() {
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);

        boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
        boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
        boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);
    }

    private void specialFun() {
        Employee emp1 = new Employee(1, "a", 20, 100L);
        Employee emp2 = new Employee(2, "b", 21, 10L);
        Employee emp3 = new Employee(3, "a", 20, 110L);
        Employee emp4 = new Employee(4, "c", 23, 500L);
        Employee emp5 = new Employee(5, "b", 24, 102L);

        List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        Integer latestEmpId = empList.stream()
                .mapToInt(this::getInt)
                .max()
                .orElseThrow(NoSuchElementException::new);

        System.out.println("=max======: " + latestEmpId);
    }


    private int getInt(Employee s) {
        return 100;
    }

    private String getIStr(Employee s) {
        return "100";
    }

    //interview question*****
    private void testReductions() {

        IntStream range = IntStream.range(10, 20);
        int reduce = range.reduce(100, (e, f) -> e + f);
        System.out.println(reduce);

    }

    private void collectorJoining() {

//        IntStream range = IntStream.range(10, 30);
//        Stream<Integer> range2= Stream.iterate()
//        String collect = range.map(s-).collect(Collectors.joining(",")).toString();

        Employee emp1 = new Employee(1, "a", 20, 100L);
        Employee emp2 = new Employee(2, "b", 21, 10L);
        Employee emp3 = new Employee(3, "a", 20, 110L);
        Employee emp4 = new Employee(4, "c", 23, 500L);
        Employee emp5 = new Employee(5, "b", 24, 102L);

        List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        String empNames = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));
        System.out.println(empNames);

        Set<Employee> empSet = empList.stream()
                .collect(Collectors.toSet());

        empSet.forEach(s -> System.out.println(s));
    }

    public void whenToVectorCollection_thenGetVector() {

        Employee emp1 = new Employee(1, "a", 20, 100L);
        Employee emp2 = new Employee(2, "b", 21, 10L);
        Employee emp3 = new Employee(3, "a", 20, 110L);
        Employee emp4 = new Employee(4, "c", 23, 500L);
        Employee emp5 = new Employee(5, "b", 24, 102L);
        List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);


        HashSet empNames = empList.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(HashSet::new));

    }

    public void whenApplySummarizing_thenGetBasicStats() {

        Employee emp1 = new Employee(1, "a", 20, 100L);
        Employee emp2 = new Employee(2, "b", 21, 10L);
        Employee emp3 = new Employee(3, "a", 20, 110L);
        Employee emp4 = new Employee(4, "c", 23, 500L);
        Employee emp5 = new Employee(5, "b", 24, 102L);
        List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        LongSummaryStatistics stats = empList.stream()
                .collect(Collectors.summarizingLong(Employee::getAge));

        System.out.println(stats);
    }

    public void whenStreamPartition_thenGetMap() {

        Employee emp1 = new Employee(1, "a", 20, 100L);
        Employee emp2 = new Employee(2, "b", 21, 10L);
        Employee emp3 = new Employee(3, "a", 20, 110L);
        Employee emp4 = new Employee(4, "c", 23, 500L);
        Employee emp5 = new Employee(5, "b", 24, 102L);
        List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        Map<Boolean, List<Employee>> isLess22 = empList.stream().collect(
                Collectors.partitioningBy(i -> i.getAge() > 22));

        System.out.println("");

    }

    public void whenStreamGroupBy_thenGetMap() {

        Employee emp1 = new Employee(1, "a", 20, 100L);
        Employee emp2 = new Employee(2, "b", 21, 10L);
        Employee emp3 = new Employee(3, "a", 20, 110L);
        Employee emp4 = new Employee(4, "c", 23, 500L);
        Employee emp5 = new Employee(5, "b", 24, 102L);
        List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        Map<String, List<Employee>> isLess22 = empList.stream().collect(
                Collectors.groupingBy(i -> i.getName()));

        System.out.println("");

    }

    public void whenStreamMapping_thenGetMap() {

        Test1 test1 = new Test1();

        Employee emp1 = new Employee(1, "a", 20, 100L);
        Employee emp2 = new Employee(2, "b", 21, 10L);
        Employee emp3 = new Employee(3, "a", 20, 110L);
        Employee emp4 = new Employee(4, "c", 23, 500L);
        Employee emp5 = new Employee(5, "b", 24, 102L);
        List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        Map<String, List<Integer>> isLess22 = empList.stream().collect(
                Collectors.groupingBy(i -> i.getName(), Collectors.mapping(test1::getMyData, Collectors.toList())));

        System.out.println("");
    }

    public void whenStreamGroupingAndReducing_thenGetMap() {

        Test1 test1 = new Test1();

        Employee emp1 = new Employee(1, "a", 20, 100L);
        Employee emp2 = new Employee(2, "b", 21, 10L);
        Employee emp3 = new Employee(3, "a", 20, 110L);
        Employee emp4 = new Employee(4, "c", 23, 500L);
        Employee emp5 = new Employee(5, "b", 24, 102L);
        List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);
        Double incrementalSalary = empList.stream().collect(Collectors.reducing(0.0, e -> Double.valueOf(e.getExtra()) * 0.3, (e1, e2) -> e1 + e2));

        System.out.println(incrementalSalary);
    }

    public void parallelTesting() {

        IntStream range = IntStream.range(10, 1000);

        range.parallel().forEach(System.out::println);
    }

    public void whenStreamToFile_thenGetFile()  {
        String[] words = {
                "hello",
                "refer",
                "world",
                "level",
                "level2",
                "level3",
                "level4"
        };

        try (PrintWriter pw = new PrintWriter(
                Files.newBufferedWriter(Paths.get("C:\\temp\\test.txt")))) {
            Stream.of(words).forEach(
                    s -> {
                        pw.println(s);
                        pw.flush();
                    });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printData(String s){
//        so
    }


    private Integer getMyData(Employee employee) {
        return 150;
    }

    private void checkFinally() {

        try {
            System.out.println("in main block");
            return;
        } catch (Exception e) {
            System.out.println("in catch");
            return;
        } finally {
            System.out.println("in finally");
        }
    }


}
