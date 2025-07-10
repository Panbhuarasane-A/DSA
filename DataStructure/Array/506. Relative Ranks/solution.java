class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<List<Integer>> map=new ArrayList<>();
        String result[]=new String[score.length];
        for(int i=0;i<score.length;i++)
        {
            List<Integer> list=new ArrayList<>();
            list.add(score[i]);
            list.add(i);
            map.add(list);
        }
       map.sort((a, b) -> b.get(0) - a.get(0));//sorted in decending order
       for(int i=0;i<map.size();i++)
       {
            int index=map.get(i).get(1);
            if(i==0)
            {
                result[index]="Gold Medal";
            }
            else if(i==1)
            {
                result[index]="Silver Medal";
            }
            else if(i==2)
            {
                result[index]="Bronze Medal";
            }
            else
            {
                result[index]=Integer.toString(i+1);
            }
       }
       return result;

    }
}
