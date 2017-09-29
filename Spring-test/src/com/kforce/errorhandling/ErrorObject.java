package com.kforce.errorhandling;

// pojo for stacking error
public class ErrorObject {
	
	private String errorCode;
	
	private String errorMsg;
	
	private String otherMsg = "";

	
	
	public ErrorObject(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		
	}
	
	public ErrorObject(String errorCode, String errorMsg, String otherMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.otherMsg = otherMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getOtherMsg() {
		return otherMsg;
	}

	public void setOtherMsg(String otherMsg) {
		this.otherMsg = otherMsg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((errorCode == null) ? 0 : errorCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ErrorObject other = (ErrorObject) obj;
		if (errorCode == null) {
			if (other.errorCode != null)
				return false;
		} else if (!errorCode.equals(other.errorCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Error Code " + errorCode + ": Message =" + errorMsg + " | " + otherMsg + "";
	}
	
	
//	@Override
//	public boolean equals(Object o){
//		
//		
//		
//		return false;
//	}
	
	
}
