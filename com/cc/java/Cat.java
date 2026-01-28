package com.cc.java;

public class Cat {

  private String firstName;
  private String furColor;
  private int age; 
  private boolean isFemale;

  private int counter;
 
  public Cat(String firstName, String furColor, int age, boolean isFemale) {
    this.firstName = firstName;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
  }

public String getStringAttributes(String op) {
    switch (op) {
      case "#name":
        return firstName;
      case "#color":
        return furColor;
      default:
        return "ERROR!";
    }
  }

public String getAge() {
    if (isFemale) {
      return checkCompliance();
    } else {
      return String.valueOf(age);
    } 
  }
private String checkCompliance(){
       counter++;

        switch (counter) {
            case 1:
                return "Ein Gentleman fragt eine Lady nicht nach ihrem Alter."; // 1st time
            case 2:
                return "Dies ist nicht die Antwort, die du suchst."; // 2nd time
            case 3:
                return "Ich bin zeitlos. Frag mich lieber nach meinen neun Leben."; // 3rd time 
            default:
                return "1#!?&&%"; //4th ++
        }
      }
}

  
