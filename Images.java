package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Images {
public static BufferedImage[] background;
public static BufferedImage[] player;

public Images(){
	background = new BufferedImage[3];
	player = new BufferedImage[3];
	try {
		background [0] = ImageIO.read(new File("back.jpg"));
		background [1] = ImageIO.read(new File("background.jpeg"));
		background [2] = ImageIO.read(new File("menuBack.png"));
		player [0] = ImageIO.read(new File("option3.png"));
		player [1] = ImageIO.read(new File("option2.png"));
		player [2] = ImageIO.read(new File("option1.png"));
		/*	background [0] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\back.jpg"));
		background [1] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\back1.jpeg"));
		background [2] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\menuBack.png"));
		player [0] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\option3.png"));
		player [1] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\option2.png"));
		player [2] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\option1.png"));
		 * 
		 * 
		background [0] = ImageIO.read(new File("H:\\GamePics\\back.jpg"));
		background [1] = ImageIO.read(new File("H:\\GamePics\\back1.jpeg"));
		background [2] = ImageIO.read(new File("H:\\GamePics\\menuBack.png"));
		player [0] = ImageIO.read(new File("H:\\GamePics\\option3.png"));
		player [1] = ImageIO.read(new File("H:\\GamePics\\option2.png"));
		player [2] = ImageIO.read(new File("H:\\GamePics\\option1.png"));
		 */
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}




}
