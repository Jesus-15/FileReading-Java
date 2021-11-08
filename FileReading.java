import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class FileReading {

	// Task 1 Reading a file with two strings of data
	public String readName1(String fileName) throws Exception { // Checking the file is there
		
		File fileNames = new File(fileName); 
		Scanner fileScan = new Scanner(fileNames);
		
		String name = fileScan.nextLine(); // reading first string
		String surname = fileScan.nextLine(); // reading second string
		
		fileScan.close();
		return name + " " + surname;
	}
	
	// Task 2 Catching the exception of  file not found
	public String readName2(String fileName)  {
		
		String fullName = "";
		// Reading the file
		try {
			File fileNames = new File(fileName);
			Scanner fileScan = new Scanner(fileNames);
			String name = fileScan.nextLine();
			String surname = fileScan.nextLine();
			fullName = name + " " + surname;
			fileScan.close();
		}
		catch (FileNotFoundException ex) { // Catching the exception
			fullName = "Invalid filename";
		}
		return fullName;
	}
	
	// Task 3 Reading names from a file and store it in an array
	public String[] readNames(String file1) throws Exception {
		
		File fileName = new File(file1);
		Scanner fileScan = new Scanner(fileName);
		String fullName[] = new String[10];
		// Reading line by line
		for(int i = 0; i < 10; i++){ 
			fullName[i] = fileScan.nextLine(); 
		}
		fileScan.close();
		return fullName;
	}
	
	// Task 4 Reading numbers from a file and store it in an array
	public int[] readNumbers1(String numberFile) throws Exception {
		
		File fileNum = new File(numberFile);
		Scanner fileScan = new Scanner(fileNum);
		
		int allNumbers[] = new int[20];
		int count = 0;
		// Reading values to a maximum of 20 values
		while(fileScan.hasNextInt() &&  count < 20) {
			
			allNumbers[count] = fileScan.nextInt();	
			count++;
		}
		fileScan.close();
		return allNumbers;
	}
	
	
	// Task5 Reading numbers from a file and store it in an array but if data is not a number will be ignored
	public int[] readNumbers2(String numberFile) throws Exception {
		
		File fileNum = new File(numberFile);
		Scanner fileScan = new Scanner(fileNum);
		
		int allNumbers[] = new int[20];
		int count = 0;
		
		while(fileScan.hasNext() &&  count < 20) {
			if (fileScan.hasNextInt()) {
			allNumbers[count] = fileScan.nextInt();	
			count++;	
		}
			else { //Ignoring the data that is not a number
			fileScan.nextLine();
			}
		}
		fileScan.close();
		return allNumbers;
	}
	
	
	//  Task 6 Read from a file and concatenate names and numbers 
	public String[] readAddressBook(String nameNumFile) throws Exception {
		
		File file = new File(nameNumFile);
		Scanner fileScan = new Scanner(file);
		
		String[] name = new String[5];
		
		for (int i = 0; i < name.length; i++) {
			name[i] = fileScan.nextLine()+ ": " +  fileScan.nextLine(); // Concatenating names and numbers
		}
		
		fileScan.close();
		return name;
	}
}
