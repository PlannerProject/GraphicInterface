package project;
import java.awt.Color;
import java.awt.Font;
import java.util.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class AddNewAssignment extends JPanel {

	public AddNewAssignment() {
		JPanel panel = new JPanel();
		setBackground(Color.WHITE);
		setLayout(null);
	
		
		Border blackline = BorderFactory.createLineBorder(Color.BLACK);
		
		JButton cancel = new JButton("Cancel");
		cancel.setFont(panel.getFont().deriveFont(Font.BOLD, 16.0f));
		cancel.setBackground(Color.RED);
		cancel.setBorder(blackline);
		cancel.setBounds(400, 250, 125, 50);
		add(cancel);
		
		JButton submit = new JButton("Submit");
		submit.setFont(panel.getFont().deriveFont(Font.BOLD, 16.0f));
		submit.setBackground(Color.GREEN);
		submit.setBorder(blackline);
		submit.setBounds(550, 250, 125, 50);
		add(submit);
		
		JLabel nameLabel = new JLabel("Name of Assignment", SwingConstants.CENTER);
		nameLabel.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		nameLabel.setBorder(blackline);
		nameLabel.setBounds(30, 50, 160, 50);
		add(nameLabel);
		
		JLabel inChargeLabel = new JLabel("Person in Charge", SwingConstants.CENTER);
		inChargeLabel.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		inChargeLabel.setBorder(blackline);
		inChargeLabel.setBounds(190, 50, 140, 50);
		add(inChargeLabel);
		
		JLabel inDateLabel = new JLabel("Initial Date", SwingConstants.CENTER);
		inDateLabel.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		inDateLabel.setBorder(blackline);
		inDateLabel.setBounds(330, 50, 110, 50);
		add(inDateLabel);
		
		JLabel dueDateLabel = new JLabel("Due Date", SwingConstants.CENTER);
		dueDateLabel.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		dueDateLabel.setBorder(blackline);
		dueDateLabel.setBounds(440, 50, 150, 50);
		add(dueDateLabel);
		
		JLabel statusLabel = new JLabel("Status of Assignment", SwingConstants.CENTER);
		statusLabel.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		statusLabel.setBorder(blackline);
		statusLabel.setBounds(590, 50, 175, 50);
		add(statusLabel);
		
		JTextField nameTextField = new JTextField("Enter Name", SwingConstants.CENTER);
		nameTextField.setHorizontalAlignment(JTextField.CENTER);
		nameTextField.setFont(panel.getFont().deriveFont(Font.ITALIC, 14.0f));
		nameTextField.setBorder(blackline);
		nameTextField.setBounds(30, 100, 160, 100);
		add(nameTextField);
		
		String[] names = {"Kali", "Persi", "Sofi"};
		JComboBox comboNames = new JComboBox(names);
		((JLabel)comboNames.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboNames.setBackground(Color.WHITE);
		comboNames.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboNames.setBorder(blackline);
		comboNames.setBounds(190, 100, 140, 100);
		add(comboNames);
		
		JLabel todaysDateLabel = new JLabel("Today's date", SwingConstants.CENTER);
		todaysDateLabel.setFont(panel.getFont().deriveFont(Font.ITALIC, 15.0f));
		todaysDateLabel.setBorder(blackline);
		todaysDateLabel.setBounds(330, 100, 110, 100);
		add(todaysDateLabel);
		
		JLabel dayLabel = new JLabel("D", SwingConstants.CENTER);
		dayLabel.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		dayLabel.setBorder(blackline);
		dayLabel.setBounds(440, 100, 50, 40);
		add(dayLabel);
		
		JLabel monthLabel = new JLabel("M", SwingConstants.CENTER);
		monthLabel.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		monthLabel.setBorder(blackline);
		monthLabel.setBounds(490, 100, 50, 40);
		add(monthLabel);
		
		JLabel yearLabel = new JLabel("Y", SwingConstants.CENTER);
		yearLabel.setFont(panel.getFont().deriveFont(Font.BOLD, 15.0f));
		yearLabel.setBorder(blackline);
		yearLabel.setBounds(540, 100, 50, 40);
		add(yearLabel);
		
		String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", 
				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		JComboBox comboDays = new JComboBox(days);
		((JLabel)comboDays.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboDays.setBackground(Color.WHITE);
		comboDays.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboDays.setBorder(blackline);
		comboDays.setBounds(440, 140, 50, 60);
		add(comboDays);
		
		String[] months = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		JComboBox comboMonths = new JComboBox(months);
		((JLabel)comboMonths.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboMonths.setBackground(Color.WHITE);
		comboMonths.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboMonths.setBorder(blackline);
		comboMonths.setBounds(490, 140, 50, 60);
		add(comboMonths);
		
		String[] years = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"};
		JComboBox comboYears = new JComboBox(years);
		((JLabel)comboYears.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboYears.setBackground(Color.WHITE);
		comboYears.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboYears.setBorder(blackline);
		comboYears.setBounds(540, 140, 50, 60);
		add(comboYears);
		
		String[] status = {"Completed", "Uncompleted"};
		JComboBox comboStatus = new JComboBox(status);
		((JLabel)comboStatus.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		comboStatus.setBackground(Color.WHITE);
		comboStatus.setFont(panel.getFont().deriveFont(Font.ITALIC, 16.0f));
		comboStatus.setBorder(blackline);
		comboStatus.setBounds(590, 100, 175, 100);
		add(comboStatus);
		}
	}

