package hello.hellospring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloTests {

    @Test
    public void test() {
        String str1 = "123";
        String str2 = new String("123");

        System.out.println(System.identityHashCode(str2));
        str2 += new String("456");

        System.out.println("str1: " + str1.hashCode());
        System.out.println("str2: " + str2.hashCode());

        System.out.println(System.identityHashCode(str2));
        Assertions.assertSame(str1, str2);
    }

}
