/*
 * Controlador.java
 * version 1.3
 * 20/02/16
 * All rights reserved.
 * Copyright (c) 2020
 */
package seriedetaylorseno;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 * Esta clase  permite ejecutar el software
 * @version 1.3  20/02/16
 * @author Edward Felipe Leon Cotacio
 */
public class SerieDeTaylorSeno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Modelo mod = new Modelo();
        Vista view = new Vista();
        
        Controlador ctrl = new Controlador(view, mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
    
}
