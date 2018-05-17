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
public class sizeL {

    int cuadro;
    int dimension;

    public sizeL(int cuadro, int dimension) {
        this.cuadro = cuadro;
        this.dimension = dimension;
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
