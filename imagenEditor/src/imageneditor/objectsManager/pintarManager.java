/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.objectsManager;

import imageneditor.backEnd.Objects.colorsStruct;
import imageneditor.backEnd.Objects.paintStruct;
import imageneditor.backEnd.Objects.variable;
import imageneditor.exceptions.InputsVaciosException;

/**
 *
 * @author angel
 */
public class pintarManager {

    paintStruct newPaintS;
    canvasManager canvasS;
    colorsStruct colorsS;

    public pintarManager(paintStruct newPaintS, canvasManager canvasS, colorsStruct colorsS) {
        this.newPaintS = newPaintS;
        this.canvasS = canvasS;
        this.colorsS = colorsS;
    }

    /**
     * Add the variable to the principal list, getting the values
     *
     * @param name
     * @param value
     * @throws InputsVaciosException
     */
    public void addVariable(String name, int value) throws InputsVaciosException {
        if (!newPaintS.existVariable(name)) {
            newPaintS.addVariable(new variable(name, value));
        } else {
            throw new InputsVaciosException("Can't add the variable" + name + " alredy exist");
        }
    }

    /**
     * Add the variable to the principal list, getting the values
     *
     * @param name
     * @throws InputsVaciosException
     */
    public void addVariable(String name) throws InputsVaciosException {
        if (!newPaintS.existVariable(name)) {
            newPaintS.addVariable(new variable(name));
        } else {
            throw new InputsVaciosException("Can't add the variable " + name + " alredy exist");
        }
    }

    /**
     * take the incoming value "toAdd" and added to the found variable
     *
     * @param name
     * @param toAdd
     * @throws InputsVaciosException
     */
    public void plusToVariable(String name, int toAdd) throws InputsVaciosException {
        if (newPaintS.existVariable(name)) {
            newPaintS.findVariable(name).addToValue(toAdd);
        } else {
            throw new InputsVaciosException("The variable " + name + " doesn't exist");
        }
    }

    /**
     * take the incoming value "toLess" and subtracted to the found variable
     *
     * @param name
     * @param toLess
     * @throws InputsVaciosException
     */
    public void lessToVariable(String name, int toLess) throws InputsVaciosException {
        if (newPaintS.existVariable(name)) {
            newPaintS.findVariable(name).lessToValue(toLess);
        } else {
            throw new InputsVaciosException("The variable " + name + " doesn't exist");
        }
    }

    public void addInstruccion() {

    }

}
