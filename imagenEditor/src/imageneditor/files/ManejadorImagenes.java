/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageneditor.files;

import imageneditor.DefaultValue;
import imageneditor.backEnd.AuxObjects.AuxPaint;
import imageneditor.backEnd.Objects.color;
import imageneditor.backEnd.Objects.colorObj;
import imageneditor.backEnd.Objects.lienzoObj;
import imageneditor.backEnd.Objects.paint;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import javax.imageio.ImageIO;

/**
 *
 * @author angel
 */
public class ManejadorImagenes {

    public ManejadorImagenes() {
    }

    public boolean crearImagen(String path, lienzoObj lienzo, colorObj colors, LinkedList<paint> paintlist) {
        int dimension = lienzo.getItSize().getDimension();
        int pixeles = lienzo.getItSize().getCuadro();
        BufferedImage img = new BufferedImage(dimension * pixeles, dimension * pixeles, BufferedImage.TYPE_INT_ARGB);

        for (int i = 0; i < (dimension * pixeles); i++) {
            for (int j = 0; j < (dimension * pixeles); j++) {
                img.setRGB(i, j, rgbValue(lienzo.getFondo()));
            }
        }

        for (paint paintlist1 : paintlist) {
            try {
                if ((paintlist1.getPosXEnd() < DefaultValue.INICIO_DIMENSION) && (paintlist1.getPosYEnd() < DefaultValue.INICIO_DIMENSION)) {
                    for (int i = ((paintlist1.getPosX() - 1) * pixeles); i < ((paintlist1.getPosX()) * pixeles); i++) {
                        for (int j = ((paintlist1.getPosY() - 1) * pixeles); j < ((paintlist1.getPosY()) * pixeles); j++) {
                            img.setRGB(i, j, rgbValue(paintlist1.getColorSelected().getItsColor()));
                        }
                    }
                } else if ((paintlist1.getPosXEnd() > DefaultValue.NO_INICIO_DIMENSION) && (paintlist1.getPosYEnd() < DefaultValue.INICIO_DIMENSION)) {
                    for (int i = ((paintlist1.getPosX() - 1) * pixeles); i < ((paintlist1.getPosXEnd()) * pixeles); i++) {
                        for (int j = ((paintlist1.getPosY() - 1) * pixeles); j < ((paintlist1.getPosY()) * pixeles); j++) {
                            img.setRGB(i, j, rgbValue(paintlist1.getColorSelected().getItsColor()));
                        }
                    }
                } else if ((paintlist1.getPosXEnd() < DefaultValue.INICIO_DIMENSION) && (paintlist1.getPosYEnd() > DefaultValue.NO_INICIO_DIMENSION)) {
                    for (int i = ((paintlist1.getPosX() - 1) * pixeles); i < ((paintlist1.getPosX()) * pixeles); i++) {
                        for (int j = ((paintlist1.getPosY() - 1) * pixeles); j < ((paintlist1.getPosYEnd()) * pixeles); j++) {
                            img.setRGB(i, j, rgbValue(paintlist1.getColorSelected().getItsColor()));
                        }
                    }
                } else {
                    for (int i = ((paintlist1.getPosX() - 1) * pixeles); i < ((paintlist1.getPosXEnd()) * pixeles); i++) {
                        for (int j = ((paintlist1.getPosY() - 1) * pixeles); j < ((paintlist1.getPosYEnd()) * pixeles); j++) {
                            img.setRGB(i, j, rgbValue(paintlist1.getColorSelected().getItsColor()));
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Error al agregar los cuadros de colores");
            }
        }

        try {
            File file = new File("/home/angel/Documents/" + lienzo.getId() + ".png");
            ImageIO.write(img, "png", file);
            return true;
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return false;
    }

    public boolean crearImagen(String path, lienzoObj lienzo, LinkedList<AuxPaint> paintlist, colorObj colors) {
        int dimension = lienzo.getItSize().getDimension();
        int pixeles = lienzo.getItSize().getCuadro();
        BufferedImage img = new BufferedImage(dimension * pixeles, dimension * pixeles, BufferedImage.TYPE_INT_ARGB);

        for (int i = 0; i < (dimension * pixeles); i++) {
            for (int j = 0; j < (dimension * pixeles); j++) {
                img.setRGB(i, j, rgbValue(lienzo.getFondo()));
            }
        }

        for (AuxPaint paintlist1 : paintlist) {
            try {
                for (int i = ((paintlist1.getPosX() - 1) * pixeles); i < ((paintlist1.getPosX()) * pixeles); i++) {
                    for (int j = ((paintlist1.getPosY() - 1) * pixeles); j < ((paintlist1.getPosY()) * pixeles); j++) {
                        img.setRGB(i, j, rgbValue(colors.getColorMaker(paintlist1.getName()).getItsColor()));
                    }
                }
            } catch (Exception e) {
                System.out.println("Error al agregar los cuadros de colores");
            }
        }

        try {
            File file = new File("/home/angel/Documents/" + lienzo.getId() + ".png");
            ImageIO.write(img, "png", file);
            return true;
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return false;
    }

    private int rgbValue(color colorIn) {
        if ((colorIn.getRed() > DefaultValue.INVALID_CL_CODE) && (colorIn.getGreen() > DefaultValue.INVALID_CL_CODE) && (colorIn.getBlue() > DefaultValue.INVALID_CL_CODE)) {
            return new Color(colorIn.getRed(), colorIn.getGreen(), colorIn.getBlue()).getRGB();
        } else {
            return Color.decode(colorIn.getHexa()).getRGB();
        }

    }

    public void imagenPrueba() {
        int widthP = 640;
        int heightP = 320;

        BufferedImage img = new BufferedImage(widthP, heightP, BufferedImage.TYPE_INT_ARGB);

        File file = null;
        int[] data = new int[widthP * heightP];
        Color color = new Color(145, 210, 141); //verde palido
        Color color2 = new Color(52, 156, 255); //Celeste pastel

        for (int i = 0; i < widthP; i++) {
            for (int j = 0; j < heightP; j++) {
                img.setRGB(i, j, color.getRGB());
            }
        }

        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 100; j++) {
                img.setRGB(i, j, color2.getRGB());
            }
        }

        try {
            file = new File("/home/angel/Documents/prueba.png");
            ImageIO.write(img, "png", file);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }

    private void createImage() {
//        image.set
    }
}
