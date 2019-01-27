package DockerGroup.DockerBoot;

import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
	  
    public static void main( String[] args )
    {
     //   System.getProperty("spring.jackson.serialization.INDENT_OUTPUT", "true");
     //   SpringApplication.run(App.class, args);
        HashSet<Integer> mySet = new HashSet<>(); 

        Tree G = new Tree(5, null, null);
        Tree D = new Tree(4, G, null);
        Tree B = new Tree(5, D, null);
        Tree F = new Tree(6, null, null);
        Tree E = new Tree(1, null, null);
        Tree C = new Tree(6 ,E, F);
        Tree A = new Tree(4, B, C);
        
        compute(A, mySet);
        System.out.println(mySet);   
    }
    
    public static HashSet<Integer> compute(Tree a , HashSet<Integer> mySet  ){
    	Tree tree = a;
    		if(tree.l == null && tree.r == null ){
    			return mySet;
    		} else{
   			 mySet.add(tree.val);
   			if(tree.l == null){
   				return mySet;
   			}else{
   				compute(tree.l, mySet) ;
   			}
   			if(tree.r == null){
   				return mySet;
   			}else{
   				compute(tree.r, mySet) ;
   			}
    		}
    	
		return mySet;
    }
}

class Tree {
	int val;
	Tree l;
	Tree r;
	
	public Tree(int val, Tree l , Tree r){
		this.val = val;
		this.l = l;
		this.r = r;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tree [val=");
		builder.append(val);
		builder.append(", l=");
		builder.append(l);
		builder.append(", r=");
		builder.append(r);
		builder.append("]");
		return builder.toString();
	}
	
	
}
