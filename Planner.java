package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Planner extends JFrame {

	static JTextArea txtPeopleInTeam = new JTextArea();

	public Planner() {

		super("Planner");
		// JFrame f = new JFrame("Planner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// f.setSize( 425, 200 );
		// f.setLocationRelativeTo(null);
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.white);

		JLabel lblTeam = new JLabel("<html> <font color='red'>Team: </font></html>");
		lblTeam.setFont(lblTeam.getFont().deriveFont(16.0f));
		lblTeam.setBounds(30, 25, 50, 50);
		p.add(lblTeam);

		Border blackline = BorderFactory.createLineBorder(Color.black);

		setTeam();
		txtPeopleInTeam.setEditable(false);
		txtPeopleInTeam.setLineWrap(true);
		txtPeopleInTeam.setWrapStyleWord(true);
		txtPeopleInTeam.setFont(txtPeopleInTeam.getFont().deriveFont(16.0f));
		txtPeopleInTeam.setBorder(blackline);
		// txtPeopleInTeam.setBounds(90, 26, 450, 50);
		JScrollPane scrp = new JScrollPane(txtPeopleInTeam);
		scrp.setBounds(90, 26, 500, 50);
		p.add(scrp);

		// button for adding new member
		JButton adding = new JButton("Add New Member");
		adding.setFont(txtPeopleInTeam.getFont().deriveFont(16.0f));
		adding.setBackground(Color.ORANGE);
		adding.setBorder(blackline);
		adding.setBounds(600, 25, 175, 50);
		adding.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JDialog dlgAddNewMember = new JDialog(Planner.this, "Add new member", true);
				dlgAddNewMember.setSize(600, 300);
				dlgAddNewMember.setLocationRelativeTo(null);
				dlgAddNewMember.add(new AddNewMember(dlgAddNewMember));
				dlgAddNewMember.setVisible(true);
			}
		});
		p.add(adding);
		
		// button for adding new member
				JButton btnRemoveMember = new JButton("Remove Member");
				btnRemoveMember.setFont(txtPeopleInTeam.getFont().deriveFont(16.0f));
				btnRemoveMember.setBackground(Color.ORANGE);
				btnRemoveMember.setBorder(blackline);
				btnRemoveMember.setBounds(790, 25, 175, 50);
				btnRemoveMember.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						JDialog dlgRemoveMember = new JDialog(Planner.this, "Remove member", true);
						dlgRemoveMember.setSize(700, 300);
						dlgRemoveMember.setLocationRelativeTo(null);
						dlgRemoveMember.add(new RemoveMember(dlgRemoveMember));
						dlgRemoveMember.setVisible(true);
					}
				});
				p.add(btnRemoveMember);

		DefaultTableModel dm = new DefaultTableModel();
		dm.setDataVector(
				new Object[][] {
						{ "Name of Assignment", "Person in charge", "Initial Date", "Due Date", "Status of Assignment",
								"Edit/remove Assignment" },
						{ "Name", "Person 1", "Date 1", "Date 2", "Status", "Edit/remove" } },
				new Object[] { " Name of Assignment", "Person in charge", "Initial Date", "Due Date",
						"Status of Assignment", "Edit/remove assignment" });

		JTable table = new JTable(dm);
		table.setBounds(10, 100, 960, 100);
		table.setFont(table.getFont().deriveFont(16.0f));
		table.setBorder(blackline);

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		centerRenderer.setVerticalAlignment(JLabel.CENTER);
		table.getColumn("Edit/remove assignment").setCellRenderer(new ButtonRenderer());
		table.getColumn("Edit/remove assignment").setCellEditor(new ButtonEditor(new JCheckBox()));

		table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
		table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
		table.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
		table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
		table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
		table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);

		table.setBackground(Color.lightGray);
		table.setRowHeight(0, 60);
		table.setRowHeight(1, 60);
		table.getColumnModel().getColumn(0).setPreferredWidth(2000);
		table.getColumnModel().getColumn(1).setPreferredWidth(2000);
		table.getColumnModel().getColumn(2).setPreferredWidth(1300);
		table.getColumnModel().getColumn(3).setPreferredWidth(1100);
		table.getColumnModel().getColumn(4).setPreferredWidth(2000);
		table.getColumnModel().getColumn(5).setPreferredWidth(2000);
		p.add(new JScrollPane(table));
		p.add(table);

		JButton addAss = new JButton("Add New Assignment");
		addAss.setFont(txtPeopleInTeam.getFont().deriveFont(16.0f));
		addAss.setBackground(Color.ORANGE);
		addAss.setBorder(blackline);
		addAss.setBounds(180, 230, 175, 50);
		addAss.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JDialog dlgAddAss = new JDialog(Planner.this, "Add new assignment", true);
				dlgAddAss.setSize(815, 375);
				dlgAddAss.setLocationRelativeTo(null);
				dlgAddAss.add(new AddNewAssignment(dlgAddAss));
				dlgAddAss.setVisible(true);

			}

		});
		p.add(addAss);

		JButton progress = new JButton("Check progress");
		progress.setFont(txtPeopleInTeam.getFont().deriveFont(16.0f));
		progress.setBackground(Color.ORANGE);
		progress.setBorder(blackline);
		progress.setBounds(650, 230, 175, 50);
		progress.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dlgCheckProgress = new JDialog(Planner.this, "Check Progress", true);
				dlgCheckProgress.setSize(825, 375);
				dlgCheckProgress.setLocationRelativeTo(null);
				dlgCheckProgress.add(new Progress());
				dlgCheckProgress.setVisible(true);

			}

		});
		p.add(progress);

		this.add(p);
		this.setSize(1000, 350);
		this.setVisible(true);
	}

	public static void setTeam() {
		String team = "";
		TreeSet<String> set = Team.returnTeam();
		for (String str : set) {
			team += str + ", ";
		}
		if (team.length() > 2) {
			team = team.substring(0, team.length() - 2);
		}
		txtPeopleInTeam.setText(team);
	}
}
