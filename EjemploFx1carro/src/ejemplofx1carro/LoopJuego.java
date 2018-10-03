/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofx1carro;

import ejemplofx1carro.ModeloJuego.Carro;
import ejemplofx1carro.ModeloJuego.Nube;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer {
    private GraphicsContext lapiz;
    private Carro carro;
    private Image fondo2;
    private Image fondo1;
    private Image fondo;
    private Image gato;
    private Image nino;
    private Image nino2;
    private Image nino3;
    private int a=0;
    private Nube n1;
    private Nube n2;
    private int n=0;
    int posfondo=1024;
    int b=0;
    

    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro= new Carro(10,100, 50, 20);
        this.n1= new Nube( 100, 10, 10, 10);
        this.n2= new Nube( 100, 20, 10, 10);
        this.fondo1=new Image("image/fondo.png");
        this.fondo=new Image("image/fondo.png");
        this.fondo2=new Image("image/fondo.png");
        this.gato=new Image("image/cats.gif");
        this.nino= new Image("image/left2.png");
        this.nino2= new Image("image/left2.png");
        this.nino3= new Image("image/left2.png");
    }
   
    
    
 
    public void handle(long now) {
        
        //carro
       lapiz.clearRect(0,0,1024,512);
       //lapiz.drawImage(this.fondo, 0, 0);
       //lapiz.drawImage(this.gato, 0, 0);   imagen completa
       
       
        if(this.n==5){
           this.n=0;
            a=0;
       }else{
       
       this.n++;
       
       }
               
      lapiz.drawImage(this.fondo1, this.posfondo-1024, 0);
      lapiz.drawImage(this.fondo2, this.posfondo, 0);
               
              
       
       
       
       lapiz.drawImage(nino, 800, 300);
       lapiz.strokeRect(800, 300, 30, 39);
       
       lapiz.drawImage(nino, 600, 300);
       lapiz.strokeRect(600, 300, 30, 39);
       
       lapiz.drawImage(nino, 400, 300);
       lapiz.strokeRect(400, 300, 30, 39);
       
       
       lapiz.drawImage(gato, 132*n, 0, 132, 80, 20+b++, 300, 132, 80);
       lapiz.strokeRect(20+b++, 300, 132, 80);
       //lapiz.drawImage(gato, 264, 0, 132, 80, 80, 80, 132, 80);
       if(this.posfondo<=0){
       
       this.posfondo=1024;
       
       }else{
       
       this.posfondo-=5;
       }
       // imagen, origen imagencorte, origen imageny, ancho, alto, xllegada, yllegada, 
       
       //imagen - origen imagen y dimenciones - punto ed llegada 
       // lapiz.strokeRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
      // lapiz.strokeRect(this.n1.getXref(), this.n1.getYref(), this.n1.getAlto(), this.n1.getAncho());
       lapiz.strokeText("b", 10, 10);
       //this.carro.mover();
       //this.n1.mover();
        Shape rRectangulo1= new Rectangle(150+this.carro.getXref(), 320,132,80);
        
        Shape rRectangulo2= new Rectangle(170,this.carro.getYref(),50,50);
        
        Shape interseccion= SVGPath.intersect(rRectangulo1, rRectangulo2);
        
        if(interseccion.getBoundsInLocal().getWidth()!=-1){
        stop();
        
        }
        this.carro.mover();
    }
    
}
