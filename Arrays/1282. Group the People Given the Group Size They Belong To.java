//1282. Group the People Given the Group Size They Belong To

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> group = new ArrayList<List<Integer>>();
        HashMap<Integer, List<Integer>> mappings = new HashMap<Integer, List<Integer>>();
        for(int i=0;i<groupSizes.length;i++)
        {
            if(mappings.containsKey(groupSizes[i]))
            { 
                 mappings.get(groupSizes[i]).add(i);
            }
             else
             {
                 mappings.put(groupSizes[i],new ArrayList<Integer>());
                 mappings.get(groupSizes[i]).add(i);
             }

        }

        for(int key : mappings.keySet())
        {
            List<Integer> result = new ArrayList<Integer>();
            for(int i=0;i<mappings.get(key).size();i++)
            {
                if(result.size()<key)
                {
            result.add(mappings.get(key).get(i));
                }
                else
                {
                    group.add(result);
                    result = new ArrayList<Integer>();
                    result.add(mappings.get(key).get(i));
                }
                  
            }
            group.add(result);
        }
        return group;
    }
}