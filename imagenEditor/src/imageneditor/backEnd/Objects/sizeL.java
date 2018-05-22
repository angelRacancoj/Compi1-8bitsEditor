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
public class sizeL {

    int cuadro;
    int dimension;

    public sizeL(int cuadro, int dimension) {
        this.cuadro = cuadro;
        this.dimension = dimension;
    }

    /**
     * return if the position selected is possible to reach and verify if the
     * position is mayor that or equals to "0"
     *
     * @param pos
     * @return
     */
    public boolean isReachableDimension(int pos) {
        return ((dimension > pos) && (pos >= DefaultValue.INICIO_DIMENSION));
    }

    /**
     * return if the position selected is possible to reach and verify if the
     * position is mayor that or equals to "0" for both "posX" and "poxY"
     *
     * @param posX
     * @param posY
     * @return
     */
    public boolean isReachableDimension(int posX, int posY) {
        return (isReachableDimension(posY) && isReachableDimension(posX));
    }

    public sizeL() {
    }

    public int getCuadro() {
        return cuadro;
    }

    public void setCuadro(int cuadro) {
        this.cuadro = cuadro;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

}
