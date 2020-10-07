package jdk12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaStrings {

    public static void main(String[] args) {

        Object obj = "ceva";
        if (obj instanceof String) {
            String s = (String) obj;
            // use s in your code from here
            System.out.println(s);

        }

        //1. indent(int n)
        String str = "*****\n  Hi\n  \tHello John\rHow are you?\n*****";
        System.out.println(str.indent(0));
        System.out.println(str.indent(3));
        System.out.println(str.indent(-3));

        //2. transform(Function<? super String,​? extends R> f)
        //convert a CSV string to the list of strings
        String s = "One,Two,Three";
        List strList = s.transform(s1 -> {return Arrays.asList(s1.split(","));});
        System.out.println(strList);

        //3. Optional<String> describeConstable()
        //method is declared in the Constable interface and implemented in the String class
        //returns an Optional containing the nominal descriptor for this instance, which is the instance itself
        String so = "Hello";
        Optional os = so.describeConstable();
        System.out.println(os);
        System.out.println(os.get());
    }
}
