/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novatoprogramador.clasesjava.controlador;

/**
 *
 * @author Audias Guevara
 */
public class Empleado extends AbstractPersona {

    private int codigo;
    private String puesto;
    private int salario;

    public Empleado(int id, String nombre, String apellido, String direccion, int telefono, int codigo, String puesto, int salario) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public void ConsultarPersona() {
        System.out.println(this.getId() + " " + this.getNombre() + " " + this.getApellido() + " "
                + this.getDireccion() + " " + this.getTelefono());
    }

    public void GuardarPersona(Empleado empleado) {
        this.setCodigo(empleado.getCodigo());
        this.setCurso(empleado.getCurso());
        this.setCiclo(empleado.getCiclo());
    }

    public void ObtenerAlumno() {
        System.out.println(this.codigo + " " + this.puesto + " " + this.salario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return puesto;
    }

    public void setCurso(String curso) {
        this.puesto = curso;
    }

    public int getCiclo() {
        return salario;
    }

    public void setCiclo(int ciclo) {
        this.salario = ciclo;
    }

}
