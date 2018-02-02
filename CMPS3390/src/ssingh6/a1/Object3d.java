package ssingh6.a1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Jason Forsythe
 */
public class Object3d extends GameObject {
    protected boolean collidable;
    protected double[] boundingBox;
    
    /**
     * Public default constructor
     */
    public Object3d(){
        this.generate();
    }
    
    /**
     * Generate only the member variables specific to this class
     */
    @Override
    protected void generate(){
        super.generate();
        Random randy = new Random();
        this.name = ObjectNames.OBJECT_3D_NAMES[randy.nextInt(ObjectNames.OBJECT_3D_NAMES.length)];
        this.collidable = randy.nextBoolean();
        this.boundingBox = new double[3];
        this.boundingBox[0] = randy.nextDouble()*200;
        this.boundingBox[1] = randy.nextDouble()*200;
        this.boundingBox[2] = randy.nextDouble()*200;
    }
    
    /**
     * Get the name of the Object3d
     * @return String name
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * Get the state of collidable
     * @return boolean collidable
     */
    public boolean isCollidable(){
        return this.collidable;
    }
    
    /**
     * Get the bounding box for this Object3d
     * @return double[]
     */
    public double[] getBoundingBox(){
        return this.boundingBox;
    }
    
    @Override
    public String toString(){
        String yo = String.format("| %20b | %20s", this.collidable, Arrays.toString(this.boundingBox));
        return yo;
    }
    
}
