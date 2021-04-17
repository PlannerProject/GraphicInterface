package project;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

class ButtonRenderer implements TableCellRenderer {
	JButton button;
	boolean enabled = true;

	public ButtonRenderer() {
		button = new JButton();
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {

		button.setText("Install");
		button.setEnabled(enabled);
		return button;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
