class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);

        while(list.size()<n){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            int list_size=list.size();

            //add odd element
            for(int i=0;i<list_size;i++){
                    //let n=5
                if((list.get(i)*2)-1<=n){ //1*2-1<=5 then add 1*2-1
                    temp.add((list.get(i)*2)-1);
                }
            }
            //add even element
            for(int i=0;i<list_size;i++){
                if(list.get(i)*2<=n){
                    temp.add((list.get(i)*2));
                }
            }
            list=temp;
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}