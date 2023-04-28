package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import misc.Binary_tree.Node;



public class main_misc {
    
	
	public static void main(String[] args) {
	  
	
     Binary_tree t1 = new Binary_tree();    
     t1.add(0, 8);
     t1.add(1, 4);
     t1.add(2, 6);
     t1.add(3, 1);
     t1.add(4, 2);
     t1.add(5, 3);
     t1.add(6, 5);
     t1.add(7, 7);
     t1.add(8, 1);
     //
     t1.add(9,1);//(1)
     
     t1.link_left(0, 1);
     t1.link_right(0, 6);
     
     t1.link_left(1, 2);
     t1.link_right(1, 3);
     
     t1.link_left(3, 4);
     t1.link_right(3, 5);
     //
     t1.link_left(5, 9);//(2)
     
     t1.link_right(6, 7);
     t1.link_left(7, 8);
     
     //If you comment (1) and (2) it should return true
     
     Binary_tree t2 = new Binary_tree();
     t2.add(0, 1);
     t2.add(1, 2);
     t2.add(2, 3);
     
     t2.link_left(0, 1);
     t2.link_right(0, 2);
     
     System.out.println(check_subtree(t1,t2));
		
	
		//pre_order(t1.get_node(3));
	
	}
		
	
	private static void pre_order(Node n,ArrayList<Node> l){
		
		if(n != null){
			l.add(n);
			//System.out.println(n);
			pre_order(n.left(),l);
			pre_order(n.right(),l);
		}
	}
	
	private static boolean check_subtree(Binary_tree t1,Binary_tree t2){
		
	     boolean subtree = false;
		 
	     ArrayList<Node> all_nodes_t1 = new ArrayList<>();
	     pre_order(t1.get_node(0),all_nodes_t1);
	     
	     Node n = t2.get_node(0);
	     
	     ArrayList<Node> t2_subtree = new ArrayList<>();
	     pre_order(n,t2_subtree);
	     
	     for(int i = 0;i < all_nodes_t1.size();i++){
	    	 Node k = all_nodes_t1.get(i);
	    	 if(k.value == n.value){
	    		 
	    		 ArrayList<Node> t1_subtree = new ArrayList<>();
	    		 //LinkedList<Node> t2_subtree = new LinkedList<>();
	    		 pre_order(k,t1_subtree);
	    		// pre_order(n,t2_subtree);
	    		 //System.out.println("t1: "+ t1_subtree);
	    		 //System.out.println("t2: "+t2_subtree);
	    		 
	    		 if(t1_subtree.size() == t2_subtree.size()){
	    			 int c = 0;
	    			 for(int j = 0;j < t1_subtree.size();j++){
	    				 if(t1_subtree.get(j).value == t2_subtree.get(j).value) {
	    					 c++;
	    				 }
	    			 }
	    			 if(c == t1_subtree.size()) {
	    				 return true;
	    			 }
	    		 }
	    		 
	    	 }
	     }
	     
	     
	     return subtree;
		
	}
	
		
	}
	
	
