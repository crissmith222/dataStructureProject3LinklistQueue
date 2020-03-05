/*this class creates the links for the single linked stack. it checks if the array is empty with the , and isters country objects to the stack.
 * also, this class contains the method for deleting the objects and displetying the stack.
 *@author<Cristian Cedeno>
 *@version<10/25/2019>
*/
class LinkList {
	private Country first;
	
	/*this method creates an LinList object that will be used to set first = null
	 * , and it has no parameters
	  */
	public LinkList() {
		first = null;
	}
	
	/*this method checkes if the link of the Stack is empty than 
	 * it returns true or false if its not and true if it is 
	  *@return a boolean value according to if its empty or not 
	  */
	public boolean isEmpty() {
		return(first == null);
	}
	
	/*this method inserts an object of Country type to the single linket stack  
	  *@param cObject a reference to an object of Country type
	  */
	public void insertFirst(Country cObject) {
		cObject.next = first;
		first = cObject;
	}
	
	/*this method deletes the first value of the Stack linked list and sets temp to first and first to the next first, also, returns the value of hold
	  *@return the value of hold which is a country object
	  */
	public Country deleteFirst() {
		Country hold = first;
		first = first.next;
		return hold;
	}
	
	/*this method prints to the monitor the current linked list of Stack. it does not have any parameteres, 
	 * and it does not have any return value 
	 */
	public void displayList() {
		Country hold = first;
		while(hold != null){
			hold.printObject();
			hold = hold.next;
		}
		
		System.out.println("");
	}
	
	
}
