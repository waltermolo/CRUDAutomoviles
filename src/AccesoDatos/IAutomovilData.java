/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Clases.Automovil;
import Clases.Excepciones.AutomovilExcepcion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IAutomovilData {
    List<Automovil> ConsultarAutomoviles() throws AutomovilExcepcion, Exception;
}
