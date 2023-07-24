package org.example.fn;

@FunctionalInterface
public interface Fn1 {

    public String m1(String s1, String s2, String s3);
    default String m2(String s1, String s2, String s3){
        return "";
    }


}
