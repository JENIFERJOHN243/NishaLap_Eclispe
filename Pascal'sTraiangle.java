public class Solution { 
    public List<List<Integer>> generate(int numRows) { 
        List<List<Integer>> pattern = new ArrayList<List<Integer>>(); 
        if (numRows <=0){ 
            return pattern; 
        } 
        for (int i=0; i<numRows; i++){ 
            List<Integer> row = new ArrayList<Integer>(); 
            for (int j=0; j<i+1; j++){ 
                if (j==0 || j==i){ 
                    row.add(1); 
                } else { 
                    row.add(pattern.get(i-1).get(j-1)+pattern.get(i-1).get(j));
                }
            }
            pattern.add(row); 
        } 
        return pattern;
    } 
}