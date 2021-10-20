package org.example;

public class FooClass {

    private String foo1;
    private Integer foo2;

    public FooClass(final String foo1, final Integer foo2) {
        this.foo1 = foo1;
        this.foo2 = foo2;
    }

    public String fooLogic1() {
        return  foo1 + foo2;
    }

    public static String fooLogic2(final String... foo) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : foo) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
