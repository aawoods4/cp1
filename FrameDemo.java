import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo"); //makes the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
		frame.setSize(400, 400); //sets size of frame
		Shapes r = new Shapes();
		frame.add(r);
		frame.setVisible(true); //makes it so u can see frame
	}
}
