/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udla.bancoxyz;

/**
 *
 * @author crist
 */
public class AperturaCuenta {
    /*Actividad 1:	
	Hacer un programa en java
	En Banco XYZ, ofrece producto a clientes nuevos para aperturar una cuenta
	Las cuentas Son:
            CUENTA AHORRO 1% anual
            CUENTA CORRIENTE 0.5% anual 
            CUENTA A PLAZO FIJO 1.2% mensual
            (SOLO 3 MESES Y 6 MESES)
	Calcular cuanto ganará un cliente, dependiendo de la cuenta que seleccione
	(Nota la cuenta a plazo fijo solo es para 3 meses o 6 meses, el cliente debe seleccionar)*/
    
    
    final double tasaAhorro = 1.0;
    final double tasaFijo = 1.2;
    final double tasaCorriente = 0.5;
    
    public double calculaAhorro(int montoDeposito){
        return ((montoDeposito * tasaAhorro) / 100) ;
    }
    
    public double calculaCorriente(int montoDeposito){
        return ((montoDeposito * tasaCorriente) / 100) ;
    }
    
    public double calculaFijo(int montoDeposito, int plazo){
        return ((montoDeposito * tasaFijo) / 100) * plazo;
    }
}
