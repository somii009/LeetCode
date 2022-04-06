class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        
        int sum = 0;
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        sum = map.get(s.charAt(s.length()-1));
        for(int i=s.length() -2; i>=0; i--){
            int num = map.get(s.charAt(i));
            int next = map.get(s.charAt(i+1));
            if(num>=next) sum += num;
            else sum -= num;
        }
        
        return sum;
    }
}