package GUI
mport java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.Border;

public Class GUI
{
  private JMenuBar menuBar = new JMenuBar();
	private JMenu menu = new JMenu("New Game");
	private JMenuItem item1 = new JMenuItem("New Golf Game");
	private JMenuItem item2 = new JMenuItem("New Little Spider Game");
	private JMenuItem item3 = new JMenuItem("Exit");
	private static final Border UNSELECTED_BORDER = BorderFactory.createEmptyBorder(5, 5, 5, 5);
	private static final Border SELECTED_BORDER = BorderFactory.createMatteBorder(5, 5, 5, 5,Color.BLACK);
	
    public static void select(JLabel label) 
    {
        label.setBorder(SELECTED_BORDER);
        label.repaint();
      }

public void MenuBarAdd()
	{
		menuBar.add(menu);
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
	}
  
  @Override
	public void keyPressed(KeyEvent e) 
  {
		
	}

	@Override
	public void keyReleased(KeyEvent e) 
  {
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
  {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
  {
		
	}

















}
