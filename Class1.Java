package misc;

import java.util.ArrayList;
import java.util.LinkedList;

import misc.Graph_1.Node;

public class Binary_tree {

	   public static class Node{
	    	public int _id;
	    	public ArrayList<Node> adj;
	    	public int marked = 0;
	    	public int value;
	    	
	    	public Node(int id,int val) {
	    		_id = id;
	    		value = val;
	    		adj = new ArrayList<>();
	    		adj.add(0,null);
	    		adj.add(1,null);
	    		adj.add(2,null);
	    	
	    	}
	    	
	    	/*public String toString() {
	    		return "{id:" + _id + " / value:" + value + "}";
	    	}*/
	    	
	    	public String toString() {
	    		return ""+value;
	    	}
	    	
	    	public void set_value(int v) {
	    		value = v;
	    	}
	    	
		    public Node left() {
		    	if(this.adj.get(0) != null) {
		    		return this.adj.get(0);
		    	}
		    	return null;
		    }
		    public Node right() {
		    	if(this.adj.get(1) != null) {
		    		return this.adj.get(1);
		    	}
		    	return null;
		    }
		    
		    public Node get_parent(){
		    	if(this.adj.get(2) != null){
		    		return this.adj.get(2);
		    	}
		    	return null;
		    }
		    
	    	
	    }
	    
	    public ArrayList<Node> nodes;
	    
	    public Binary_tree() {
	    	nodes = new ArrayList<>();
	    }
	    
	    public void add(int i,int val) {
	    	Node novo = new Node(i,val);
	    	nodes.add(novo);
	    }
	    
	    public void link_left(int id1,int id2){
	    	Node n = nodes.get(id1);
	    	n.adj.remove(0);
	    	n.adj.add(0, nodes.get(id2));
	        Node r = nodes.get(id2);
	        if(r.adj.get(2) == null) {
	        	r.adj.remove(2);
	        	r.adj.add(2,n);
	        }
	    }
	    
	    public void link_right(int id1,int id2) {
	    	Node n = nodes.get(id1);
	    	n.adj.remove(1);
	    	n.adj.add(1,nodes.get(id2));
	    	Node r = nodes.get(id2);
	    	if(r.adj.get(2) == null) {
	    		r.adj.remove(2);
	    		r.adj.add(2,n);
	    	}
	    }
	    
	    
	    public Node get_node(int i) {
	    	return nodes.get(i);
	    }
	    
	    public ArrayList<Node> get_adj(Node n){
	    	return n.adj;
	    }
	    
	    /*check subtree*/ 	
	    
	    
	 

		   
		   
	   }
	    
	    	
	    
	   	

