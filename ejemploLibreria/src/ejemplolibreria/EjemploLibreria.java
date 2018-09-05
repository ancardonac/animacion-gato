/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolibreria;

import becker.robots.*;
import java.awt.Color;

/**
 *
 * @author Estudiante
 */
public class EjemploLibreria {
    private City ciudad;
    private Robot robot;

    public EjemploLibreria(){
    
    this.ciudad=new City();
    
    for(int i =1; i<=6;i++){
    
    Wall pared= new Wall(ciudad, 1,i, Direction.NORTH);
    Wall pared1= new Wall(ciudad, 6,i, Direction.SOUTH);
    Wall pared2= new Wall(ciudad, i,1, Direction.WEST);
    Wall pared3= new Wall(ciudad, i,6, Direction.EAST);
    
    
    
    }
    Thing thing = new Thing(ciudad,2,2);
    thing.getIcon().setColor(Color.LIGHT_GRAY);
    thing.getIcon().setLabel("placa");
    
    this.robot= new Robot(ciudad,3,3,Direction.EAST);
    this.robot.setLabel("Robot");
    this.robot.setColor(Color.ORANGE);
    
    }
    
    public void solucionarReto(){
    for(int i=0; i<3;i++){
    
    
    this.robot.move();
    }
    
    
    
    }
    
    
}
