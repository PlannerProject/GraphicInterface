package project;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EditingButton {

	public EditingButton() {
		JFrame f = new JFrame("Edit/remove Assignment");
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.white);

		Border blackline = BorderFactory.createLineBorder(Color.black);

		DefaultTableModel dm = new DefaultTableModel();
		dm.setDataVector(
				new Object[][] { { "Name of Assignment", "Person in charge", "Initial Date", "Due Date",
						"Status of Assignment", }, { "Name", "Person 1", "Date 1", "Date 2", "Status" } },
				new Object[] { " Name of Assignment", "Person in charge", "Initial Date", "Due Date",
						"Edit/remove assignment" });

		JTable table = new JTable(dm);
		table.setBounds(10, 50, 960, 100);
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

		table.setBackground(Color.lightGray);
		table.setRowHeight(0, 60);
		table.setRowHeight(1, 60);
		table.getColumnModel().getColumn(0).setPreferredWidth(2000);
		table.getColumnModel().getColumn(1).setPreferredWidth(2000);
		table.getColumnModel().getColumn(2).setPreferredWidth(1300);
		table.getColumnModel().getColumn(3).setPreferredWidth(1100);
		table.getColumnModel().getColumn(4).setPreferredWidth(2000);

		JButton submit = new JButton("Submit");
		submit.setFont(submit.getFont().deriveFont(16.0f));
		submit.setBackground(Color.GREEN);
		submit.setBorder(blackline);
		submit.setBounds(725, 210, 175, 50);
		p.add(submit);

		JButton cancel = new JButton("Cancel");
		cancel.setFont(submit.getFont().deriveFont(16.0f));
		cancel.setBackground(Color.pink);
		cancel.setBorder(blackline);
		cancel.setBounds(50, 210, 175, 50);
		p.add(cancel);

		JButton delete = new JButton("Delete Assignment");
		delete.setFont(submit.getFont().deriveFont(16.0f));
		delete.setBackground(Color.red);
		delete.setBorder(blackline);
		delete.setBounds(390, 210, 175, 50);
		p.add(delete);

		p.add(new JScrollPane(table));
		p.add(table);

		table.setDefaultRenderer(JLabel.class, new Renderer());

		f.add(p);
		f.setSize(1000, 350);
		f.setVisible(true);
	}

}
