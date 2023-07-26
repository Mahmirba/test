package org.example.fn;

public class MyClass1 {

    public String str1;
    public String str2;
    public String str3;
    public String str4;

    public Integer int5;

    public MyClass1(String str1, String str2, String str3, String str4, Integer int5) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
        this.str4 = str4;
        this.int5 = int5;
    }

    @Override
    public String toString() {
        return "MyClass1{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                ", str3='" + str3 + '\'' +
                ", str4='" + str4 + '\'' +
                '}';
    }
}
