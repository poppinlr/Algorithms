package algorithms._03.leetcode._201_300;

import edu.princeton.cs.algs4.StdOut;

public class _208实现Trie {

    class TrieNode {
        boolean isEnd = false;
        TrieNode[] next = new TrieNode[26];
    }

    private TrieNode node;

    /**
     * Initialize your data structure here.
     */
    public _208实现Trie() {
        this.node = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode n = node;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (n.next[c - 'a'] == null) {
                n.next[c - 'a'] = new TrieNode();
            }

            n = n.next[c - 'a'];
        }

        n.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode n = this.node;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (n.next[c - 'a'] == null) {
                return false;
            } else {
                n = n.next[c - 'a'];
            }
        }
        return n.isEnd;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode n = this.node;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (n.next[c - 'a'] == null) {
                return false;
            } else {
                n = n.next[c - 'a'];
            }
        }

        return true;
    }

    public static void main(String[] args) {
        _208实现Trie s = new _208实现Trie();
        s.insert("apple");
        StdOut.println(s.search("apple"));
        StdOut.println(s.search("app"));
        StdOut.println(s.startsWith("app"));
        s.insert("app");
        StdOut.println(s.search("app"));
    }
}
