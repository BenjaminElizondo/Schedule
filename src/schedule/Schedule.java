/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author 20111
 */
public class Schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName = "Benjamin";
        String lastName = "Elizondo";
        int year = 2020;
                
        System.out.println("My name is " + firstName
                            + " " + lastName + " and I graduate in "
                                  + year);
        
        String periodOne = "Honors English";
        String periodTwo = "Honors Spanish S3";
        String periodThree = "AP Computer Science A";
        String periodFour = "Honors Enviromental Science";
        String periodFive = "Honors Global Studies";
        String periodSix = "Honors Algebra 2 & Trig";
        String periodSeven = "Honors American History";
        
        String periodOneTeacher = "Cody Morrissey";
        String periodTwoTeacher = "Nadia Khan-Roberts";
        String periodThreeTeacher = "Matthew Larrubia";
        String periodFourTeacher = "Christopher Connell";
        String periodFiveTeacher = "James Dugard";
        String periodSixTeacher = "Lissette Leonard";
        String periodSevenTeacher = "John Cunningham"; 
    
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - +"); 
        System.out.println("| 1 | " + periodOne + "               |                 " + periodOneTeacher + " | ");
        System.out.println("| 2 | " + periodTwo + "            |          " + periodTwoTeacher +     "    | ");
        System.out.println("| 3 | " + periodThree + "        |        " + periodThreeTeacher +"        | ");
        System.out.println("| 4 | " + periodFour + "  |       " + periodFourTeacher + "      | ");
        System.out.println("| 5 | " + periodFive + "        |              " + periodFiveTeacher + "      | ");
        System.out.println("| 6 | " + periodSix + "      |      " + periodSixTeacher + "          | ");
        System.out.println("| 7 | " + periodSeven + "      |          " + periodSevenTeacher + "       | ");
        System.out.println("+ - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - +"); 
    }       
