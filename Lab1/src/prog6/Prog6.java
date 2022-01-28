package prog6;

public class Prog6 {
	
	public static String[] removeDups(String[] testData) {
		
		//we sort the array first
		for (int i = 0; i < testData.length; i++) {
	    	for (int j = i+1; j < testData.length; j++) {
	    		if (testData[i].equals(testData[j])) {
					String temp = testData[i+1];
					testData[i+1] = testData[j];
					testData[j] = temp;
				}
			}
			
		}
		
		//we find the non duplicate elements and put them in a new array
	    int n = testData.length;
	    String[] temp = new String[n];
        int j = 0;
  
        for (int i = 0; i < n; i++) {
            if (i+1 < n && !testData[i].equals(testData[i + 1])) {
                temp[j++] = testData[i];
            }
        }
  
        temp[j++] = testData[n - 1];
        
        //we copy the non duplicate elements to a n new array
        String[] newArray = new String[j];
        
        System.arraycopy(temp, 0, newArray, 0, j);
        
        return newArray;
		
	}
	
	
}
