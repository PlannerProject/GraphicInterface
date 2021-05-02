package project;
import java.awt.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class AddNewMember extends JPanel{

	//JPanel for adding new members to the team - consists of 2 boxes (left and right)
	public AddNewMember() {
		super();
		Font font_plain = new Font(Font.SERIF, Font.PLAIN, 18);
		Font font_bold = new Font(Font.SERIF, Font.BOLD, 18);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);
		Box boxLeft = Box.createVerticalBox();
		Box boxRight = Box.createVerticalBox();
		JPanel pnlRight = new JPanel();
		pnlRight.setLayout(new BorderLayout());
		
		//Left box
		boxLeft.add(Box.createVerticalGlue());
		JLabel lblMembers = new JLabel("Current members");
		lblMembers.setFont(font_bold);
		boxLeft.add(lblMembers);
		boxLeft.add(Box.createVerticalGlue());
		JTextArea txtMembers = new JTextArea();
		txtMembers.setPreferredSize(new Dimension(200, 200));
		txtMembers.setEditable(false);
		txtMembers.setFont(font_plain);
		txtMembers.setBorder(BorderFactory.createLineBorder(Color.black));
		boxLeft.add(txtMembers);
		boxLeft.add(Box.createVerticalGlue());
		
		//Right box
		boxRight.add(Box.createVerticalGlue());
		JLabel lblAddMember = new JLabel("Enter the name of a new member     ");
		lblAddMember.setFont(font_bold);
		boxRight.add(lblAddMember);
		JTextField txtNewMember = new JTextField();
		txtNewMember.setMaximumSize(new Dimension(500, 30));
		txtNewMember.setFont(font_plain);
		boxRight.add(txtNewMember);
		boxRight.add(Box.createVerticalGlue());
		JButton btnAddMember = new JButton("Add member");
		btnAddMember.setFont(font_bold);
		boxRight.add(btnAddMember);
		boxRight.add(Box.createVerticalGlue());
		
		//Adding the boxes to the panel
		add(boxLeft, BorderLayout.CENTER);
		add(boxRight, BorderLayout.EAST);
	}
}
