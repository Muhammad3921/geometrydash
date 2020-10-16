package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class all images that are to be used
 */
public class Images {
	public static BufferedImage[] background;
	public static BufferedImage[] player;

	public Images() {
		background = new BufferedImage[6]; //Initializes arrays for backgrounds and player spites
		player = new BufferedImage[3];
		try {
			/*background[0] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/back.jpg"));
			background[1] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/background.jpg"));
			background[2] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/menuBack.png"));
			background[3] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/deathBackground.jpg"));
			background[4] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/win.jpg"));
			background[5] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/helpBackground.jpg"));
			player[0] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/pic.png"));
			player[1] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/pic2.png"));
			player[2] = ImageIO.read(new File("/Users/sanaa/Desktop/GamePics/pic3.png"));
			
			*/
			background[0] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\back2.jpg")); //reads all files from game pics folder
			background[1] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\background.jpg"));
			background[2] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\menuBack.png"));
			background[3] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\deathBackground.jpg"));
			background[4] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\win.jpg"));
			background[5] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\helpBackground.jpg"));
			player[0] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\pic.png"));
			player[1] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\pic2.png"));
			player[2] = ImageIO.read(new File("C:\\Users\\Muhammad\\Desktop\\GamePics\\pic3.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
