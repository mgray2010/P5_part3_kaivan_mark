package FList; 

import LApp.Entity; 

public   class  MyNode <T> {
	

    T elem;

	
    MyNode right;

	

    public MyNode(T elem) {
        this.elem = elem;
        right = null;
    }

	

    public String toString() {
        return elem.toString();
    }

	
	
	MyNode left;

	
	
	public MyNode(Entity elem) {
		left = null;
	}


}
