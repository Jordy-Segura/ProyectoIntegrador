package ec.edu.espoch.proyectoderivadasimplicitas.controlador;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class Controlador {

    private String funcion = "";
    private DJep djep;
    private Node nodoFuncion;
    private Node nodoDerivada;

    public void derivarY() {
        try {
            this.djep = new DJep();
            this.djep.addStandardFunctions();
            this.djep.addStandardConstants();
            this.djep.addComplex();
            this.djep.setAllowUndeclared(true);
            this.djep.setAllowAssignment(true);
            this.djep.setImplicitMul(true);
            this.djep.addStandardDiffRules();

            this.funcion = this.funcion.replace("xy", "x^1y").replace("yx", "y^1x");

            this.nodoFuncion = this.djep.parse(this.funcion);
            Node diff = this.djep.differentiate(nodoFuncion, "y");
            this.nodoDerivada = this.djep.simplify(diff);
            this.funcion = this.djep.toString(this.nodoDerivada);

        } catch (ParseException e) {
            this.funcion = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
        }
    }

    public void derivarX() {
        try {
            this.djep = new DJep();
            this.djep.addStandardFunctions();
            this.djep.addStandardConstants();
            this.djep.addComplex();
            this.djep.setAllowUndeclared(true);
            this.djep.setAllowAssignment(true);
            this.djep.setImplicitMul(true);
            this.djep.addStandardDiffRules();

            this.funcion = this.funcion.replace("xy", "x^1y").replace("yx", "y^1x");

            this.nodoFuncion = this.djep.parse(this.funcion);
            Node diff = this.djep.differentiate(nodoFuncion, "x");
            this.nodoDerivada = this.djep.simplify(diff);
            this.funcion = this.djep.toString(this.nodoDerivada);

        } catch (ParseException e) {
            this.funcion = "NaN";
            System.out.println("Error: " + e.getErrorInfo());
        }
    }
}
