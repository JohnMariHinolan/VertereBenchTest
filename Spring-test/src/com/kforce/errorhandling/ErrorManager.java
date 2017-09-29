package com.kforce.errorhandling;

import java.util.HashSet;
import java.util.Iterator;

public class ErrorManager extends HashSet<ErrorObject>{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	  public boolean add(ErrorObject e) {
		 // log msg here
		 return super.add(e);
	  }
	 
	 @Override
	 public String toString() {
		 Iterator<ErrorObject> errorObjects = this.iterator();
		 StringBuilder sb = new StringBuilder();
		 
		while(errorObjects.hasNext()) {
			ErrorObject errorObj = errorObjects.next();
			sb.append(errorObj.toString() + "\n");
		}
		
	     return sb.toString();
	 }
}
