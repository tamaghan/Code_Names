package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class SelectingCardsListener extends JFrame implements ActionListener
{
	private static final Border UNSELECTED_BORDER = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    private static final Border SELECTED_BORDER = BorderFactory.createMatteBorder(5, 5, 5, 5,Color.BLACK);
	private String path;
	private static JLabel label = new JLabel();
    
    private JLabel createDisplayImage(String fileNameRelativeToClassFile) {
        JLabel retVal = new JLabel();
        java.net.URL imgURL = this.getClass().getResource(fileNameRelativeToClassFile);
        if (imgURL == null) {
          throw new IllegalArgumentException("Couldn't find file: " + path);
        }
        ImageIcon cardImage = new ImageIcon(imgURL);    
        retVal.setIcon(cardImage);
        Dimension d = new Dimension(cardImage.getIconWidth() + 10, cardImage.getIconHeight() + 10);
        retVal.setSize(d);
        retVal.setPreferredSize(d);
        retVal.setMaximumSize(d);
        retVal.setMinimumSize(d);	
        return retVal;
      }
    public static void select(JLabel label) {
        label.setBorder(SELECTED_BORDER);
        label.repaint();
      }
    
    public static void unselect() {
        label.setBorder(UNSELECTED_BORDER);
        label.repaint();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
