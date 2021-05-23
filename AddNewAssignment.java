package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class AddNewAssignment extends JPanel {

	public AddNewAssignment(JDialog dlg) {
		JPanel panel = new JPanel();
		setBackground(Color.WHITE);
		setLayout(null);

		Border blackline = BorderFactory.createLineBorder(Color.BLACK);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(panel.getFont().deriveFont(Font.BOLD, 16.0f));
		btnCancel.setBackground(Color.RED);
		btnCancel.setBorder(blackline);
		btnCancel.setBounds(400, 250, 125, 50);
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dlg.dispose();
			}
		});
		add(btnCancel);

		JLabel lblNameOfAssignment = new JLabel("Name of Assignment", SwingConstants.CENTER);
		lblNameOfAssignment.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		lblNameOfAssignment.setBorder(blackline);
		lblNameOfAssignment.setBounds(30, 50, 160, 50);
		add(lblNameOfAssignment);

		JLabel lblPerson = new JLabel("Person in Charge", SwingConstants.CENTER);
		lblPerson.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		lblPerson.setBorder(blackline);
		lblPerson.setBounds(190, 50, 140, 50);
		add(lblPerson);

		JLabel lblInitialDate = new JLabel("Initial Date", SwingConstants.CENTER);
		lblInitialDate.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		lblInitialDate.setBorder(blackline);
		lblInitialDate.setBounds(330, 50, 110, 50);
		add(lblInitialDate);

		JLabel lblDueDate = new JLabel("Due Date", SwingConstants.CENTER);
		lblDueDate.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		lblDueDate.setBorder(blackline);
		lblDueDate.setBounds(440, 50, 150, 50);
		add(lblDueDate);

		JLabel lblStatus = new JLabel("Status of Assignment", SwingConstants.CENTER);
		lblStatus.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		lblStatus.setBorder(blackline);
		lblStatus.setBounds(590, 50, 175, 50);
		add(lblStatus);

		JTextField txtAssignment = new JTextField("Enter Name", SwingConstants.CENTER);
		txtAssignment.setHorizontalAlignment(JTextField.CENTER);
		txtAssignment.setFont(panel.getFont().deriveFont(Font.ITALIC, 14.0f));
		txtAssignment.setBorder(blackline);
		txtAssignment.setBounds(30, 100, 160, 100);
		add(txtAssignment);

		JComboBox comboNames = new JComboBox(Team.returnTeam().toArray());
		((JLabel) comboNames.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboNames.setBackground(Color.WHITE);
		comboNames.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboNames.setBorder(blackline);
		comboNames.setBounds(190, 100, 140, 100);
		add(comboNames);

		LocalDate initialDate = LocalDate.now();
		JLabel lblInitialDateValue = new JLabel(
				initialDate.getDayOfMonth() + " " + initialDate.getMonth() + " " + initialDate.getYear(),
				SwingConstants.CENTER);
		lblInitialDateValue.setFont(panel.getFont().deriveFont(Font.ITALIC, 15.0f));
		lblInitialDateValue.setBorder(blackline);
		lblInitialDateValue.setBounds(330, 100, 110, 100);
		add(lblInitialDateValue);

		JLabel lblDay = new JLabel("D", SwingConstants.CENTER);
		lblDay.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		lblDay.setBorder(blackline);
		lblDay.setBounds(440, 100, 50, 40);
		add(lblDay);

		JLabel lblMonth = new JLabel("M", SwingConstants.CENTER);
		lblMonth.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		lblMonth.setBorder(blackline);
		lblMonth.setBounds(490, 100, 50, 40);
		add(lblMonth);

		JLabel lblYear = new JLabel("Y", SwingConstants.CENTER);
		lblYear.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		lblYear.setBorder(blackline);
		lblYear.setBounds(540, 100, 50, 40);
		add(lblYear);

		String[] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		JComboBox comboDays = new JComboBox(days);
		((JLabel) comboDays.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboDays.setBackground(Color.WHITE);
		comboDays.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboDays.setBorder(blackline);
		comboDays.setBounds(440, 140, 50, 60);
		add(comboDays);

		String[] months = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		JComboBox comboMonths = new JComboBox(months);
		((JLabel) comboMonths.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboMonths.setBackground(Color.WHITE);
		comboMonths.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboMonths.setBorder(blackline);
		comboMonths.setBounds(490, 140, 50, 60);
		add(comboMonths);

		String[] years = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20", "21", "22", "23", "24" };
		JComboBox comboYears = new JComboBox(years);
		((JLabel) comboYears.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboYears.setBackground(Color.WHITE);
		comboYears.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboYears.setBorder(blackline);
		comboYears.setBounds(540, 140, 50, 60);
		add(comboYears);

		String[] status = { "Completed", "Uncompleted" };
		JComboBox comboStatus = new JComboBox(status);
		((JLabel) comboStatus.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboStatus.setBackground(Color.WHITE);
		comboStatus.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboStatus.setBorder(blackline);
		comboStatus.setBounds(590, 100, 175, 100);
		add(comboStatus);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(panel.getFont().deriveFont(Font.BOLD, 16.0f));
		btnSubmit.setBackground(Color.GREEN);
		btnSubmit.setBorder(blackline);
		btnSubmit.setBounds(550, 250, 125, 50);
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LocalDate dueDate = LocalDate.of(comboYears.getSelectedIndex() + 2001,
						comboMonths.getSelectedIndex() + 1, comboDays.getSelectedIndex() + 1);
				boolean status = comboStatus.getSelectedItem().equals("Completed") ? true : false;
				Assignment newAssignment = new Assignment(txtAssignment.getText(),
						(String) comboNames.getSelectedItem(), initialDate, dueDate, status);
				dlg.dispose();
			}
		});
		add(btnSubmit);
	}
}
