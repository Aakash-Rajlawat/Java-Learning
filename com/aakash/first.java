package com.aakash;

public class first {
    public static void main(String[] args) {
        String firstName = "Aakash ";
        String secondName = "Rajlawat";
        String fullName = firstName + "Raj " + secondName;
        System.out.println(fullName);
        // chat at
        System.out.println(fullName.charAt(1));
        // replace
        String replacedFullName = fullName.replace('a', 'b');
        System.out.println(replacedFullName);
        //substring
        String people = "Aakash and Samosa";
        System.out.println(people.substring(6,9));
    }

}
