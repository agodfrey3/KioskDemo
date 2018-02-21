import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class KioskDemo extends JFrame
{
    private static final long serialVersionUID = 1L;
    private double total = 0.0;
    private DecimalFormat df = new DecimalFormat("##.00");

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        KioskDemo frame = new KioskDemo();
        frame.setVisible(true);
    }

    /**
     * Create the frame.
     */
    private KioskDemo()
    {
        // Frame title
        setTitle("--- Food Truck Kiosk ---");

        NumberFormat formatter = new DecimalFormat("#0.00");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // size of the frame
        setSize(1200,800);

        // panel title
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new TitledBorder(new EtchedBorder(),
                "Display Area - Food Truck #1"));
        setContentPane(contentPane);


        // list of items that are being bought
        JTextArea textArea = new JTextArea();
        textArea.setBounds(763, 11, 168, 382);
        textArea.setEditable(false);

        contentPane.add(textArea);

        // field where total accumulating price is being displayed
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(807, 420, 124, 34);
        contentPane.add(textField);
        textField.setColumns(10);

        // Orange Button
        JButton btnNewButton = new JButton("Oranges");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Oranges         .59\r\n");
                total = total + .59;

                textField.setText(formatter.format(total));
                textField.repaint();
            }
        });
        btnNewButton.setIcon(new ImageIcon("Kiosk-Oranges.jpg"));
        btnNewButton.setBounds(10, 41, 231, 243);
        contentPane.add(btnNewButton);

        // Apple Button
        JButton btnNewButton_1 = new JButton("Apples");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Apples          .49\r\n");
                total = total + .49;

                textField.setText(formatter.format(total));
                textArea.repaint();
            }
        });
        btnNewButton_1.setIcon(new ImageIcon("Kiosk-Apples.jpg"));
        btnNewButton_1.setBounds(10, 329, 231, 243);
        contentPane.add(btnNewButton_1);

        // Pear Button
        JButton btnNewButton_2 = new JButton("Pears");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                textArea.append("Pears           .39\r\n");
                total = total + .39;

                textField.setText(formatter.format(total));
                textArea.repaint();
            }
        });
        btnNewButton_2.setIcon(new ImageIcon("Kiosk-Pears.jpg"));
        btnNewButton_2.setBounds(272, 41, 187, 243);
        contentPane.add(btnNewButton_2);

        // Grape Button
        JButton btnNewButton_4 = new JButton("Grapes");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Grapes           .89\r\n");
                total = total + .89;

                textField.setText(formatter.format(total));
                textArea.repaint();
            }
        });
        btnNewButton_4.setIcon(new ImageIcon("Kiosk-Grapes.jpg"));
        btnNewButton_4.setBounds(272, 329, 187, 243);
        contentPane.add(btnNewButton_4);

        // Grape Button
        JButton btnNewButton_5 = new JButton("Banana");
        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Banana           .99\r\n");
                total = total + .99;

                textField.setText(formatter.format(total));
                textArea.repaint();
            }
        });
        btnNewButton_5.setIcon(new ImageIcon("Kiosk-Banana.jpg"));
        btnNewButton_5.setBounds(490, 41, 187, 243);
        contentPane.add(btnNewButton_5);

        // Grape Button
        JButton btnNewButton_6 = new JButton("Blueberries");
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append("Blueberries     1.89\r\n");
                total = total + 1.89;

                textField.setText(formatter.format(total));
                textArea.repaint();
            }
        });
        btnNewButton_6.setIcon(new ImageIcon("Kiosk-Blueberries.jpg"));
        btnNewButton_6.setBounds(490, 329, 187, 243);
        contentPane.add(btnNewButton_6);


        JLabel lblNewLabel = new JLabel("    Total Price   $");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(697, 424, 100, 23);
        contentPane.add(lblNewLabel);

        // EXIT Button
        JButton btnNewButton_3 = new JButton("EXIT");
        btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_3.setBounds(449, 700, 133, 34);
        contentPane.add(btnNewButton_3);


        // labels for each product button
        JLabel lblNewLabel_1 = new JLabel("Click for Oranges : .59 each");
        lblNewLabel_1.setBounds(39, 295, 194, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Click for Pears : .39 each");
        lblNewLabel_2.setBounds(282, 295, 177, 14);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Click for Apples : .49 each");
        lblNewLabel_3.setBounds(39, 583, 202, 14);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Click for Grapes : .89 each");
        lblNewLabel_4.setBounds(272, 583, 187, 14);
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("Click for Bananas : .99 each");
        lblNewLabel_5.setBounds(490, 295, 187, 14);
        contentPane.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Click for Blueberries : 1.89 each");
        lblNewLabel_6.setBounds(490, 583, 187, 14);
        contentPane.add(lblNewLabel_6);

        JLabel cashTenderedLabel = new JLabel("Cash Tendered");
        cashTenderedLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cashTenderedLabel.setBounds(697, 475, 150, 14);
        contentPane.add(cashTenderedLabel);

        JTextArea cashTenderedTextField = new JTextArea();
        cashTenderedTextField.setBounds(808, 475, 120, 20);
        cashTenderedTextField.setEditable(true);
        contentPane.add(cashTenderedTextField);

        JLabel transactionCompleteLabel = new JLabel();
        transactionCompleteLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        transactionCompleteLabel.setBounds(714, 575, 500, 30);
        contentPane.add(transactionCompleteLabel);

        JButton transactionButton = new JButton("Transaction Complete");
        transactionButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        transactionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double cashTendered = Double.parseDouble(cashTenderedTextField.getText());
                double changeDue = cashTendered - total;
                if (changeDue >= 0) {
                    transactionCompleteLabel.setText(String.format("Transaction Complete! Your change is: $" +
                                                                   df.format(changeDue)));
                } else {
                    double absChange = Math.abs(changeDue);
                    transactionCompleteLabel.setText(String.format("Transaction Stopped. You still owe: $" +
                                                                   df.format(absChange)));
                }

                try {
                    String receipt = "Cash value sold: " + df.format(total);
                    InetAddress ip = InetAddress.getByName("127.0.0.1");
                    Client client = new Client(ip, 3333, receipt);
                    client.run();
                } catch (Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        transactionButton.setBounds(714, 510, 200, 34);
        contentPane.add(transactionButton);

        // user will do the layout
        contentPane.setLayout(null);

        // position frame in the middle of the screen
        this.setLocationRelativeTo(null);
    }
}