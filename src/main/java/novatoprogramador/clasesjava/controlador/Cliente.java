/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novatoprogramador.clasesjava.controlador;

/**
 *
 * @author Audias Guevara
 */
public class Cliente extends AbstractPersona{

    private int codigo;
    private int saldo;
    
    
    public Cliente(int id, String nombre, String apellido, String direccion, int telefono, int codigo, int saldo, String curso) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.saldo = saldo;
        
    }

    @Override
    public void ConsultarPersona() {
        System.out.println(this.getId()+" "+this.getNombre()+" "+this.getApellido()+" "
        +this.getDireccion()+" "+this.getTelefono());
    }
    
    public void ConsultarDocente(){
        System.out.println(codigo+" "+" "+saldo);
    }
    
}
