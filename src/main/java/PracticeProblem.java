/**
 * File: If statements
 * Author: Nithin.A
 * Date Created: Mar 23, 2026
 * Date Last Modified: Mar 25, 2026
 */
public class PracticeProblem {

	public static void main(String args[]) {

    }
    public static String evenOrOdd(int num){
	    if (0 == num%2) {
	        return "Even";
	    }
	return "Odd";
	}

	

    public static String teacherOrStudent(String name){
        if ("Kalisz".equals(name)){
            return "Teacher";
        }
    return "Student";
    }
    
        
    public static int fartherFromZero(int num){
        if (num>0){ 
            return num+5;
        }
        if (num < 0){
            int num1 = num - 5;
            return num1;
        }
        return 0;
    }
    }
