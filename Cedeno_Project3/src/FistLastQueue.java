/*this class creates the links for the double linked list Queue. On this class, we have to methods necessary for inserting on the front and back, and we also have 
 * the methods for deleting from the front and the back of the double linked list Queue.
 *@author<Cristian Cedeno>
 *@version<10/25/2019>
*/
class FirstLastQueue {
	private Country first;
	private Country last;
	
	/*this method creates an object of the FirstLasrQueue class, And it also sets first and last to null. It has no parameters 
	 * and no return value
	*/
	public FirstLastQueue(){
		first = null;
		last = null;
		
	}
	
	/*this method checkes if the double linked Queue is empty than 
	 * it returns true or false if its not and true if it is empty
	 *@return a boolean value according to if its empty or not 
	 */
	public boolean isItEmpty() {
		return (first == null && last == null);
		
	}
	
	/*this method inserts a Country object to the front of the double linked list
	  *@param qObject it reference to a Country object 
	  */
	public void insertTheFront(Country qObject) {
		if(isItEmpty()) {
			first = last = qObject;
		}else {
			first.previous = qObject;
			qObject.next = first;
			
			first = qObject;
			
		}
		
	}
	
	
	/*this method inserts a Country object to the front of the double linked list
	  *@param qObject it reference to a Country object 
	  */
	public void insertTheEnd(Country qObject) {
		
		
		if(isItEmpty()) {
			first = last = qObject;
		}else {
			last.next = qObject;
			qObject.previous = last;
			
		}
		
		
		last = qObject;
	}
	
	/*this method deletes the first object of the double linked list  and returns the object the was deleted 
	 *@return the object that was deleted 
	 */
	public Country removeTheFront() {
		Country temp = first;
		
		if(first.next == null) {
			last = null;
		}else {
			first.next.previous = null;
		}
		
		first = first.next;
		return temp;
	}
	
	/*this method deletes the last Country object of the double linked list, and it returns the object that was deleted. 
	  **@return the Country object that was deleted
	  */
	public Country removeTheEnd() {
		Country lastTemp = last;
		
		if(first.next == null) {
			first = null;
		}else {
			last.previous.next = null;
		}
		
		
		last = last.previous;
		return lastTemp;
	}
	
	/*this method prints the double linked queue to the console
	 *@param qObject it reference to a Country object 
	 */
	public void printTheList() {
		Country now = first;
		while(now != null) {
			now.printObject();
			now = now.next;
		}
		
		System.out.println("");
	}
	
	/*this method find an object on the double link list and deletes the object in between the
	 * numbers 30000 and 400000
	 *@param num1 the value of the first number 
	 */
	public void findAndDelete(double num1, double num2) {
		
		Country now = first;
		
		while(now != null) {
			while(now.getGDPPerCapital() < num1 || now.getGDPPerCapital() > num2) {
				now = now.next;
				if(now == null) {
					return;
				}
			}
			
			if(now == first) {
				first = now.next;
				//first.previous = null;
			}else {
				now.previous.next = now.next;
			}
			
			if(now == last) {
				last = now.previous;
			}else {
				now.next.previous = now.previous;
			}
		now=now.next;
		
		
		}
	}

	
}
	



	
