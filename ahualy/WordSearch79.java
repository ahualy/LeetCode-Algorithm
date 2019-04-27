package ahualy;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution1 {


    Set<String> res = new HashSet<String>();

    public boolean exist(char[][] board, String words) {


        Trie trie = new Trie();
        trie.insert(words);  // 依次加入trie

        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, visited, "", i, j, trie);
            }
        }
        return new ArrayList<String>(res) != null ? true : false;
    }

    private void dfs(char[][] board, boolean[][] visited, String str, int x, int y, Trie trie) {

        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) return; // 越界就不再进行访问
        if (visited[x][y]) return;

        str += board[x][y];

        if (!trie.startsWith(str)) return;

        if (trie.search(str)) {
            res.add(str);
        }

        visited[x][y] = true;

        dfs(board, visited, str, x - 1,y,trie);
        dfs(board, visited, str, x + 1,y,trie);
        dfs(board, visited, str, x,y - 1,trie);
        dfs(board, visited, str, x,y + 1,trie);

        visited[x][y] = false;

    }
}


public class WordSearch79 {

    public static void main(String[] args) {

        char[][] board = new char[][]{
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String words = "ABCW";

        Solution1 solution1 = new Solution1();

        boolean res = solution1.exist(board, words);

        System.out.println("res "+res);
    }
}
