package io.codelex.collections.practice.phonebook;

public class PhoneDirectoryTest {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.putNumber("asd", "2309");
        phoneDirectory.putNumber("aaaa", "232342");
        phoneDirectory.putNumber("abc", "1232342");
        phoneDirectory.putNumber("bbbbsa", "112");
        phoneDirectory.putNumber("woije", "1111");
        phoneDirectory.putNumber("woia", "2222");
        phoneDirectory.putNumber("reno", "3333");
        phoneDirectory.putNumber("pol", "4444");

        phoneDirectory.print();

        System.out.println(phoneDirectory.getNumber("reno"));
    }
}
