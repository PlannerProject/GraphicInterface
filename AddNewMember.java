package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.*;

@SuppressWarnings("serial")
public class AddNewMember extends JPanel {
	File flTeam = new File("src/project/Team.txt");

	// JPanel for adding new members to the team - consists of 2 boxes (left and
	// right)
	public AddNewMember(JDialog dlg) {
		super();
		Font font_plain = new Font(Font.SERIF, Font.PLAIN, 18);
		Font font_bold = new Font(Font.SERIF, Font.BOLD, 18);
		this.setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);
		Box boxLeft = Box.createVerticalBox();
		Box boxRight = Box.createVerticalBox();
		JPanel pnlRight = new JPanel();
		pnlRight.setLayout(new BorderLayout());

		// Left box
		boxLeft.add(Box.createVerticalGlue()); // add vertical glue
		// JLabel - "Current members"
		JLabel lblMembers = new JLabel("Current members");
		lblMembers.setFont(font_bold);
		boxLeft.add(lblMembers);
		// JTextArea - members of the team
		JTextArea txtMembers = new JTextArea();
		try {
			String s = "";
			try (Scanner sc = new Scanner(flTeam);) {
				while (sc.hasNext()) {
					s += sc.nextLine() + "\n";
				}
			}
			txtMembers.setText(s);
		} catch (Exception e) {
			// TODO: handle exception
		}
		txtMembers.setEditable(false);
		txtMembers.setFont(font_plain);
		txtMembers.setBorder(BorderFactory.createLineBorder(Color.black));
		boxLeft.add(new JScrollPane(txtMembers)); // adding scroll pane
		boxLeft.add(Box.createVerticalGlue()); // add vertical glue

		// Right box
		boxRight.add(Box.createVerticalGlue()); // add vertical glue
		// JLabel - entering the name of a new member
		JLabel lblAddMember = new JLabel("Enter the name of a new member     ");
		lblAddMember.setFont(font_bold);
		boxRight.add(lblAddMember);
		// JTextField for typing the name of a new member
		JTextField txtNewMember = new JTextField();
		txtNewMember.setMaximumSize(new Dimension(500, 30));
		txtNewMember.setFont(font_plain);
		boxRight.add(txtNewMember);
		boxRight.add(Box.createVerticalGlue()); // add vertical glue
		// JButton for adding a new member after typing the name
		JButton btnAddMember = new JButton("Add member");
		btnAddMember.setFont(font_bold);
		btnAddMember.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = txtNewMember.getText();
				addMember(flTeam, name);
				dlg.dispose();
				Planner.setTeam();
			}
		});
		boxRight.add(btnAddMember);
		boxRight.add(Box.createVerticalGlue()); // add vertical glue

		// Adding the boxes to the panel
		add(boxLeft, BorderLayout.CENTER);
		add(boxRight, BorderLayout.EAST);
	}

	// method for adding new member and updating this information in the file with
	// the members of the team
	public static void addMember(File file, String name) {
		TreeSet<String> set = new TreeSet<String>(); // TreeSet for collecting the names sorted alphabetically
		try {
			try (Scanner sc = new Scanner(file);) {
				while (sc.hasNext()) {
					set.add(sc.nextLine());
				}
				set.add(name);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			try (PrintWriter p = new PrintWriter(file);) {
				for (String str : set) {
					p.print(str + "\n");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
