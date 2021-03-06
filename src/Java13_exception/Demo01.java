package Java13_exception;

/**
 * @author sucre
 * @date 2019-08-15
 * @time 09:10
 * @description Java异常概述
 */

/*
    Throwable类是Java语言中所有错误或异常的超类。
    只有当对象是此类（或其子类之一）的实例时，才能通过 JVM 或者 throw 语句抛出。

    继承体系：
    -Throwable
        -Error
        -Exception
            -RuntimeException

    异常处理方法：
    1.自己处理
    2.java虚拟机处理
    jvm有一个默认的异常处理机制,将该异常的名称、异常的信息、异常出现的位置打印在了控制台上,同时程序停止运行。


    1.原则:如果自己能处理的问题，就用try-catch, 如果自己不能解决的问题，就throws

    2.try-catch和throws的区别:
	后续程序需要继续运行就用try
	后续程序不需要继续运行就throws

    3.如果JDK没有提供对应的异常，需要自定义异常。

 */

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        //数组越界异常ArrayIndexOutOfBoundsException
        System.out.println(arr[4]);

        arr = null;
        //空指针异常NullPointerException
        System.out.println(arr[0]);

        //类型转换异常ClassCastException
        Object s = "abc";
        Integer i = (Integer)s;

    }
}
