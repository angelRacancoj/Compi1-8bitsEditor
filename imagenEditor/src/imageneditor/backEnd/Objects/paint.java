/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.backEnd.Objects;

import imageneditor.DefaultValue;

/**
 *
 * @author angel
 */
public class paint {

    colorMaker colorSelected;
    int posX;
    int posXEnd;
    int posY;
    int posYEnd;

    public paint(colorMaker colorSelected, int posX, int posY) {
        this.colorSelected = colorSelected;
        this.posX = posX;
        this.posY = posY;
    }

    /**
     * the method if 'posXEnd' or 'posY' is less that 0 won't be set
     *
     * @param colorSelected
     * @param posX
     * @param posXEnd
     * @param posY
     * @param posYEnd
     */
    public paint(colorMaker colorSelected, int posX, int posXEnd, int posY, int posYEnd) {
        this.colorSelected = colorSelected;
        this.posX = posX;

        if (posXEnd >= DefaultValue.INICIO_DIMENSION) {
            this.posXEnd = posXEnd;
        } else {
            this.posXEnd = DefaultValue.NO_INICIO_DIMENSION;
        }
        this.posY = posY;

        if (posYEnd >= DefaultValue.INICIO_DIMENSION) {
            this.posYEnd = posYEnd;
        } else {
            this.posYEnd = DefaultValue.NO_INICIO_DIMENSION;
        }
    }

    public colorMaker getColorSelected() {
        return colorSelected;
    }

    public void setColorSelected(colorMaker colorSelected) {
        this.colorSelected = colorSelected;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosXEnd() {
        return posXEnd;
    }

    public void setPosXEnd(int posXEnd) {
        this.posXEnd = posXEnd;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosYEnd() {
        return posYEnd;
    }

    public void setPosYEnd(int posYEnd) {
        this.posYEnd = posYEnd;
    }

}
