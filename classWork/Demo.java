import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class SliderFrame extends JFrame{
	private JTextField textField;
	private JSlider slider;
	SliderFrame(){
		setSize(300,300);
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		textField=new JTextField(15);
		textField.setFont(new Font("",1,20));

		add(textField);
		
		slider=new JSlider(JSlider.VERTICAL,0,100,50);
		slider.setFont(new Font("",1,20));
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent ce) {
				int value=slider.getValue();
				textField.setText(value+"");//Integer.toString(value)
			}
		});

		add(slider);
		
		
	}	
}
class Demo{ 
	public static void main(String args[]){   
		new SliderFrame().setVisible(true);
	} 
}


