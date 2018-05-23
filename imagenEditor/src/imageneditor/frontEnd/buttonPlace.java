/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.frontEnd;

import imageneditor.DefaultValue;
import imageneditor.backEnd.Objects.colorMaker;
import javax.swing.JButton;

/**
 *
 * @author angel
 */
public class buttonPlace {

    int posX;
    int posXEnd;
    int posY;
    int posYEnd;
    JButton button;
    colorMaker selectedColor;

    public buttonPlace(int posX, int posY, JButton button, colorMaker selectedColor) {
        this.posX = posX;
        this.posXEnd = DefaultValue.NO_INICIO_DIMENSION;
        this.posY = posY;
        this.posYEnd = DefaultValue.NO_INICIO_DIMENSION;
        this.button = button;
        this.selectedColor = selectedColor;
    }

    public buttonPlace(int posX, int posXEnd, int posY, int posYEnd, colorMaker selectedColor) {
        this.posX = posX;
        this.posXEnd = posXEnd;
        this.posY = posY;
        this.posYEnd = posYEnd;
        this.selectedColor = selectedColor;
    }

    public buttonPlace() {
        posX = DefaultValue.NO_INICIO_DIMENSION;
        posXEnd = DefaultValue.NO_INICIO_DIMENSION;
        posY = DefaultValue.NO_INICIO_DIMENSION;
        posYEnd = DefaultValue.NO_INICIO_DIMENSION;
        button = null;
        selectedColor = null;
    }

    public void clear() {

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public int getPosXEnd() {
        return posXEnd;
    }

    public void setPosXEnd(int posXEnd) {
        this.posXEnd = posXEnd;
    }

    public int getPosYEnd() {
        return posYEnd;
    }

    public void setPosYEnd(int posYEnd) {
        this.posYEnd = posYEnd;
    }

    public colorMaker getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(colorMaker selectedColor) {
        this.selectedColor = selectedColor;
    }
}
