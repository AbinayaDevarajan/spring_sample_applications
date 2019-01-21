package com.springexample;

public class LogFilter {
	private boolean logFilter;
	private String filterProperty;

	public boolean getLogFilter() {
		return logFilter;
	}

	public void setLogFilter(boolean logFilter) {
		this.logFilter = logFilter;
	}

	public String getFilterProperty() {
		return filterProperty;
	}

	public void setFilterProperty(String filterProperty) {
		System.out.println("Manipulating the property value:"+filterProperty);
		
		
		this.filterProperty = filterProperty.replaceAll("\\s", "\\\\s").replaceAll("\\[", "\\\\[").replaceAll("\\]", "\\\\]").replaceAll("\\:", "\\\\:").concat("+");
		System.out.println("Property manipulated to :"+filterProperty);
		
	}
	
	
	

}
