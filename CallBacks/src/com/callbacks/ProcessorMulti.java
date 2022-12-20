package com.callbacks;

import java.util.ArrayList;
import java.util.List;

class ProcessorMulti {
	
	 private List<OnEventListener> listenerList; // listener list
  
    // add listener
    public void addOnEventListener(OnEventListener listener)
    {
        this.listenerList.add(listener);
    }
  
    // add listener
    public void removeOnEventListener(OnEventListener listener)
    {
        this.listenerList.remove(listener);
    }
    
    public ProcessorMulti() {
    	this.listenerList = new ArrayList<>();
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

        	 //"Fire event" (notify) for all consumers
        	for (OnEventListener listener : this.listenerList) {
        		 listener.onEvent(i);
	        }
        }
        
        System.out.println("Process Finished...");
    }
}