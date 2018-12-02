/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author ld_si
 */
public class RoundImageSample {

    private static final Stroke stroke = new BasicStroke(1.5f);

    private RoundImageSample() {
    }

    public static Image getRoundImage(Image imageSource, int radius, int w, int h) {
//        int width = imageSource.getWidth(null);
//        int height = imageSource.getHeight(null);

        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        RoundRectangle2D rect = new RoundRectangle2D.Double(0, 0, w, h, radius, radius);

        Graphics2D g2 = (Graphics2D) image.getGraphics();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.clip(rect);
        g2.drawImage(imageSource, 0, 0, null);

        g2.setStroke(stroke);
        g2.setColor(Color.WHITE);
        g2.draw(rect);

        return image;
    }

}
