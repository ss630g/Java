package ssingh6.a1;

import java.util.Random;

/**
 *
 * @author Jason Forsythe
 */
public class Pickup extends Object3d {
    protected int stackCount;
    protected double harvestSeconds;
    protected double value;
    
    public Pickup(){
        this.generate();
    }
    
    @Override
    protected void generate(){
        super.generate();
        Random randy = new Random();
        this.name = ObjectNames.PICK_UP_NAMES[randy.nextInt(ObjectNames.PICK_UP_NAMES.length)];
        this.stackCount = randy.nextInt(100);
        this.harvestSeconds = randy.nextDouble() * 5;
        this.value = randy.nextDouble() * 100;
        //Generate this member's values randomly
    }
    
    /**
     * Get the stack count for this item
     * @return int stackCount
     */
    public int getStackCount(){
        return this.stackCount;
    }
    
    /**
     * Get the seconds it takes to harvest this item
     * @return double havestSeconds
     */
    public double getHarvestSeconds(){
        return this.harvestSeconds;
    }
    
    /**
     * Get the value $$ of this item
     * @return double value
     */
    public double getValue(){
        return this.value;
    }
    
    @Override
    public String toString(){
        return super.toString() +
            String.format("%8.2f %8s %8.2f", this.value, this.stackCount, this.harvestSeconds);
    }
}
