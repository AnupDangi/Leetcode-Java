class Solution { //problem no 720
    class Trie {
    Trie[] children;
    boolean isEnd;
    String finalWord="";

    Trie root;
    public Trie() {
        root=this;
        this.children = new Trie[26];
        this.isEnd = false;
        this.finalWord="";
    }
}
    public void insert(String word,Trie root) {
        Trie curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Trie();
            }
            curr = curr.children[idx];
        }
        curr.isEnd = true;
        curr.finalWord=word;
    }
    String ans="";
    public void findlongest(Trie root){
        if(root.finalWord.length()>ans.length()){
            ans=root.finalWord;
        }
        else if(root.finalWord.length()==ans.length()&& root.finalWord.compareTo(ans)<0){
                ans=root.finalWord; //lexiographically smaller
        }
        for(int idx=0;idx<26;idx++){
            if(root.children[idx]!=null && root.children[idx].isEnd==true){
                findlongest(root.children[idx]);
            }
        }
    }
    public String longestWord(String[] words) {
        Trie root=new Trie();
        for(String word:words){
            insert(word,root);
        }
        findlongest(root);
        return ans;
    }

}