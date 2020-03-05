/*this class creates the linked linked stack. This class calls the methods for inserting Country objects.
 * Also, it calls the methods for deleting the country objects into the stack. In additon This method contain the method for printing the single listed stack list
 *@author<Cristian Cedeno>
 *@version<10/25/2019>
*/
class Stack {
	private  LinkList stackList;
	
	/*this method creates an object for the stack class and sets stackList to 
	 * new stackList()
	 */
	public Stack() {
		stackList = new LinkList();
	}
	
	/*this method pushes a new country object to the stack list by calling the method insertFirst() with the object reference as
	 * parameter
	 *@param cObject contains the reference of a Counrty object
	 **/
	public void push(Country cObject) {
		stackList.insertFirst(cObject);
		
	}
	
	/*this method takes a Counrty object out of the stack list, and it returns to object by calling deleteFirst()
	 * @return the Counrty object the is been poped
	 */
	public Country pop() {
		return stackList.deleteFirst();
	}
	
	/*this method checkes if the link of the Stack is empty than 
	 * it returns true or false if its not and true if it is 
	 *@return a boolean value according to if its empty or not 
	 */
	public boolean isEmpty() {
		return(stackList.isEmpty());
	}
	
	/*this method checkes if the link of the Stack is full than 
	* it returns true or false if its not and true if it is 
	*@return a boolean value according to if its full or not 
	*/
	public boolean isFull() {
		return false;
	}
	
	
	/*this method prints the single linked stack to the console, and it has no parameters or return value
	 */
	public void printStack() {
		System.out.print("\nStack\n------------------------------------------------------------------------------------------------------------------------------------\n");
		stackList.displayList();
	}
}
