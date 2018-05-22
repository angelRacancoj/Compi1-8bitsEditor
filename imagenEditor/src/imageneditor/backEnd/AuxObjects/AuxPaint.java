/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.backEnd.AuxObjects;

/**
 *
 * @author angel
 */
public class AuxPaint {

    String name;
    int posX;
    int posXemd;
    int posY;
    int posYemd;

    public AuxPaint(String name, int posX, int posXemd, int posY, int posYemd) {
        this.name = name;
        this.posX = posX;
        this.posXemd = posXemd;
        this.posY = posY;
        this.posYemd = posYemd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosXemd() {
        return posXemd;
    }

    public void setPosXemd(int posXemd) {
        this.posXemd = posXemd;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosYemd() {
        return posYemd;
    }

    public void setPosYemd(int posYemd) {
        this.posYemd = posYemd;
    }

}
