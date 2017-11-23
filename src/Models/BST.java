/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Dr.Chruc
 */
public class BST <Key extends Comparable<Key>, Value> {
    private Node root;
    
    private class Node
    {
        private Key key;
        private Value val;
        private Node left, right;
        private int N;
    
        private Node(Key key, Value val, int N)
        {
            this.key = key; this.val = val; this.N = N;
        }
    }
    
    public int size(){
        return size(root);
    }
    
    private int size(Node X){
        if(X==null) return 0;
        else return X.N;
    }
    
    public Value get(Key key){
        return get(root, key);
    }
    
    private Value get(Node x, Key key){
        if(x==null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp < 0) return get(x.left, key);
        else if(cmp > 0) return get(x.right, key);
        else return x.val;
    }
    
    public  void put(Key key, Value val){
        root = put (root, key, val);
    }
    
    private Node put(Node x, Key key, Value val){
        if(x == null) return new Node(key, val, 1);
        int cmp = key.compareTo(x.key);
        if(cmp < 0) x.left = put(x.left, key, val);
        else if(cmp > 0) x.right = put(x.right, key ,val);
        else x.val = val;
        x.N = size(x.left) + size(x.right) +1;
        return x;
    }
    
    public Key select(int k){
        return select(root, k).key;
    }
    
    private Node select(Node x, int k){
        if(x == null) return null;
        int t = size(x.left);
        if(t > k) return select(x.left, k);
        else if(t < k) return select(x.right, k-t-1);
        else return x;
    }
    
    public int rank(Key key){
        return rank(key, root);
    }
    
    private int rank(Key key, Node x){
        if(x == null) return 0;
        int cmp = key.compareTo(x.key);
        if(cmp < 0) return rank(key, x.left);
        else if(cmp > 0) return 1 + size(x.left) + rank(key, x.right);
        else return size(x.left);
    }
    
    
}
