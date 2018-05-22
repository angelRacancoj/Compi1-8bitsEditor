/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.objectsManager;

import imageneditor.DefaultValue;
import imageneditor.backEnd.Objects.colorsStruct;
import imageneditor.backEnd.Objects.instruccionsP;
import imageneditor.backEnd.Objects.paint;
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

    public int varValue(String name) throws InputsVaciosException {
        if (newPaintS.existVariable(name)) {
            return newPaintS.getVaribleValue(name);
        } else {
            throw new InputsVaciosException("Doesn't exist the variable " + name);
        }
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
     * change the value;
     *
     * @param name
     * @param newValue
     * @throws InputsVaciosException
     */
    public void changeValVariable(String name, int newValue) throws InputsVaciosException {
        if (newPaintS.existVariable(name)) {
            newPaintS.findVariable(name).setValue(newValue);
        } else {
            throw new InputsVaciosException("The variable " + name + " doesn't exist");
        }
    }

    /**
     * add an instruction to de system
     *
     * @param owner
     * @throws InputsVaciosException
     */
    public void addInstruccion(String owner) throws InputsVaciosException {
        if (newPaintS.findIsntruccionsP(owner) == null) {
            newPaintS.addInstruccion(new instruccionsP(canvasS.findLienzo(owner)));
        } else {
            throw new InputsVaciosException("The instruction " + owner + " doesn't exist");
        }
    }

    /**
     * verify if exist the instruction and verify if have been created the
     * variable at the variables declaration method
     *
     * @param name
     * @param owner
     * @throws InputsVaciosException
     */
    public void addVariableToinstruccion(String owner, String name) throws InputsVaciosException {
        if ((newPaintS.findIsntruccionsP(owner) != null) && (newPaintS.findVariable(name) != null)) {
            newPaintS.findIsntruccionsP(owner).addVariable(newPaintS.findVariable(name));
        } else {
            throw new InputsVaciosException("The instruction " + owner + " doesn't exist");
        }
    }

    /**
     * the method if 'posXEnd' or 'posY' is less that 0 won't be set
     *
     * verify if exist the instruction and the color selected is part of the
     * lienzo selected (the owner)
     *
     * verify that the rank is reachable
     *
     * @param owner
     * @param colorName
     * @param posX
     * @param posXEnd
     * @param posY
     * @param posYEnd
     * @throws InputsVaciosException
     */
    public void addPintarInstruccion(String owner, String colorName, int posX, int posXEnd, int posY, int posYEnd) throws InputsVaciosException {
        if ((newPaintS.findIsntruccionsP(owner) != null) && colorsS.findColorMaker(owner, colorName) != null) {
            if (newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posX, posY) && (posXEnd < DefaultValue.INICIO_DIMENSION) && (posYEnd < DefaultValue.INICIO_DIMENSION)) {
                if (newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posX) && newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posY)) {
                    newPaintS.findIsntruccionsP(owner).addPaint(new paint(colorsS.findColorMaker(owner, colorName), posX, posY));
                } else {
                    throw new InputsVaciosException("Grow rank >>" + posX + "," + posY + "<<");
                }
            } else if (newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posX, posY) && (posXEnd >= DefaultValue.INICIO_DIMENSION) && (posYEnd < DefaultValue.INICIO_DIMENSION)) {
                if (newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posXEnd)) {
                    newPaintS.findIsntruccionsP(owner).addPaint(new paint(colorsS.findColorMaker(owner, colorName), posX, posXEnd, posY, DefaultValue.INVALID_CL_CODE));
                } else {
                    throw new InputsVaciosException("Grow rank >>" + posX + "," + posXEnd + "<<");
                }
            } else if (newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posX, posY) && (posYEnd >= DefaultValue.INICIO_DIMENSION) && (posXEnd < DefaultValue.INICIO_DIMENSION)) {
                if (newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posYEnd)) {
                    newPaintS.findIsntruccionsP(owner).addPaint(new paint(colorsS.findColorMaker(owner, colorName), posX, DefaultValue.INVALID_CL_CODE, posY, posYEnd));
                } else {
                    throw new InputsVaciosException("Grow rank >>" + posY + "," + posYEnd + "<<");
                }
            } else {
                if ((posX < posXEnd) && (posY < posYEnd)) {
                    if (newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posX, posXEnd) && newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posY, posYEnd)) {
                        newPaintS.findIsntruccionsP(owner).addPaint(new paint(colorsS.findColorMaker(owner, colorName), posX, posXEnd, posY, posYEnd));
                    } else {
                        if (posX >= posXEnd) {
                            throw new InputsVaciosException("Grow rank >>" + posX + "," + posXEnd + "<<");
                        } else {
                            throw new InputsVaciosException("Grow rank >>" + posY + "," + posYEnd + "<<");
                        }
                    }
                } else {
                    if (posX >= posXEnd) {
                        throw new InputsVaciosException("Grow rank >>" + posX + "," + posXEnd + "<<");
                    } else {
                        throw new InputsVaciosException("Grow rank >>" + posY + "," + posYEnd + "<<");
                    }
                }
            }
        } else {
            throw new InputsVaciosException("Pintar instruction imposible to add");
        }
    }

    /**
     * verify if exist the instruction and the color selected is part of the
     * lienzo selected (the owner)
     *
     * just use the simple format of position
     *
     * verify that the rank is reachable
     *
     * @param owner
     * @param colorName
     * @param posX
     * @param posY
     * @throws InputsVaciosException
     */
    public void addPintarInstruccion(String owner, String colorName, int posX, int posY) throws InputsVaciosException {
        if ((newPaintS.findIsntruccionsP(owner) != null) && colorsS.findColorMaker(owner, colorName) != null) {
            if (newPaintS.findIsntruccionsP(owner).getOwner().getItSize().isReachableDimension(posX, posY)) {
                newPaintS.findIsntruccionsP(owner).addPaint(new paint(colorsS.findColorMaker(owner, colorName), posX, posY));
            }
        } else {
            throw new InputsVaciosException("Pintar instruction imposible to add");
        }
    }
}
