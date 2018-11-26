import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class botao extends JFrame {
JButton[] butts = new JButton[145];
public botao() {
		super("Buttons");
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(400, 666);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < butts.length; i++) {
			butts[i] = new JButton(String.format("%d", i));
		}
		for (int i = 0; i < butts.length; i++){
			this.add(butts[i]);
		}
		this.repaint();
		this.validate();	
	}
public static void main(String[] args)
{
	new botao();
}
}