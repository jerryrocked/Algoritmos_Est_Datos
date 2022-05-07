/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_banco;

/**
 *
 * @author tekke
 */
public class Usuarios extends Ejercicio1_banco{
    
    private String nombre;
    private int saldo;
    private int tipo;
    
    public Usuarios(String nombre, int saldo, int tipo){
        this.nombre = nombre;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getTipoDeCuenta() {
        return tipo;
    }

    public void setTipoDecuenta(int tipo) {
        this.tipo = tipo;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Tiempo: " + getTipoDeCuenta());
    }
    
    public double tipoDeCuenta(int monto, int tipoC, int plazoF){
        switch (tipoC) {
            case 1:
            {
                double result = monto + (monto * 0.01);
                return result;
            }
            case 2:
            {
                double result = monto + (monto * 0.005);
                return result;
            }
            case 3:
            {
                if (plazoF == 1){
                    double result = monto + ((monto * 0.012) * 3);
                    return result;
                }
                else if (plazoF  == 2){
                    double result = monto + ((monto * 0.012) * 6);
                    return result;
                }
            }
                
            default:
                break;
        }
        return 1;
    };
}
