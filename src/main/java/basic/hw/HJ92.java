package basic.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HJ92 {

    public static void main(String[] args) {
        String line = "abcd12345ed125ss123058789";
        String regex = "\\d+";
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(line);
        String[] String = line.split("\\D+");
        if (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group());
            System.out.println(matcher.group());
        }
    }
}
