package com.bridgelabz;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomisedMessage {
    String name ="<<aaa>>";
    String mobileNumber="bbbbbbbb";
    String fullName ="<<dddddddd>>";
    String date ="dd/mm/yyyy";

    String message;
    public void firstName(String input) {
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(input);
        message = matcher.replaceAll("Praju");
    }
    public void fullName(String input) {
        Pattern pattern = Pattern.compile(fullName);
        Matcher matcher = pattern.matcher(message);
        message = matcher.replaceAll("Praju Hanasi");
    }
    public void mobileNumber(String input) {
        Pattern pattern = Pattern.compile(mobileNumber);
        Matcher matcher = pattern.matcher(message);
        message = matcher.replaceAll("8217468589");
    }
    public void date(String input) {
        DateTimeFormatter presentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime localDate = LocalDateTime.now();

        Pattern pattern = Pattern.compile(date);
        Matcher matcher = pattern.matcher(message);
        message = matcher.replaceAll(presentDate.format(localDate));
    }

    public void displayMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        CustomisedMessage customize = new CustomisedMessage();
        String input = "Hello <<aaa>>,we have ur full name as <<dddddddd>>.your phone number is bbbbbbbb."
                +"\nPlease,let us know in case of any clarification.Thank you Bridgelabz dd/mm/yyyy.";
        customize.firstName(input);
        customize.fullName(input);
        customize.mobileNumber(input);
        customize.date(input);
        customize.displayMessage();
    }
}






