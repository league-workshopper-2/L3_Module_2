package intro_to_file_io;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

	public void buttons() {
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.setSize(400, 400);
		panel.add(AddTask);
		panel.add(RemoveTask);
		panel.add(Save);
		panel.add(Load);

		AddTask.setText("Add Task");
		RemoveTask.setText("Remove Last Task");
		Save.setText("Save");
		Load.setText("Load");

		AddTask.addActionListener(this);
		RemoveTask.addActionListener(this);
		Save.addActionListener(this);
		Load.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String task = null;
		if (e.getSource() == AddTask) {
			task = JOptionPane.showInputDialog("Give Me A Task");
			tasks.add(task);
			System.out.println(tasks);
			// for (int i = 0; i < tasks.size(); i++) {
			// JLabel Label = new JLabel(task);
			// panel.add(Label);
			// Label.setVisible(true);
			// Label.setBounds(200, 200, 50, 50);
			// }

		}
		if (e.getSource() == RemoveTask) {
			String task1 = tasks.remove(tasks.size() - 1);
			System.out.println(tasks);
		}
		if (e.getSource() == Save) {
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/ToDoList.txt");
				fw.write("\n" + tasks);
				fw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == Load) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/ToDoList.txt"));

				String line = br.readLine();
				while (line != null) {
					System.out.println(line);
					line = br.readLine();
					JLabel label = new JLabel(line);
					panel.add(label);
					label.setVisible(true);
				}

				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}
}
