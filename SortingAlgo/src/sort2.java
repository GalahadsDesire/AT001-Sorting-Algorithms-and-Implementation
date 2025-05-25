
public class sort2 {

	public static void main(String[] args) {
		
		// Just basis
		 String[] BASIS = {
                 "Katherine", "Benjamin", "Briana", "Leah", "Liam", "Lucas", "Madison", "Matthew", "Mia", "Nathan",
                 "Gabriel", "Abigail", "Alice", "Kevin", "Caleb", "Charlotte", "Emma", "Daniel", "Diana", "Elijah", 
                 "Grace", "Hannah", "Isaac", "Isabella", "Jacob", "Jasmine", "Joshua", "Aaron", "Noah", "Olivia", "Owen", 
                 "Patrick", "Penelope", "Quentin", "Rachel", "Samuel", "Sarah", "Sophia", "Steven", "Thomas","Tristan",
                 "Uriel","Vanessa","Victor", "William", "Xander", "Yastime", "Zachary","Zoe", "Mark"
               };
		 
		
		 String [] arraymerge = {
                 "Katherine", "Benjamin", "Briana", "Leah", "Liam", "Lucas", "Madison", "Matthew", "Mia", "Nathan",
                 "Gabriel", "Abigail", "Alice", "Kevin", "Caleb", "Charlotte", "Emma", "Daniel", "Diana", "Elijah", 
                 "Grace", "Hannah", "Isaac", "Isabella", "Jacob", "Jasmine", "Joshua", "Aaron", "Noah", "Olivia", "Owen", 
                 "Patrick", "Penelope", "Quentin", "Rachel", "Samuel", "Sarah", "Sophia", "Steven", "Thomas","Tristan",
                 "Uriel","Vanessa","Victor", "William", "Xander", "Yastime", "Zachary","Zoe", "Mark"
               };
		 
		 String [] arrayquicksort = { "Katherine", "Benjamin", "Briana", "Leah", "Liam", "Lucas", "Madison", "Matthew", "Mia", "Nathan",
                 "Gabriel", "Abigail", "Alice", "Kevin", "Caleb", "Charlotte", "Emma", "Daniel", "Diana", "Elijah", 
                 "Grace", "Hannah", "Isaac", "Isabella", "Jacob", "Jasmine", "Joshua", "Aaron", "Noah", "Olivia", "Owen", 
                 "Patrick", "Penelope", "Quentin", "Rachel", "Samuel", "Sarah", "Sophia", "Steven", "Thomas","Tristan",
                 "Uriel","Vanessa","Victor", "William", "Xander", "Yastime", "Zachary","Zoe", "Mark"
               };
		 
		 
		  long startMerge = System.nanoTime();
		 // invoking the first function
		  Mergesort(arraymerge);
		 
		 System.out.println("MERGE SORT");
		 for (int j = 0; j < arraymerge.length;j++) {
			 
		 System.out.println(arraymerge[j] + " ");
		 }
		 long durationMerge = (System.nanoTime() - startMerge) / 1000000;
		 System.out.println("END OF MERGE SORT");
		 System.out.printf("============= DURATION (%s) : %d ms ==============%n".formatted("MergeSORT", durationMerge));
	        
		 System.out.println("START OF QUICK SORT");
		 long StartQUICK = System.nanoTime();
		 quicksort(arrayquicksort,0,arrayquicksort.length - 1);
		 
		 for (String i : arrayquicksort) {
			 System.out.print(i + " ");
		 }
		 
		 long durationquick = (System.nanoTime() - StartQUICK) / 1000000;
		 System.out.println("END OF QUICK SORT.");
		 System.out.printf("============= DURATION (%s) : %d ms ==============%n".formatted("QUICK SORT", durationquick));
	        
		 }
		
	
	
	
	
	// recursive approach btw
private static void quicksort(String[] arrayquicksort, int i, int j) {
		
	if(j <= i) return;
	
	int pivot = quickpart2(arrayquicksort, i,j);
	
	// Recursive approach
	quicksort(arrayquicksort,i,pivot - 1);
	quicksort(arrayquicksort,pivot + 1, j);
		
	}
	
		


static int quickpart2 (String[] arrayquicksort,int i,int j) {
	
	String piv = arrayquicksort[j];
	
	int pol = i - 1;
	
	for(int k = i; k<= j - 1; k++) {
		if(arrayquicksort[k].compareTo(piv) < 0) {
			
			pol++;
			
			String store= arrayquicksort[pol];
			arrayquicksort[pol] = arrayquicksort[k];
			arrayquicksort[k] = store;
			
		}
	}
	pol++;
	String store= arrayquicksort[pol];
	arrayquicksort[pol] = arrayquicksort[j];
	arrayquicksort[j] = store;
	
	
	return pol;
}






static void Mergesort(String arraymerge[]) {
	
	 int L = 0;
	 int R = 0;
	 
	 int LENGTH = arraymerge.length;
	 
	
	 if(LENGTH <=1) return;
		 
		 
		 // halves the array into two
		 int halve = LENGTH /2;
		 String [] left = new String [halve];
		 
		 String [] right = new String[LENGTH - halve];
		 
		 
		 for (; L < LENGTH; L++){
			 if (L < halve) {
				 left[L] = arraymerge[L] ;
				 
				 
			 } else {
				 right[R] = arraymerge[L];
				 
				 R++;
			 }
			 
		 }
		 // RECURSION eats alot of memory but ehh its the only solution
		 Mergesort(left);
		 Mergesort(right);
		 
		 
		 
		 merging(left,right,arraymerge);
}

		 

	 

static void merging(String Left[], String Right[], String arraymerge[]) {
	int Rite = 0;
	int leftt = 0;
	int K = 0;
	
	int sizeofleft = Left.length;
	int sizeofright = Right.length;
	
	
	while (leftt < sizeofleft && Rite  < sizeofright) {
		if (Left[leftt].compareTo(Right[Rite]) < 0) {
			arraymerge[K] = Left[leftt];			
			K++;
			leftt++;
		} else {
			arraymerge[K] = Right[Rite];
			K++;
			Rite++;
		}
		}
	while(leftt < sizeofleft) {
		arraymerge[K] = Left[leftt];
		K++;
		leftt++;
	}
	while (Rite <sizeofright) {
		arraymerge[K] = Right[Rite];
		K++;
		Rite++;
	}
	}


	
	}
	
	



	


