import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;

public class CycleCalculator {

    private JFrame frame;
    private JTextField output;
    private JDateChooser periodStartDateChooser;
    private JDateChooser targetDateChooser;
    public static JButton pPicture;
    public static ImageIcon period1;
    public static ImageIcon period2;
    public static ImageIcon period3;
    public static ImageIcon period4;
    public static ImageIcon period5;
    public static ImageIcon period6;
    public static ImageIcon period7;
    public static ImageIcon period8;
    public static ImageIcon period9;
    public static ImageIcon period10;
    public static ImageIcon period11;
    public static ImageIcon period12;
    public static ImageIcon period13;
    public static ImageIcon period14;
    public static ImageIcon period15;
    public static ImageIcon period16;
    public static ImageIcon period17;
    public static ImageIcon period18;
    public static ImageIcon period19;
    public static ImageIcon period20;
    public static ImageIcon period21;
    public static ImageIcon period22;
    public static ImageIcon period23;
    public static ImageIcon period24;
    public static ImageIcon period25;
    public static ImageIcon period26;
    public static ImageIcon period27;
    public static ImageIcon period28;

    public static void main(String[] args) {
    	
    	period1 = new ImageIcon("src/period1.png");
    	period2 = new ImageIcon("src/period2.png");
    	period3 = new ImageIcon("src/period3.png");
    	period4 = new ImageIcon("src/period4.png");
    	period5 = new ImageIcon("src/period5.png");
    	period6 = new ImageIcon("src/period6.png");
    	period7 = new ImageIcon("src/period7.png");
    	period8 = new ImageIcon("src/period8.png");
    	period9 = new ImageIcon("src/period9.png");
    	period10 = new ImageIcon("src/period10.png");
    	period11 = new ImageIcon("src/period11.png");
    	period12 = new ImageIcon("src/period12.png");
    	period13 = new ImageIcon("src/period13.png");
    	period14 = new ImageIcon("src/period14.png");
    	period15 = new ImageIcon("src/period15.png");
    	period16 = new ImageIcon("src/period16.png");
    	period17 = new ImageIcon("src/period17.png");
    	period18 = new ImageIcon("src/period18.png");
    	period19 = new ImageIcon("src/period19.png");
    	period20 = new ImageIcon("src/period20.png");
    	period21 = new ImageIcon("src/period21.png");
    	period22 = new ImageIcon("src/period22.png");
    	period23 = new ImageIcon("src/period23.png");
    	period24 = new ImageIcon("src/period24.png");
    	period25 = new ImageIcon("src/period25.png");
    	period26 = new ImageIcon("src/period26.png");
    	period27 = new ImageIcon("src/period27.png");
    	period28 = new ImageIcon("src/period28.png");
    	
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CycleCalculator window = new CycleCalculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CycleCalculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1334, 856);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Menstrual Cycle Calculator");
        lblNewLabel.setBounds(10, 11, 1283, 48);
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 40));
        frame.getContentPane().add(lblNewLabel);

        // Create a JDateChooser for the period start date
        periodStartDateChooser = new JDateChooser();
        periodStartDateChooser.setBounds(307, 211, 161, 37);
        frame.getContentPane().add(periodStartDateChooser);

        // Create a JDateChooser for the target date
        targetDateChooser = new JDateChooser();
        targetDateChooser.setBounds(307, 288, 161, 37);
        frame.getContentPane().add(targetDateChooser);

        output = new JTextField();
        output.setHorizontalAlignment(SwingConstants.CENTER);
        output.setFont(new Font("Lucida Bright", Font.PLAIN, 22));
        output.setBounds(214, 422, 325, 94);
        frame.getContentPane().add(output);
        output.setColumns(10);

        JButton btnNewButton = new JButton("Calculate");
        btnNewButton.setFont(new Font("Javanese Text", Font.PLAIN, 25));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateCycle(periodStartDateChooser.getDate(), targetDateChooser.getDate());
                
            }
        });
        btnNewButton.setBounds(28, 348, 148, 48);
        frame.getContentPane().add(btnNewButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Javanese Text", Font.PLAIN, 27));
        
        pPicture = new JButton("");
        pPicture.setBounds(581, 154, 681, 458);
        frame.getContentPane().add(pPicture);
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                periodStartDateChooser.setDate(null);
                targetDateChooser.setDate(null);
                output.setText(null);
                pPicture.setIcon(null);
                
            }
        });
        clearButton.setBounds(285, 541, 148, 48);
        frame.getContentPane().add(clearButton);
        
        JLabel lblNewLabel_1 = new JLabel("Menstrual Start Date");
        lblNewLabel_1.setFont(new Font("Javanese Text", Font.PLAIN, 28));
        lblNewLabel_1.setBounds(28, 211, 257, 37);
        frame.getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Blood Draw Date");
        lblNewLabel_1_1.setFont(new Font("Javanese Text", Font.PLAIN, 28));
        lblNewLabel_1_1.setBounds(28, 288, 224, 37);
        frame.getContentPane().add(lblNewLabel_1_1);
 
    }

    private void calculateCycle(java.util.Date periodStartDate, java.util.Date targetDate) {
        if (periodStartDate == null || targetDate == null) {
            output.setText("Please select valid dates.");
            return;
        }

        LocalDate periodStart = periodStartDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate target = targetDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        long daysAgo = ChronoUnit.DAYS.between(periodStart, target);
        

        if (daysAgo < 7) {
            output.setText("Period phase");
        } else if (daysAgo >= 7 && daysAgo < 14) {
            output.setText("Follicular phase");
        } else {
            output.setText("Luteal phase");
        }
        
        if(daysAgo==1) {
        	pPicture.setIcon(period1);
        	
        }
        
        if(daysAgo==2) {
        	pPicture.setIcon(period2);
        	
        }
        if(daysAgo==3) {
        	pPicture.setIcon(period3);
        	
        }
        if(daysAgo==4) {
        	pPicture.setIcon(period4);
        	
        }
        if(daysAgo==5) {
        	pPicture.setIcon(period5);
        	
        }
        if(daysAgo==6) {
        	pPicture.setIcon(period6);
        	
        }
        if(daysAgo==7) {
        	pPicture.setIcon(period7);
        	
        }
        if(daysAgo==8) {
        	pPicture.setIcon(period8);
        	
        }
        if(daysAgo==9) {
        	pPicture.setIcon(period9);
        	
        }
        
        if(daysAgo==10) {
        	pPicture.setIcon(period10);
        	
        }
        if(daysAgo==11) {
        	pPicture.setIcon(period11);
        	
        }
        if(daysAgo==12) {
        	pPicture.setIcon(period12);
        	
        }
        if(daysAgo==13) {
        	pPicture.setIcon(period13);
        	
        }
        
        if(daysAgo==13) {
        	pPicture.setIcon(period13);
       
        }
        if(daysAgo==14) {
        	pPicture.setIcon(period14);
        	
        }
        if(daysAgo==15) {
        	pPicture.setIcon(period15);
        	
        }
        if(daysAgo==16) {
        	pPicture.setIcon(period16);
        	
        }
        if(daysAgo==17) {
        	pPicture.setIcon(period17);
        	
        }
        if(daysAgo==18) {
        	pPicture.setIcon(period18);
        	
        }
        if(daysAgo==19) {
        	pPicture.setIcon(period19);
        	
        }
        
        if(daysAgo==20) {
        	pPicture.setIcon(period20);
        	
        }
        if(daysAgo==21) {
        	pPicture.setIcon(period21);
        	
        }
        if(daysAgo==22) {
        	pPicture.setIcon(period22);
        	
        }
        if(daysAgo==23) {
        	pPicture.setIcon(period23);
        	
        }
        if(daysAgo==24) {
        	pPicture.setIcon(period24);
        	
        }
        if(daysAgo==25) {
        	pPicture.setIcon(period25);
        	
        }
        if(daysAgo==26) {
        	pPicture.setIcon(period26);
        	
        }
        if(daysAgo==27) {
        	pPicture.setIcon(period27);
        	
        }
        if(daysAgo==28) {
        	pPicture.setIcon(period28);
        	
        }
    }
    
    
}
