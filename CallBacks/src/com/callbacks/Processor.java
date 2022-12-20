package com.callbacks;

class Processor {
	
	 private OnEventListener listener; // listener field
  
    // setting the listener
    public void registerOnEventListener(OnEventListener listener)
    {
        this.listener = listener;
    }
  
    // synchronous task
    public void run()
    {
        System.out.println("Process Started..");
  
        for(int i=0; i < 5; i++) {
        	
        	 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}   
        	 
        	// check if listener is registered.
	        if (this.listener != null) {
	  
	            // "fire event" (notify) the callback method
	            listener.onEvent(i);
	        }
        }
        
        System.out.println("Process Finished...");
    }
}