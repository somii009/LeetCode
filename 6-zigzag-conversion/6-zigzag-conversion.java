class Solution {
    public String convert(String s, int numRows) {
        if(numRows <= 1) return s;
        char[] c = s.toCharArray();
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0; i<sb.length; i++) {
            sb[i] = new StringBuilder("");
        }
        int size = s.length(), idx = 0;
        while(idx < size) {
            int i=0;
            while(i<numRows && i<size && idx<size) {
                sb[i++].append(c[idx++]);
            }
            int j = numRows-2;
            while(j>=1 && j<size && idx<size) {
                sb[j--].append(c[idx++]);                
            }
        }
        
        for(int i=1; i<sb.length; i++) {
            sb[0].append(sb[i]);
        }
        
        return sb[0].toString();
    }
}