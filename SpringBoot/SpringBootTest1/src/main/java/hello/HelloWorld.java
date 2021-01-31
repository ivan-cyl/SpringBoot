package main.java.hello;


//import java.time.LocalTime;

//public class HelloWorld {
//    public static void main(String[] args) {
//        Greeter greeter = new Greeter();
//        System.out.println(greeter.sayHello());
//    }
//}

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
//HelloWorld 使用 Joda Time 的 LocalTime 类获取并打印当前时间。
//现在运行 gradle build 来构建项目，那么构建将会失败，因为您没有在构建中将 Joda Time 声明为编译依赖项。
