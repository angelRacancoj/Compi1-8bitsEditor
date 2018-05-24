/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.frontEnd;

import imageneditor.backEnd.Objects.colorMaker;
import javax.swing.JButton;

/**
 *
 * @author angel
 */
public class buttonPlace {

    int posX;
    int posY;
    JButton button;
    colorMaker selectedColor;

    public buttonPlace(int posX, int posY, JButton button, colorMaker selectedColor) {
        this.posX = posX;
        this.posY = posY;
        this.button = button;
        this.selectedColor = selectedColor;
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

    public colorMaker getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(colorMaker selectedColor) {
        this.selectedColor = selectedColor;
    }
}
