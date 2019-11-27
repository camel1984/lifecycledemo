package org.sonatype.mavenbook.ch07;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String msg = "Hello World!";
        if (args.length > 0) {
            msg = args[0];
        }
        System.out.println(msg);
    }
}
