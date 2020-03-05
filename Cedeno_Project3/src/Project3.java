import java.io.File;
import java.util.Scanner;
import java.io.IOException;

/*
*this Project3 class defines 5 groups of countries according to their GDP per capital. Also, it reads the countries file
*and creates a single stack of Country objects only with fair, good, and very good GDP. Then, it prints the stack. After that, it pops items from the stack
*from the front and back until is empty and insert it to a new created double linked  queue , then, it prints the queue. Then, deletes the Country objects with the GDP in between 30000 and 40000. After 
*its been deleted it trasfers it back to a stack with the new list 
*@author<Cristian Cedeno>
*@version<10/25/2019>
*/
public class Project3 {
	public static void main(String[] args){

	    int poor =0;
	    int fair =0;
	    int good =0;
	    int vgood = 0;
	    int excellent = 0;
	    String scannedName = "";
	    String scannedCode = "";
	    String scannedCapital = "";
	    double scannedPopulation = 0;
	    double scannedGDP = 0;
	    int scannedHappinessRank = 0;
	    int count = 0;
	    

	    String[] fields = new String[6];

	    Country[] countryList = new Country[155];

	    File file = new File("Countries3.csv");

	    

	    try{
	      Scanner input = new Scanner(file);
	      input.useDelimiter( ",|\n" );

	      for(int i=0; i<6; i++){
	        fields[i] = input.next();
	      }

	      
	      while(input.hasNext()){
	        
	        
	        scannedName = input.next();
	        scannedCode = input.next();
	        scannedCapital = input.next();
	        scannedPopulation = input.nextDouble();
	        scannedGDP = input.nextDouble();
	        scannedHappinessRank = input.nextInt();

	        countryList[count] = new Country(scannedName, scannedCode, scannedCapital, scannedPopulation, scannedGDP, scannedHappinessRank);

	        count++;
	         
	      }


	    }catch(IOException exception){
	      System.out.printf("EXCEPTION");
	    }
	    
	    Stack stack = new Stack();
	    
	    for(int i=0; i<155; i++){
	      if(countryList[i].getGDPPerCapital() < 1000){
	    	poor++;
	      }else if(countryList[i].getGDPPerCapital() > 1000 && countryList[i].getGDPPerCapital() < 5000){
	        fair++;
	        stack.push(countryList[i]);
	      }else if(countryList[i].getGDPPerCapital() > 5000 && countryList[i].getGDPPerCapital() < 20000){
	        good++;
	        stack.push(countryList[i]);
	      }else if(countryList[i].getGDPPerCapital() > 20000 && countryList[i].getGDPPerCapital() < 50000){
	        vgood++;
	        stack.push(countryList[i]);
	      }else{
	        excellent++;
	      }
	    }
	    
	    
	    
	    
	    System.out.printf("%-35s %-20s %-20s %-15.2s %-20.2s %s\n", fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
	    stack.printStack();
	    
	    
	    
	    Queue queue = new Queue();
	    
	    while(stack.isEmpty()== false) {
	    	
		    queue.insertFront(stack.pop());
		    
		    
		    if(stack.isEmpty()) {
		    	break;
		    }
		    queue.insertEnd(stack.pop());
		    
	    }
	    
	    System.out.printf("%-35s %-20s %-20s %-15.2s %-20.2s %s\n", fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
	    stack.printStack();
	    
	    System.out.printf("%-35s %-20s %-20s %-15.2s %-20.2s %s\n", fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
	    queue.printQueue();
	    
	    
	    boolean flag = true;
	    
	    
	    queue.findDelete(300000, 40000);
	    
	    
	  
	    System.out.printf("%-35s %-20s %-20s %-15.2s %-20.2s %s\n", fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
	    queue.printQueue();
	    
	
	
		while(!queue.isEmpty()) {
	    	
		    stack.push(queue.removeFront());
		    
		    
		    if(queue.isEmpty()) {
		    	break;
		    }
		    stack.push(queue.removeEnd());
	    
		}
		
		System.out.printf("%-35s %-20s %-20s %-15.2s %-20.2s %s\n", fields[0], fields[1], fields[2], fields[3], fields[4], fields[5]);
	    stack.printStack();
	    
	  

	}
	
	

}
