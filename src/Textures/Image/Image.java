package Textures.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Image {

    private BufferedImage image;
    private String imagePath;

    public Image(String path) {
        this.imagePath = path;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void loadImage() {
        if (imagePath == null) {
            try {
                image = ImageIO.read(new File(imagePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("imagePath ,in" + Thread.currentThread().getClass().getName() + ", is null! :(");
    }

}
