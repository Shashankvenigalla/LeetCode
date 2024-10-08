class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < mapping.length ; i++){
            map.put(i, mapping[i]);
        }

        int n = nums.length;
        int[][] decoded = new int[n][2];

        for(int i = 0 ; i < n ; i ++){
            int num = nums[i];
            int mul = 1;
            int decode = 0;

            if(num == 0){
                decode = map.get(0);
            } else{
                while( num> 0){
                    int a = num % 10;
                    num = num / 10;
                    decode = decode + map.get(a) * mul ;
                    mul = mul * 10;
                }
            }
            
            decoded[i][0] = decode;
            decoded[i][1] = i;
        }

        Arrays.sort(decoded, (a, b) -> Integer.compare(a[0], b[0]));

        int[] re = new int[n];
        for (int i = 0; i < n; i++) {
            re[i] = nums[decoded[i][1]];
        }

        return re;

    }
}