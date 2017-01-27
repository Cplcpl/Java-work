import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.*;

import java.util.*;

public class BaseballStats implements ActionListener
{
	private JTextField playField = null;
	private JTextArea allPField = null;
	private JSpinner gameone = null;
	private JSpinner gametwo = null;
	private JSpinner gamethr = null;
	private JSpinner gamefou = null;
	private JSpinner gamefiv = null;
	private JButton add = null, reset = null, show = null;	
	
	ArrayList<Player> players;
	
	public static void main(String[] args) 
	{
		new BaseballStats();
	}
	
	public BaseballStats() 
	{
//////  Gui stuff \/
		
		//Make frame
		JFrame theFrame = new JFrame(); 
		theFrame.setTitle("Baseball Stats");
		theFrame.setLocation(200, 300);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
		//Make panel
		JPanel mainPanel = (JPanel)theFrame.getContentPane();
				
		//Layout
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); 
				
		//Border
		Border border = BorderFactory.createEmptyBorder(10,10,10,10);
		mainPanel.setBorder(border);
		
//////
		
		//Make panel
		JPanel playPanel = new JPanel();
				
		//Label
		JLabel playName = new JLabel("Player Name:");
		playPanel.add(playName);
				
		//Text field
		playField = new JTextField("", 20);
		mainPanel.add(playField);
		playField.addActionListener(this);
				
		//Add to panel
		playPanel.add(playName);
		playPanel.add(playField);
		
		//Add to mainPanel
		mainPanel.add(playPanel);
		
		
//////
		//Make panels
		JPanel game1P = new JPanel();
		JPanel game2P = new JPanel();
		JPanel game3P = new JPanel();
		JPanel game4P = new JPanel();
		JPanel game5P = new JPanel();
		
		//Labels
		JLabel game1L = new JLabel("Game 1 Hits:");
		JLabel game2L = new JLabel("Game 2 Hits:");
		JLabel game3L = new JLabel("Game 3 Hits:");
		JLabel game4L = new JLabel("Game 4 Hits:");
		JLabel game5L = new JLabel("Game 5 Hits:");
		
		
		//Spinners
		gameone = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		gametwo = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		gamethr = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		gamefou = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		gamefiv = new JSpinner(new SpinnerNumberModel(0,0,5,1));
		
		//Add to panel
		game1P.add(game1L);
		game1P.add(gameone);
		
		game2P.add(game2L);
		game2P.add(gametwo);
		
		game3P.add(game3L);
		game3P.add(gamethr);
		
		game4P.add(game4L);
		game4P.add(gamefou);
		
		game5P.add(game5L);
		game5P.add(gamefiv);
		
		//Add to mainPanel
		mainPanel.add(game1P);
		mainPanel.add(game2P);
		mainPanel.add(game3P);
		mainPanel.add(game4P);
		mainPanel.add(game5P);
		
//////

		//Make panel
		JPanel currPanel = new JPanel();
		
		//Label
		JLabel currName = new JLabel("Current Players:");
		currPanel.add(currName);
		
		allPField = new JTextArea(5,20);
		allPField.setLineWrap(true);
		allPField.setEditable(false);
		
		JScrollPane allPscroll = new JScrollPane(allPField,
		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		//Add to panel
		currPanel.add(allPscroll);
		
		//Add to mainPanel
		mainPanel.add(currPanel);
				
//////
		
		//Make panel
		JPanel buttPanel = new JPanel();
				
		//Buttons
	    add = new JButton("Add Player");
	    reset = new JButton("Reset Values");
	    show = new JButton("Show Stats");
	    
	    //Add listeners
	    add.addActionListener(this);
	    reset.addActionListener(this);
	    show.addActionListener(this);
	    
	    //Add to panel
	    buttPanel.add(add);
	    buttPanel.add(reset);
	    buttPanel.add(show);
	    
	    //Add to mainPanel
	    mainPanel.add(buttPanel);
		
//////
		
		//Make Visible
		theFrame.setVisible(true);
		theFrame.pack();
		
//////  Non gui stuff \/
		
		players = new ArrayList<Player>();
		
	}
	public void actionPerformed(ActionEvent event)
	   {
			Object control = event.getSource();
			if(control == add)
			{
				String userEnter = playField.getText();
				int g1 = (Integer)gameone.getValue();
				int g2 = (Integer)gametwo.getValue();
				int g3 = (Integer)gamethr.getValue();
				int g4 = (Integer)gamefou.getValue();
				int g5 = (Integer)gamefiv.getValue();
				
				players.add(new Player(userEnter, g1, g2, g3, g4, g5));
				
				playField.setText("");
				allPField.setText("");
				
				gameone.setValue(new Integer(0));
				gametwo.setValue(new Integer(0));
				gamethr.setValue(new Integer(0));
				gamefou.setValue(new Integer(0));
				gamefiv.setValue(new Integer(0));
				
				for (Player play : players)  
				{
				    String name = play.name;
				    allPField.append(name + "\n");
				} 
			}
			if(control == reset);
			{
				/*playField.setText("");
				allPField.setText("");
				
				gameone.setValue(new Integer(0));
				gametwo.setValue(new Integer(0));
				gamethr.setValue(new Integer(0));
				gamefou.setValue(new Integer(0));
				gamefiv.setValue(new Integer(0));
				
				players.clear();
				*/
			}
	   }
}
