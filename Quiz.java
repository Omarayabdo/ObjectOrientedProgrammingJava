
import java.util.Scanner;
//importing a this package will allow me to use int, boolean, char, etc

public class Quiz {
//name of class is "Quiz"

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//initalizing the scanner(records user input) 
		//System.in is whatever the user inputs, scanner records
		
		System.out.println("Welcome  to Java Quiz!");
		//Welcoming quiz takers
		System.out.println("programmed by Omar Abdo :)");
		System.out.println(" ");
		
		int score = 0, number;
		//Assigning variable score to zero and then it will be incremented as you can a question right.
		//Also setting the object number as an int too
		boolean truefalse = false;
		//Declaring the object truefalse and setting it equal to false as the default 
		char multiplechoice = ' ';
		//Declaring the object an empty char space just so when we use it later it can be set as anything.
		
		
		//CODE FOR QUESTION 1//
		System.out.println(" ");
		System.out.println("Q1 - Is an int a primitive data type in Java? Enter true or false: ");
		//Asking the first question.
		truefalse = scan.nextBoolean();
		//Setting object as a boolean method to use functions true or false, scan records users input
		//Specifies that scanner will record "next" boolean
		if (truefalse == true) {
		//Asking program is the object "truefalse" is entered by the user as "true"
			System.out.println("Correct! Int is a primative data type in Java.");
			//The program will print that it is correct
			score++;
			//Since the user got the correct answer, the score will increment by adding 1
		}
		else {
		//If anything else is inputted by user..
			System.out.println("Wrong! Int is a primative data type in Java.");
			//The program will print you got the wrong answer.
			System.out.println(" ");
		}
		System.out.println("A primitive data type has variables store a single component of data ");
		System.out.println("while refrence data type has variables store multiple components of data. Examples ");
		System.out.println("of primative data types include boolean, char, byte, short, int, long, float, and double. ");
		System.out.println("Examples of primative data types include strings, arrays, and classes.");
		System.out.println(" ");
		//Explanation printed to user showing the differences in data types.
		
		
		//CODE FOR QUESTION 2//
		System.out.println(" ");
		System.out.println("Q2 - Which of these choices is a valid identifier? choose a-e: ");
		//This will ask the second question.
		System.out.println("(a) 1myVar");
		//Prints choice 1 
		System.out.println("(b) myVar");
		//Prints choice 2
		System.out.println("(c) wow#Var");
		//Prints choice 3
		System.out.println("(d) @#$myClass");
		//Prints choice 4
		System.out.println("(e) my class");
		//Prints choice 5
		multiplechoice = scan.next().charAt(0);
		//Specifies that scanner will record "next" char at 0
		//charAt(0) will give you character at that string, in this case, the first char that is inputed.
		if (multiplechoice == 'b') {
		//If the user inputs "b"..
			System.out.println("Correct! myVar is the valid identifier.");
			//The program will print that the user got the correct answer.
			score++;
			//Since the user got the correct answer, the score will be incremented up
		}
		else {
		//If user inputs anything besides "b"(the correct answer)..
			System.out.println("Wrong! myVar is the valid identifier.");
			//The program will let the user know they got the wrong answer.
		}
		System.out.println("An identifier contain only letters, numbers, '_'(underscore),"
				+ " and cannot begin with a digit or have any spaces.");
		//Explanation printed to user explaining what an identifier is.
		System.out.println(" ");
		
		
		//CODE FOR QUESTION 3//
		System.out.println(" ");
		System.out.println("Q3 - Which of these operators lets your find the remainder? choose a-e: ");
		//This will ask the third question.
		System.out.println("(a) +");
		//Prints choice 1 
		System.out.println("(b) -");
		//Prints choice 2
		System.out.println("(c) /");
		//Prints choice 3
		System.out.println("(d) *");
		//Prints choice 4
		System.out.println("(e) %");
		//Prints choice 5
		multiplechoice = scan.next().charAt(0);
		//charAt(0) will give you character at that string, in this case, the first char.
		if (multiplechoice == 'e') {
		//If the user enters "e"..
			System.out.println("Correct! % is the mod operator that lets you find the remainder.");
			//The program will let the user know they got the correct ansewr.
			score++;
			//And will increment the score up by 1 since the answer was correct.
		}
		else {
		//If the user enters any other anser besides "e"..
			System.out.println("Wrong! % is the mod operator that lets you find the remainder.");
			//The user will be told that they got the wronng answer.
		}
		System.out.print("The % operator returns the remainder of two numbers.");
		System.out.println(" ");
		
		
		//CODE FOR QUESTION 4//
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Q4 - What is the result of the following code where 'a' is a double.");
		//Asks question 4
		System.out.println("a = 4/5. Enter your answer as an integer: ");
		//Continuation of asking question 4
		number = scan.nextInt();
		//Users input for question 5 is stored/recorded and then used in if/else statement
		if (number == 0) {
		//If the user enters 0 as their answer for question 5...
			System.out.println("Correct! Because 4/5 is a double, you would round the "
					+ "decimal down and your result would be zero.");
			//Program will print that the user got the correct answer
			score++;
			//Increment the score up because user got the correct answer.
		}
		else {
		//If the user enters any other number that is not zero then...
			System.out.println("Wrong! Although 4/5 is the decimal 0.8, beacuse the "
					+ "object is a double, you would round down.");
			//The program will let the user know that they got the wrong answer.
		}
		System.out.println(" ");
		
		
		//CODE FOR QUESRION 5//
		System.out.println(" ");
		System.out.println("Q5 - What variable type can represent frations? choose a-e: ");
		//This will ask the fifth question.
		System.out.println("(a) String");
		//Prints choice 1 
		System.out.println("(b) float");
		//Prints choice 2
		System.out.println("(c) int");
		//Prints choice 3
		System.out.println("(d) char");
		//Prints choice 4
		System.out.println("(e) long");
		//Prints choice 5
		multiplechoice = scan.next().charAt(0);
		//charAt(0) will give you character at that string, in this case, the first char.
		if (multiplechoice == 'b') {
		//If the user enters "b"..
			System.out.println("Correct! float is the variable type that can represent fractions.");
			//The program will let the user know they got the correct ansewr.
			score++;
			//And will increment the score up by 1 since the answer was correct.
		}
		else {
		//If the user enters any other anser besides "e"..
			System.out.println("Wrong! float is the variable type that can represent fractions.");
			//The user will be told that they got the wronng answer.
		}
		System.out.print("String is a sequence of characters.");
		System.out.print("int is a data type that stores 32 bit and is based off whole numbers.");
		System.out.print("long is a data type that can store whole numbers from a large range of numbers.");
		System.out.print("char is a single character, that is a letter, a digit, a punctuation mark, a "
				+ "tab, a space or something similar.");
		//Explanation to the other data type choices.
		System.out.println(" ");
		
		
		//CODE FOR QUESTION 6//
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Q6 - Is || the AND operator in Java? Enter true or false: ");
		//Asking the sixth question.
		truefalse = scan.nextBoolean();
		//Setting object as a boolean method to use functions true or false, scan records users input
		//Specifies that scanner will record "next" boolean
		if (truefalse == false) {
		//Asking program is the object "truefalse" is entered by the user as "false"
			System.out.println("Correct! || is not the AND operator in Java.");
			//The program will print that it is correct
			score++;
			//Since the user got the correct answer, the score will increment by adding 1
		}
		else {
		//If anything else is inputted by user..
			System.out.println("Wrong! || is not the AND operator in Java.");
			//The program will print you got the wrong answer.
		}
		System.out.println("The AND operator is represented by &&.");
		System.out.println("The || is a representation of the OR operator.");
		System.out.println(" ");
		
		
		//CODE FOR QUESTION 7//
		System.out.println(" ");
		System.out.println("Q7 - What decimal value does the binary number 110 correspond to? Enter an integer.");
		number = scan.nextInt();
		//Users input for question 7 is stored/recorded and then used in if/else statement
		if (number == 6) {
		//If the user enters 6 as their answer for question 7...
			System.out.println("Correct! 110 in binary is the decimal number 6.");
			//Program will print that the user got the correct answer
			score++;
			//Increment the score up because user got the correct answer.
		}
		else {
		//If the user enters any other number that is not six then...
			System.out.println("Wrong! 110 in binary is the decimal number 6.");
			//The program will let the user know that they got the wrong answer.
		}
		System.out.println("110 in binary is equivalent to: ");
		System.out.println("(1 x 2^2) + (1 x 2^1) + (0 x 2^0)");
		System.out.println("Which equals = 6.");
		System.out.println(" ");
		
		
		//CODE FOR QUESTION 8//
		System.out.println(" ");
		System.out.println("Q8 - Is one of Java's principles 'write once, run anywhere?' Enter true or false: ");
		//Asking the eighth question.
		truefalse = scan.nextBoolean();
		//Setting object as a boolean method to use functions true or false, scan records users input
		//Specifies that scanner will record "next" boolean
		if (truefalse == true) {
		//Asking program is the object "truefalse" is entered by the user as "true"
			System.out.println("Correct! Java's principles include 'write once, run anywhere'.");
			//The program will print that it is correct
			score++;
			//Since the user got the correct answer, the score will increment by adding 1
		}
		else {
		//If anything else is inputted by user..
			System.out.println("Wrong! One of Java's principles include 'write once'.");
			//The program will print you got the wrong answer.
		}
		System.out.println(" ");
		
		
		//CODE FOR QUESTION 9//
				System.out.println(" ");
				System.out.println("Q9 - What will x += 5 evaluate to if"
						+ " x currently has the value of 10? Enter an integer.");
				number = scan.nextInt();
				//Users input for question 9 is stored/recorded and then used in if/else statement
				if (number == 15) {
				//If the user enters 6 as their answer for question 7...
					System.out.println("Correct! 15 is the correct answer.");
					//Program will print that the user got the correct answer
					score++;
					//Increment the score up because user got the correct answer.
				}
				else {
				//If the user enters any other number that is not fifteen then...
					System.out.println("Wrong! 15 is the correct answer.");
					//The program will let the user know that they got the wrong answer.
				}
				System.out.println("because x  has the valuse of 10,");
				System.out.println("then you can write x += 5 as 10 += 5");
				System.out.println("Which equals = 15.");
				System.out.println(" ");
		
		
		//CODE FOR QUESTION 10//
		System.out.println(" ");
		System.out.println("Q10 - Which company(ies) use Java language in their programming? choose a-e: ");
		//This will ask the tenth question.
				System.out.println("(a) Google");
				//Prints choice 1 
				System.out.println("(b) Uber");
				//Prints choice 2
				System.out.println("(c) Netflix");
				//Prints choice 3
				System.out.println("(d) Amazon");
				//Prints choice 4
				System.out.println("(e) All of the above");
				//Prints choice 5
				multiplechoice = scan.next().charAt(0);
				//charAt(0) will give you character at that string, in this case, the first char.
				if (multiplechoice == 'e') {
				//If the user enters "b"..
					System.out.println("Correct! All of the companies listed use Java.");
					//The program will let the user know they got the correct ansewr.
					score++;
					//And will increment the score up by 1 since the answer was correct.
				}
				else {
				//If the user enters any other anser besides "e"..
					System.out.println("Wrong! They ALL use Java programming.");
					//The user will be told that they got the wronng answer.
				}
				System.out.println("Java is a programming language that beats most of its competitors");
				System.out.println("in ratings all over the world. It is a fast-performing, object-oriented programming");
				System.out.println("language that is used by many famous companies");
				//Explanation to Java and how famous it is
				System.out.println(" ");
				
				System.out.println(" ");
		//The program has recorded the score for every question that user has gotten correct and it has been 
		//incremented based off which answers were right
			if (score <= 3)
				System.out.print("You scored " + score + " . You need to study more Java!!");
			else if (score <= 7)
				System.out.print("Not bad!!" + "You scored " + score + "! You know a good amount of Java, keep it up!");
			else if (score == 10)
				System.out.print("You got a perfect score!! nice job!");
			
			
		scan.close();
	}

}
