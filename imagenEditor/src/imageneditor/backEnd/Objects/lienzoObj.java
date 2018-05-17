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
public class lienzoObj {

    String id;
    String name;
    String tipo;
    color fondo;
    sizeL itSize;

    public lienzoObj(String id, String name, String tipo, color fondo, sizeL itSize) {
        this.id = id;
        this.name = name;
        this.tipo = tipo;
        this.fondo = fondo;
        this.itSize = itSize;
    }

    public lienzoObj() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public color getFondo() {
        return fondo;
    }

    public void setFondo(color fondo) {
        this.fondo = fondo;
    }

    public sizeL getItSize() {
        return itSize;
    }

    public void setItSize(sizeL itSize) {
        this.itSize = itSize;
    }

}
