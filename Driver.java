// Honor Pledge:
import java.util.Scanner;

//import Stack;

//gui for the user
public class Driver {
	private static Scanner scanner = new Scanner( System.in );
	
	public static void main(String[] args){
		
		//initializing stacks
		int len = 0;
		//first stack was simply for debugging
		//Stack<String> fullz = new Stack<String>(100);
		Stack<String> firstname = new Stack<String>(100);
		Stack<String> lastname = new Stack<String>(100);
		Stack<String> addressa = new Stack<String>(100);
		Stack<String> addressb = new Stack<String>(100);
		Stack<String> city = new Stack<String>(100);
		Stack<String> state = new Stack<String>(100);
		Stack<String> zip = new Stack<String>(100);
		Stack<String> id = new Stack<String>(100);
		Stack<String> gpa = new Stack<String>(100);
		
		String saveText;
		int response = 1;
		while(response != 3){
			//menu
			System.out.println("");
			System.out.println("1. Load Students (From File)");
			System.out.println("2. Print Stack");
			System.out.println("3. Exit Program");
			System.out.println("");
			System.out.print("Please enter your selection:");
			//user input
			response = scanner.nextInt();
			System.out.println("");
			//export text file and distribute
			if ( response == 1){
				//uses student.java to import student data
				saveText = Student.readfromFile();
				String[] breaks = saveText.split("-");
				len = breaks.length;
				
				for(int i=0; i<len; i++) {
					//System.out.println(breaks[i]);
					//fullz.push(breaks[i]);
					//takes the information from each of the lines
					String[] info = breaks[i].split(",");
					//organizing data
					firstname.push(info[1]);
					lastname.push(info[0]);
					addressa.push(info[2]);
					addressb.push(info[3]);
					city.push(info[4]);
					state.push(info[5]);
					zip.push(info[6]);
					id.push(info[7]);
					gpa.push(info[8]);
				}
				System.out.println("Students Loaded From File! ");
			}
			//prints the stack!
			else if( response == 2){
				for(int i =0; i<len; i++) {
					//System.out.println(fullz.pop());
					//System.out.println(firstname.pop());
					//System.out.println(lastname.pop());
					//System.out.println(addressa.pop());
					//System.out.println(addressb.pop());
					//System.out.println(city.pop());
					//System.out.println(state.pop());
					//System.out.println(zip.pop());
					//System.out.println(id.pop());
					//System.out.println(gpa.pop());
					String check = addressb.pop();
					String address = "";
					if(check != "") {
						address = addressa.pop() + " " + check + " " + city.pop() + "," + state.pop() + " " + zip.pop();
					} else {
						address = addressa.pop() + " " + city.pop() + "," + state.pop() + " " + zip.pop();
					}
					System.out.printf("ID: %s   Name: %s %s  Address: %s  GPA: %s\n",id.pop(), firstname.pop(), lastname.pop(), address, gpa.pop());
				
				}
			}
			//leaves
			else if(response == 3){
				System.out.println("Goodbye!");
				break;
			//causes re-entry from input error!
			} else{
				System.out.println("Invalid Choice!");
			}
		}
	}
}