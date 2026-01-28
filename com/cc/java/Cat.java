package com.cc.java;

public class Cat {

  private String firstName;
  private String furColor;
<<<<<<< HEAD
  private int age; 
  private boolean isFemale;

  private int counter;
 
=======
  private int age;
  private boolean isFemale; 

  private int counter;

>>>>>>> 62d47773d18e9d0efdfe2abbdde6a63153ecee95
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

<<<<<<< HEAD
public String getAge() {
=======
  public String getAge() {
>>>>>>> 62d47773d18e9d0efdfe2abbdde6a63153ecee95
    if (isFemale) {
      return checkCompliance();
    } else {
      return String.valueOf(age);
<<<<<<< HEAD
    } 
=======
    }
>>>>>>> 62d47773d18e9d0efdfe2abbdde6a63153ecee95
  }
private String checkCompliance(){
       counter++;

<<<<<<< HEAD
        switch (counter) {
            case 1:
                return "Ein Gentleman fragt eine Lady nicht nach ihrem Alter."; // 1st time
            case 2:
                return "Dies ist nicht die Antwort, die du suchst."; // 2nd time
            case 3:
                return "Ich bin zeitlos. Frag mich lieber nach meinen neun Leben."; // 3rd time 
            default:
                return "Systemmeldung: Zu viele neugierige Fragen. Gespräch wird beendet."; //4th ++
        }
      }
=======
private String checkCompliance(){

         counter++;

        switch (counter) {
            case 1:
                return "This is an inappropriate question!"; // 1st time
            case 2:
                return "I've told you once!"; // 2nd time
            case 3:
                return "Talk to the hand!"; // 3rd time 
            default:
                return "1#!?&&%"; //4th ++
        }
}



>>>>>>> 62d47773d18e9d0efdfe2abbdde6a63153ecee95
}

  
