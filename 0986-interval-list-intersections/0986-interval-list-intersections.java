class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        
        List<int[]> result = new ArrayList<>();

        while(i<firstList.length && j< secondList.length){
            int s1 = firstList[i][0];
            int e1 = firstList[i][1];
            int[] a = new int[2];
            int s2 = secondList[j][0];
            int e2 = secondList[j][1];


            if(s1<=s2){
                if(e1>=s2){
                    a[0] = Math.max(s1,s2);
                    a[1] = Math.min(e1,e2);
                    result.add(a);
                }
            }else{
                if(e2>=s1){
                    a[0] = Math.max(s1,s2);
                    a[1] = Math.min(e1,e2);
                    result.add(a);

                }

            }

            if(e1<=e2){
                i++;
            }else{
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
        
    }
}