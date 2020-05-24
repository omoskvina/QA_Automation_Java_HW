package HomeworkLessonTen;

import java.sql.SQLOutput;

/**
 * QA Automation. Kevin. Homework 10
 * @author Olena Moskvina
 * @version dated 11/05/2020
 */


public class HomeworkLesson10 {

    public static void main(String[] args) {

      Person person1 = new Person("Roberta", "Draper", "01/06/2388", "Mars", "Mariner Valleys");

      Passport internalPassport = new Passport();
      internalPassport.setSeries("BK");
      internalPassport.setNumber("114411");

      Passport internationalPassport = new Passport();
      internationalPassport.setSeries("EE");
      internationalPassport.setNumber("785775");

      Passport internalIDCard = new Passport();
      internalIDCard.setSeries(null);
      internalIDCard.setNumber("123475896");

      Passport newInternalPassport = new Passport();
      newInternalPassport.setSeries("BK");
      newInternalPassport.setNumber("114411");

        System.out.println(internalPassport.equals(internationalPassport));
        System.out.println(internalPassport.hashCode() == internationalPassport.hashCode());

        System.out.println(internalPassport.equals(internalIDCard));
        System.out.println(internalPassport.hashCode() == internalIDCard.hashCode());

        System.out.println(internalPassport.equals(newInternalPassport));
        System.out.println(internalPassport.hashCode() == newInternalPassport.hashCode());


      PersonalNumber personalNumber = PersonalNumber.getInstance("3228400000");
        System.out.println(personalNumber.personalNumber);

      PersonalNumber duplicatePersonalNumber = PersonalNumber.getInstance("81534587");
        System.out.println(duplicatePersonalNumber.personalNumber);
    }


}