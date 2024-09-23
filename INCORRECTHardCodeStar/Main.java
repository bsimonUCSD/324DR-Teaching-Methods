import java.util.*;

class Main {
  public static void main(String[] args) {
    
    String name = "Beth";

    int length = name.length();
    System.out.print("**********************************");
    for (int i = 0; i < length; i++) {
      System.out.print("*");
    }
    System.out.print("\n*                                ");
    for (int i = 0; i < length; i++) {
      System.out.print(" ");
    }
    System.out.println("*\n* Hello, " + name + "! Welcome to CSE 11! :) *");
    System.out.print("*                                ");
    for (int i = 0; i < length; i++) {
      System.out.print(" ");
    }
    System.out.print("*\n**********************************");
    for (int i = 0; i < length; i++) {
      System.out.print("*");
    }

  }
}