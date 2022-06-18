package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
     OTP_Generator otp = new OTP_Generator();
        System.out.println("New OTP : " +otp.new_otp());

        Password_generator pswd = new Password_generator();
        System.out.println("New password : "+pswd.password());
    }
}
