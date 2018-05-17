/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.backEnd.Objects;

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

    public paint(colorMaker colorSelected, int posX, int posXEnd, int posY, int posYEnd) {
        this.colorSelected = colorSelected;
        this.posX = posX;
        this.posXEnd = posXEnd;
        this.posY = posY;
        this.posYEnd = posYEnd;
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
