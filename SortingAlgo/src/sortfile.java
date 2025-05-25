
public class sortfile {

	public static void main(String[] args) {
		  
	      
	        String  array [] = {"Aaron", "Abigail", "Alexander", "Alice", "Benjamin", "Brianna", "Caleb", "Charlotte", "Daniel",
	            "Diana", "Elijah", "Emma", "Gabriel", "Grace", "Hannah", "Isaac", "Isabella", "Jacob", "Jasmine", "Joshua", "Katherine",
	            "Kevin", "Leah", "Liam", "Lucas", "Madison", "Mathew", "Mia", "Nathan", "Noah Olivia", "Owen", "Patrick", "Penelope",
	            "Quentin", "Rachel", "Samuel", "Sarah", "Sophia", "Steven", "Thomas", "Tristan", "Uriel", "Vanessa", "Victor", "Willian",
	            "Xander", "Yasmine", "Zachary", "Zoe"}; // for bubble sort
	       
	        long bubbleTime = System.nanoTime();
	        sort(array); // sorts to DESCENDING
	        long bubbletimeEND = System.nanoTime();
	        System.out.println("Time For BUBBLESORT: " + ((bubbletimeEND - bubbleTime) / 1000) + " ms");
	        
	      ReSort(array); // SORT ITS BACK to original
	      
	      long SelectionStart = System.nanoTime();
	        selection(array); // gets minimum (Selection Sort)
	        long SelectionEnd = System.nanoTime();
	        
	        System.out.println("Time For SELECTIONEND: " + ((SelectionEnd - SelectionStart) / 1000) + " ms");
	        
	       
	       
	      
	      System.out.println("START OF INSERTION ");
	      long startTime = System.nanoTime();
	        insertion(array); // USES ANOTHER ARRAY PLEASE CHECK THE FUNCTION COMMENT
	        long endtime = System.nanoTime();
	        
	        System.out.println("Time For Insertion: " + ((endtime - startTime) / 1000) + " ms");
	        
	        
	       
	        
	    }
	    
	    // BUBBLE SORT DESCENDING ORDER
	    static void sort (String array []){
	         String temp;
	         
	          
	        
	        
	         
	          
	         
	        
	        for(int i = 0; i < array.length - 1; i ++){
	           for (int k = 0; k < array.length - i - 1; k++){
	           
	           
	          if (array[k].compareTo(array [k + 1]) < 0){
	              temp = array [k];
	              array [k] = array [k + 1];
	              array [k + 1] = temp;
	          }
	           
	           
	           
	           
	           }
	           
	           
	           
	           
	           
	           
	           
	           
	           
	            
	            
	        }
	        System.out.println("START. OF DESCENDING ORDER");
	         for (Object obj : array){
	             
	           System.out.println(obj);
	           
	             
	       }
	         
	        
	         System.out.println("END OF DESCENDING ORDER");
	    }
	    // sorts it back to be reused
	    
	    static void ReSort (String array []){ 
	         String temp;
	         
	          
	        
	        
	         
	          
	         
	        
	        for(int i = 0; i < array.length - 1; i ++){
	           for (int k = 0; k < array.length - i - 1; k++){
	           
	           
	          if (array[k].compareTo(array [k + 1]) > 0){
	              temp = array [k];
	              array [k] = array [k + 1];
	              array [k + 1] = temp;
	          }
	           
	           
	           
	           
	           }
	           
	           
	           
	           
	           
	           
	           
	           
	           
	            
	            
	        }
	        System.out.println("SORTED BACK IN ORDER");
	        
	         
	        
	    }
	    static void selection (String array []){ // SELECTION SORT GETS THE MINIMUM
	        
	        String min = "";
	        
	        for(int i = 0; i < array.length-1; i++){
	            
	            for(int j = 0; j <array.length - i - 1; j++){
	                
	                
	                if(array[j].compareTo(array[j+1]) < 1){
	                    
	                    if(i ==array.length-2){
	                        min = array[j+ 1];
	                    }else{min = array[j];}
	                    
	                    
	                    array[j] = array [j+1];
	                    array[j+1] = min;
	                    
	                    
	                   
	                    
	                }
	            }
	            
	            
	            
	        }
	         System.out.println("THE MINIMUM IS [SELECTION ALGO] " + min);
	    }
	 
	    
	   // DESCENDING
	    static void insertion(String array [] ) {
	    	
	    	
	    	// YES THERE ARE QUITE OF CHANGES IN THIS ARRAY - Palencia
	    	 String[] names = {
                     "Katherine", "Benjamin", "Briana", "Leah", "Liam", "Lucas", "Madison", "Matthew", "Mia", "Nathan",
                     "Gabriel", "Abigail", "Alice", "Kevin", "Caleb", "Charlotte", "Emma", "Daniel", "Diana", "Elijah", 
                     "Grace", "Hannah", "Isaac", "Isabella", "Jacob", "Jasmine", "Joshua", "Aaron", "Noah", "Olivia", "Owen", 
                     "Patrick", "Penelope", "Quentin", "Rachel", "Samuel", "Sarah", "Sophia", "Steven", "Thomas","Tristan",
                     "Uriel","Vanessa","Victor", "William", "Xander", "Yastime", "Zachary","Zoe", "Mark"
                   };
	    	
	    	
	    	for (int i = 0; i <names.length; i++) {
	    		
	    		String check = names[i];
	    		
	    		
	    		int  j = i - 1;
	    		while (j >= 0 && names[j].compareTo(check) < 0) {
	    			
	    			 names[j + 1] = names[j];
	    			j--;
	    		}
	    		
	    		names[j + 1] = check;
	    		}
	    	System.out.println("======================== INSERTION LOOP ===============================");
	    	for(String obj : names) {
	        	System.out.println(obj);
	        }
	    	  System.out.println("======================== END OF INSERTION LOOP ===============================");	
	    	  
	    	  
	    		}
	    		
	  
	    		
	    		
	    	


		    
	    
	}