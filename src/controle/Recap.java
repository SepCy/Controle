
package controle;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



class Recap extends JFrame{



public Recap(){     
   super("Recapitulatif");
   
   this.setDefaultCloseOperation(EXIT_ON_CLOSE);

   
   
   Container contentPane = this.getContentPane();


// Choix du gestionnaire de disposition
		BorderLayout layout = new BorderLayout();
		contentPane.setLayout(layout);

		JPanel panel = new JPanel();

		JLabel label = new JLabel(" " );
		panel.add(label);
		// Ici ne sert pas car le panel est seul
		contentPane.add(panel, BorderLayout.CENTER);
		this.pack();

      this.setSize(700, 500);
      this.setLocationRelativeTo(null);
      this.setVisible(true);


}
    public static void main(String[] args){
  
     Recap rec = new Recap();
     rec.getClass();
    
    
    }
    
    
}
