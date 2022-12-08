import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class SliderFrame extends JFrame{
	private JSlider slider;
	private DisplayFrame displayFrame;
	
	SliderFrame(){
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		displayFrame=new DisplayFrame();
		slider=new JSlider(JSlider.VERTICAL,0,100,50);
		slider.setFont(new Font("",1,20));
		slider.setMajorTickSpacing(10);
		slider.setMinorTickSpacing(2);
		slider.setPaintLabels(true);

		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent ce) {
				int value=slider.getValue();
				displayFrame.setSliderValue(value);
			}
		});
		add(slider);
	}	
}
class DisplayFrame extends JFrame{
	private JTextField textFiled;
	DisplayFrame(){
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		textFiled=new JTextField(15);
		textFiled.setFont(new Font("",1,20));
		add(textFiled);
		setVisible(true);
	}	
	public void setSliderValue(int value){
		textFiled.setText(value+"");
	}
}
class Demo1{ 
	public static void main(String args[]){   
		new SliderFrame().setVisible(true);
	} 
}


