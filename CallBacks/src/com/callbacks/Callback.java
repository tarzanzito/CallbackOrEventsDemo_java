package com.callbacks;

class Callback implements OnEventListener {
	  
	private String id;
	
	public Callback(String id) {
		this.id = id;	
	}
	
	
    @Override
    public void onEvent(int inx)
    {
        System.out.println("Performing callback in synchronous Task. '" + id + "', inx= " + inx);
    }
}
