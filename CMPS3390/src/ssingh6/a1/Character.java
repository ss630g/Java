package ssingh6.a1; //Change to [yourname].a1

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author [Simran Preet Singh]
 */
public class Character extends Object3d{
    protected float health;
    protected float hitPower;
    protected double[] speed;
    protected int livesCount;
    
    /**
     * Default public constructor
     */
    public Character(){
        this.generate();
    }
    
    @Override
    protected void generate(){
        super.generate();
        //Generate this class's member variables
        Random crooked = new Random();
        this.health = crooked.nextFloat() * 100;
        this.hitPower = crooked.nextFloat() * 50;
        this.speed = new double[3];
        this.speed[0] = crooked.nextDouble()*30;
        this.speed[1] = crooked.nextDouble()*30;
        this.speed[2] = crooked.nextDouble()*30;
        this.livesCount = crooked.nextInt(100);
    }
    
    /**
     * Character takes damage reducing health and then
     * returning remaining health
     * @param hitPoints
     * @return float health
     */
    public float takeDamage(float hitPoints){
        return this.health;
    }
    
    /**
     * Get Character's current health
     * @return float health
     */
    public float getHealth(){
        return this.health;
    }
    
    /**
     * Add each parm to Character's speed
     * @param x
     * @param y
     * @param z 
     */
    public void addSpeed(double x, double y, double z){
        this.speed = new double [] {this.speed[0] + x, this.speed[1] + y,this.speed[2] + z};
    }
    
    /**
     * Get the Character's current speed
     * @return  double[] speed
     */
    public double[] getSpeed(){
        return this.speed;
    }
    
    /**
     * Get the remanding lives for Character
     * @return int livesCount
     */
    public int getLivesCount(){
        return this.livesCount;
    }
    
    @Override
    public String toString(){
        String bro = String.format("| %20f | %20f | %20s | %20d", this.health,this.hitPower, Arrays.toString(this.speed), this.livesCount);
        return bro;
    }
    
}
