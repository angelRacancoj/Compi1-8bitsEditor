/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.objectsManager;

import imageneditor.backEnd.Objects.color;
import imageneditor.backEnd.Objects.colorMaker;
import imageneditor.backEnd.Objects.colorObj;
import imageneditor.backEnd.Objects.colorsStruct;
import imageneditor.exceptions.InputsVaciosException;

/**
 *
 * @author angel
 */
public class colorManager {

    colorsStruct newColor;
    canvasManager canvas;

    public colorManager(colorsStruct color, canvasManager canvas) {
        this.newColor = color;
        this.canvas = canvas;
    }

    /**
     * create a new Object color at the colorStruct after verified that at the
     * CanvasStruct inside of canvasManager exist the lienzo
     *
     * @param owner
     * @throws InputsVaciosException
     */
    public void newObjectColor(String owner) throws InputsVaciosException {
        if (canvas.findLienzo(owner) != null) {
            colorObj newClObj = new colorObj(canvas.findLienzo(owner));
            newColor.addLienzoColor(newClObj);
        }
    }

    /**
     * this verify if alredy exist a color, if doesn't exist add to list, else
     * throw a message
     *
     * this method take the RGB entry
     *
     * @param owner
     * @param name
     * @param red
     * @param green
     * @param blue
     * @throws InputsVaciosException
     */
    public void addColorToColorObject(String owner, String name, int red, int green, int blue) throws InputsVaciosException {
        if ((newColor.findColorObject(owner) != null) && (newColor.findColorMaker(owner, name) == null)) {
            newColor.findColorObject(owner).addColor(new colorMaker(name, new color(red, green, blue)));
        } else {
            throw new InputsVaciosException("Can't add the color, doesn't exist the Lienzo or already exist the color");
        }
    }

    /**
     * this verify if alredy exist a color, if doesn't exist add to list, else
     * throw a message
     *
     * this method take the Hexadecimal entry
     *
     * @param owner
     * @param name
     * @param hexa
     * @throws InputsVaciosException
     */
    public void addColorToColorObject(String owner, String name, String hexa) throws InputsVaciosException {
        if ((newColor.findColorObject(owner) != null) && (newColor.findColorMaker(owner, name) == null)) {
            newColor.findColorObject(owner).addColor(new colorMaker(name, new color(hexa)));
        } else {
            throw new InputsVaciosException("Can't add the color, doesn't exist the Lienzo or already exist the color");
        }
    }
}
