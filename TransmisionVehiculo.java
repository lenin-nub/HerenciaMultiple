
package transmisionvehiculo;
interface TransmisionMecanica{
    public default void Conectar_potencia_motor(){
        System.out.println("El acoplamiento y desacoplamiento de la potencia del motor "
         + "se realiza mediante la utilización de un Embrague");
    }
}
interface TransmisionAutomatica{
    public default void Conectar_potencia_motor(){
        System.out.println("El acoplamiento y desacoplamiento de la potencia del motor"
                + " se realiza mediante la utilización de un Convertidor de par");
    }
}
public class TransmisionVehiculo implements TransmisionMecanica,TransmisionAutomatica{

   /*@Override
    public void Conectar_potencia_motor(){
        //se puede elegir la implementacion de una interfaz
        //por ejemplo ,escogemos que sea TransmisionMecanica
        TransmisionMecanica.super.Conectar_potencia_motor();
    }
   */
    @Override
    public void Conectar_potencia_motor(){
    //se puede elegir la implementacion de una interfaz
    //por ejemplo,escogemos que sea VehiculosGasolina
    TransmisionAutomatica.super.Conectar_potencia_motor();

    }

    public static void main(String[] args) {
           System.out.println("      UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("MATERIA: PROGRAMACION");
        System.out.println("DOCENTE: ING.GUERRA LUIS");
        System.out.println("NRC: 7450");
        System.out.println("NOMBRE:");
        System.out.println(" LENIN IÑACAZA");

        TransmisionVehiculo vehiculo=new  TransmisionVehiculo();
        vehiculo.Conectar_potencia_motor();
    }
}
