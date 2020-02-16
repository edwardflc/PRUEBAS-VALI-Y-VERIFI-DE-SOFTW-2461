/*
 * Controlador.java
 * version 1.3
 * 20/02/16
 * All rights reserved.
 * Copyright (c) 2020
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Vista;

/**
 * Esta clase permite realizar la conexion entre la visita y el modelo.
 * @version 1.3  20/02/16
 * @author Edward Felipe Leon Cotacio
 */
public class Controlador implements ActionListener {
    
     private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model)
    {
        this.view = view;
        this.model = model;
        this.view.btnResolver.addActionListener(this);
        
    }
    
    /**
    * El metodo permitara ejecuta la veenta con un titulo
    * y ubicado el el centro de la pantalla.
    **/ 
    
    public void iniciar()
    {
        view.setTitle("Serie De Taylo Seno");
        view.setLocationRelativeTo(null);
    }
    
    /**
    * El metodo mediante un evento del boton permitira ejecutar
    * la operacion; evaluara si los campos tienen algun dato
    * sino enviara un menaje solicitando ingresar datos en
    * los capos;adicional cuando realiza la operacion actualizara
    * en campo de la respuesta internamente.
    **/ 
    
    public void actionPerformed(ActionEvent e)
    {
        
        if((view.txtN.getText().equals("")) && (view.txtX.getText().equals(""))){
            JOptionPane.showMessageDialog(null,"Ingrese datos en los campos");
        }else
 
        model.setN(Integer.parseInt(view.txtN.getText()));
        model.setX(Integer.parseInt(view.txtX.getText()));
        model.operacion();
        view.txtSumatoria.setText(String.valueOf(model.getSumatario()));
        model.setSumatario(0);
          
        
    }
    
    
    
    
}
