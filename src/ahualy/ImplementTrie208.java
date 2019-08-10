package ahualy;


class TrieNode {
    public char val;
    public boolean isWord;
    public TrieNode[] children = new TrieNode[26];
    public TrieNode(){}
    TrieNode (char c){
        TrieNode node = new TrieNode();
        node.val = c;
    }
}

class Trie {

    private  TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {

        root = new TrieNode();
        root.val = ' ';


    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode ws = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ws.children[c - 'A'] == null) {
                ws.children[c - 'A'] = new TrieNode(c);
            }
            ws = ws.children[c - 'A'];
        }
        ws.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode ws = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (ws.children[c - 'A'] == null) return false;
            ws = ws.children[c - 'A'];
        }
        return  ws.isWord;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {

        TrieNode ws = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (ws.children[c - 'A'] == null) return false;
            ws = ws.children[c - 'A'];
        }
        return  true;
    }
}


public class ImplementTrie208 {

    public static void main(String[] args) {

    }
}
