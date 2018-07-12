package trees;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by apuris on 09/07/18.
 */
public class Trie {

   private class TrieNode {
      Map<Character, TrieNode> children;
      boolean endOfWord;

      public TrieNode(){
         children = new HashMap<>();
         endOfWord = false;
      }

   }

   private final TrieNode root;

   public Trie(){
      root = new TrieNode();
   }

   //Iterative implementation
   public void insert(String word){
      TrieNode current = root;
      for(int i=0; i < word.length(); i++){
         TrieNode node = current.children.get(word.charAt(i));
         if(node == null){
            node = new TrieNode();
            current.children.put(word.charAt(i),node);
         }
         current = node;
      }
      current.endOfWord = true;
   }
}

