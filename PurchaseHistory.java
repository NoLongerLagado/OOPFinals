
package shophomepage;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.io.BufferedReader;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.io.BufferedWriter;


public class PurchaseHistory extends JFrame implements ActionListener{
    
//  private JPanel purchasePanel;
//    private JTextArea purchaseTextArea;
    private JButton btnHomepage;
     private JPanel btnpanel, historypanel ;
     private JTextArea txthistory; 
     private List<String> purchaseHistory;
     
     
     
    public PurchaseHistory() {
        
        //    purchaseHistory = new ArrayList<>();
           
        setTitle("PURCHASE HISTORY");
        setSize(400, 600);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Downloads\\olshoppinglogo.png");    
        setIconImage(icon); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
       
        
        JLabel titleLabel = new JLabel("TRANSACTIONS");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 25, 0, 0));
        add(titleLabel, BorderLayout.NORTH);
        
        btnHomepage = new JButton("Back to Homepage");
        btnHomepage.setFont(new Font("Arial", Font.BOLD, 13));
        btnHomepage.setBackground(Color.PINK);
        btnHomepage.addActionListener(this);
       // btnHomepage.setBounds(0, 0, 0, 0);
       // add(btnHomepage, BorderLayout.SOUTH);
       
       
         
        
         
        
        
        
         JPanel btnpanel = new JPanel();
        btnpanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnpanel.setBackground(Color.WHITE);
        btnpanel.setBorder(new EmptyBorder(10, 0, 10, 0));
        btnpanel.add(btnHomepage);
        add(btnpanel, BorderLayout.SOUTH);
        
        historypanel = new JPanel();
        historypanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(),
                "",
                TitledBorder.DEFAULT_JUSTIFICATION,
                TitledBorder.DEFAULT_POSITION,
                new Font("Times New Roman", Font.BOLD, 16)));
        historypanel.setLayout(new GridLayout(0, 1));
        historypanel.setBackground(Color.WHITE);
        txthistory = new JTextArea();
        Font itemFont = new Font("Calibri", Font.PLAIN, 16);
        txthistory.setFont(itemFont);
        txthistory.setEditable(false);
        JScrollPane itemScrollPane = new JScrollPane(txthistory);
        historypanel.add(itemScrollPane, BorderLayout.CENTER);
        add(historypanel, BorderLayout.CENTER);
          
          
        
        


        showPurchasedItems();
        setVisible(true);
    }
    

private void showPurchasedItems(){
    String fileName = "OrderDetails.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            // Append each line to the StringBuilder
            sb.append(line).append("\n");
        }
        // Set the StringBuilder's content to the txthistory JTextArea
        txthistory.setText(sb.toString());
    } catch (IOException e) {
        e.printStackTrace();
        // Handle any exception that might occur while reading the file
    }
}


     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnHomepage) {
            dispose();
            new Homepage();
        }
    }

}