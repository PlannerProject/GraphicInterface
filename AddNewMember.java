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

public class AddNewMember extends ChangeMember{

	public AddNewMember(JDialog dlg) {
		super(dlg);
		// TODO Auto-generated constructor stub
		super.lblChangeMember.setText("Enter the name of a new member         ");
		super.btnChangeMember.setText("Add Member");
		super.btnChangeMember.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = AddNewMember.super.txtChangeMember.getText();
				Team.addMember(name);
				dlg.dispose();
				Planner.setTeam();
			}
		});
	}
	
}
