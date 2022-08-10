package com.example.calculator;

public class Test {

    public Test() {
        A a = new A();
    }

    public void test() {

    }

    public class A extends Test {

        public void test() {
            test();
        }
    }

    public class B extends A {

        public B() {
            test();
        }
    }

}
