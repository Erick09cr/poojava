
package vehiculo;

import javax.swing.JOptionPane;


public class Vehiculo {

   String color;
   String marca;
   String modelo;
   int odometro;
   
   
   
   
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro1 = new Vehiculo();
        
        carro1.color = "Azul";
        carro1.marca = "Audi";
        carro1.modelo = "A3";
        carro1.odometro = 100;
        
        System.out.println("El color es:"+carro1.color );
        System.out.println("La marca es:"+carro1.marca);
        System.out.println("El modelo es"+carro1.modelo);
        System.out.println("El odometro es:"+carro1.odometro);
        
        System.out.println("-----------------------------------------------");
        
        Vehiculo taxi = new Vehiculo(); 
        taxi.color = JOptionPane.showInputDialog("Digite el color");
        taxi.marca = JOptionPane.showInputDialog("Digite la marca");
        taxi.modelo = JOptionPane.showInputDialog("Digite el modelo");
        taxi.odometro = Integer.parseInt(JOptionPane.showInputDialog("Digite el odometro"));
        
        
        JOptionPane.showMessageDialog(null, "El color del taxi es:"+taxi.color);
        JOptionPane.showMessageDialog(null, "La marca del taxi es:"+taxi.marca);
        JOptionPane.showMessageDialog(null, "El modelo del taxi es:"+taxi.modelo);
        JOptionPane.showMessageDialog(null, "El odometro del taxi es:"+taxi.odometro);
        
        Vehiculo bus = new Vehiculo(); 
        taxi.color = JOptionPane.showInputDialog("Digite el color");
        taxi.marca = JOptionPane.showInputDialog("Digite la marca");
        taxi.modelo = JOptionPane.showInputDialog("Digite el modelo");
        taxi.odometro = Integer.parseInt(JOptionPane.showInputDialog("Digite el odometro"));
        
        
        JOptionPane.showMessageDialog(null, "El color del bus es:"+bus.color);
        JOptionPane.showMessageDialog(null, "La marca del bus es:"+bus.marca);
        JOptionPane.showMessageDialog(null, "El modelo del bus es:"+bus.modelo);
        JOptionPane.showMessageDialog(null, "El odometro del bus es:"+bus.odometro);
    }
    
}
