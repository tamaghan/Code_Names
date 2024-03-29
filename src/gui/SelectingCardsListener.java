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
/**
 * Class used for selecting cards and setting up JLabels
 * @author  tamaghan , dandrijje, fmdestin, tbjackso
 *
 */
public class SelectingCardsListener extends JFrame implements ActionListener{
	/**
	 * fields for selecting a boarder, unselecting a border, and a JLabel
	 */
	private static final Border UNSELECTED_BORDER = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    private static final Border SELECTED_BORDER = BorderFactory.createMatteBorder(5, 5, 5, 5,Color.BLACK);
	private static JLabel label = new JLabel();
    /**
     * takes filename and returns jLabel with proper gif file
     * @param fileNameRelativeToClassFile
     * @return
     */
    public JLabel createDisplayImage(String fileNameRelativeToClassFile) {
        JLabel retVal = new JLabel();
        java.net.URL imgURL = this.getClass().getResource(fileNameRelativeToClassFile);
        if (imgURL == null) {
          throw new IllegalArgumentException("Couldn't find file: " + fileNameRelativeToClassFile);
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
    /**
     * selects label
     * @param label
     */
    public static void select(JLabel label) {
        label.setBorder(SELECTED_BORDER);
        label.repaint();
      }
    /**
     * unselects label
     */
    public static void unselect() {
        label.setBorder(UNSELECTED_BORDER);
        label.repaint();
    }
    /**
     * method to be deleted
     */
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
