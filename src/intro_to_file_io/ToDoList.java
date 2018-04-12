package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	ArrayList<String> tasks = new ArrayList<String>();
	
public static void main(String[] args) {
	
	ToDoList ToDo = new ToDoList();
	ToDo.buttons();
	
}

JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton AddTask = new JButton();
JButton RemoveTask = new JButton();
JButton Save = new JButton();
JButton Load = new JButton();
JLabel Label = new JLabel();


public void buttons() {
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(100, 400);
	panel.add(AddTask);
	panel.add(RemoveTask);
	panel.add(Save);
	panel.add(Load);
	panel.add(Label);
	AddTask.setText("Add Task");
	RemoveTask.setText("Remove Task");
	Save.setText("Save");
	Load.setText("Load");
	Label.setVisible(true);
	AddTask.addActionListener(this);
	RemoveTask.addActionListener(this);
	Save.addActionListener(this);
	Load.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	String task = null;
	if (e.getSource()==AddTask) {
		task=JOptionPane.showInputDialog("Give Me A Task");
		tasks.add(task);
		System.out.println(tasks);
		for (int i = 0; i < tasks.size(); i++) {
			Label.setText(tasks);
		}
		
	}
	if (e.getSource()==RemoveTask) {
		tasks.remove(tasks.size()-1);
		System.out.println(tasks);
	}
	if (e.getSource()==Save) {
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/ToDoList.txt");
			fw.write("To Do List");
			fw.write("\n"+tasks);
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
}
