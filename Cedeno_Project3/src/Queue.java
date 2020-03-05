/*this class creates the double linked queue . This class calls the method for inserting objects on the front and the back.
 * Also, it calls the methods for deleting the country objects front the front and the back. Also, this method contain the method for printing th Queue list
 *@author<Cristian Cedeno>
 *@version<10/25/2019>
*/
public class Queue {
	private FirstLastQueue qList;
	
	/*this method creates an object for the Queue clas and it sets qList to new FirstLasQueue. It has no parameter or return value
	*/
	public Queue() {
		qList = new FirstLastQueue();
	}
	
	/*this method checkes if the link of the Stack is empty than 
	* it returns true or false if its not and true if it is 
	*@return a boolean value according to if its empty or not 
	*/
	public boolean isEmpty() {
		return qList.isItEmpty();
	}
	
	/*this method checkes if the link of the Stack is full than 
	* it returns true or false if its not and true if it is 
	*@return a boolean value according to if its full or not 
	*/
	public boolean isFull() {
		return false;
	}
	
	/*this method inserts a Country object to the front of the double linked list
	 *@param qObject it reference to a Country object 
	 */
	public void insertFront(Country qObject) {
		qList.insertTheFront(qObject);
	}
	
	/*this method inserts a Country object to the front of the double linked list
	  *@param qObject it reference to a Country object 
	  */
	public void insertEnd(Country qObject) {
		qList.insertTheEnd(qObject);
	}
	
	/*this method deletes the first object of the double linked list  and returns the object the was deleted 
	 *@return the object that was deleted 
	 */
	public Country removeFront() {
		return qList.removeTheFront();
	}
	
	/*this method deletes the last Country object of the double linked list, and it returns the object that was deleted. 
	  **@return the Country object that was deleted
	  */
	public Country removeEnd() {
		return qList.removeTheEnd();
	}
	
	/*this method prints the double linked queue to the console, and it has no parameters or return value
	 */
	public void printQueue() {
		
		System.out.print("\nQueue\n------------------------------------------------------------------------------------------------------------------------------------\n");
		
		qList.printTheList();
	}
	
	
	/*this method find an object on the double link list and deletes the object in between the
	 * numbers 30000 and 400000
	 *@param num1 the value of the first number 
	 */
	public void findDelete(double num1, double num2) {
		qList.findAndDelete(num1, num2);
	}
}
