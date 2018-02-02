package ssingh6.a1; // change to [yourname].a1

import java.util.Arrays;
import java.util.Random;

/**
 * Base class for all other classes
 * @author [Simran Preet Singh]
 */
public class GameObject implements Comparable<GameObject>{
    protected long id;
    protected double[] position;
    protected String name;

    
    /**
     * Public default constructor
     */
    public GameObject(){
        this.generate();
    }
    
    /**
     * Used by default constructor to assign
     * values to member variables.
     */
    protected void generate(){
        Random randy = new Random();
        this.id = randy.nextLong();
        this.id=this.id > 0 ? this.id : this.id * -1;
        this.position = new double[3];
        this.position[0] = randy.nextDouble()*200;
        this.position[1] = randy.nextDouble()*200;
        this.position[2] = randy.nextDouble()*200;
        this.name = "GameObject";

    }
    
    /**
     * Get the ID for GameObject
     * @return long ID
     */
    public long getId(){
        return this.id;
    }
    
    /**
     * Return the position of the GameObject
     * @return double[] position
     */
    public double[] getPosition(){
        return this.position;
    }

    /**
     * Sort the objects by class name
     * @return int -1 0 1
     */
    @Override
    public int compareTo(GameObject o) {
        //Collections.sort(o);
        int res = 0;
        if(this.id > o.id) {
            res = -1;
        } else if(this.id < o.id){
            res = 1;
        } else {
            res = 0;
        }
        return 0;
    }
    
    @Override
    public String toString(){
        String Heyoo = String.format("| %20d | %20s | %25s", this.id, this.name, Arrays.toString(this.position));
        return Heyoo;
    }
    
    /**
     * Function will return a string in valid HTML table row format
     * @return String HTML Row string
     */
    public String toHtmlRow(){
        return String.format("<tr><td> %s </td><td> %s </td><td> %s </td><td> %s </td></tr>", this.getClass(), this.name, this.id, Arrays.toString(this.position));
    }
}
