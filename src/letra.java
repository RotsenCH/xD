import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class letra {
    public static void main(String[] args){
        //JOptionPane.showMessageDialog(null,"Bienvenidos\na\nJava");
        try{
            //Pide al usuario que ingrese su nombre
            /*String nombre = JOptionPane.showInputDialog("Cual es su nombre? ");
            //Crea el mensaje
            String mensaje = String.format("Bienvenido al calculo del IMC! " + nombre);
            JOptionPane.showMessageDialog(null, mensaje);
            Double altura = Double.valueOf(JOptionPane.showInputDialog("Ingrese la altura: "));
            Double peso = Double.valueOf(JOptionPane.showInputDialog("Ingrese el peso: "));
            double resultado = (peso/(Math.pow(altura,2)));
            String mensajeDos = String.format("El calculo del IMC señor " + nombre + " es: " + resultado);
            JOptionPane.showMessageDialog(null, mensajeDos);*/

            //Crea un panel que contiene nuestro dibujo
            PanelDibujo panel = new PanelDibujo();

            JFrame application = new JFrame();
            //Establece el marco para salir cuando se cierre
            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            application.add(panel);//Agrega el panel al marco
            application.setSize(250,250);//Establce el tamño del marco
            application.setVisible(true);//Hace que el marco sea visible
        }catch(Exception ex){
            System.out.println("Error se ha detectado algun error " + ex.getSuppressed());
        }
    }
}
