
package view07230;

import entity07230.PekerjaanEntity07230;
import entity07230.DaftarPegawaiEntity07230;
import entity07230.PegawaiEntity07230;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AddGUI07230 {
    JFrame tambah = new JFrame();
    JButton input,back;
    JLabel top,labelnip,labelpassword,labelnama,labelalamat,labelpekerjaan;
    JTextField textnip,textpassword,textnama,textalamat,textpekerjaan;
    JComboBox pilbar = new JComboBox(PekerjaanEntity07230.listPekerjaan);
    public AddGUI07230(){
        tambah.setSize(700,630);
        tambah.setLayout(null);
        tambah.getContentPane().setBackground(Color.CYAN);
        top = new JLabel("DATA PEGAWAI");
        top.setBounds(200,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        tambah.add(top);
        
        labelpekerjaan = new JLabel("Pilih Pekerjaan");
        labelpekerjaan.setBounds(490, 180, 100, 30);
        tambah.add(labelpekerjaan);
        
        pilbar.setBounds(490, 210, 100, 30);
        tambah.add(pilbar);
        
        labelnip = new JLabel("Nip");
        labelnip.setBounds(250,180, 100, 30);
        tambah.add(labelnip);
        
        textnip = new JTextField();
        textnip.setBounds(250, 210, 200, 30);
        tambah.add(textnip);
        
        labelpassword = new JLabel("Password");
        labelpassword.setBounds(250, 300, 100, 30);
        tambah.add(labelpassword);
        
        textpassword = new JPasswordField();
        textpassword.setBounds(250, 330, 200, 30);
        tambah.add(textpassword);
        
        input = new JButton("Input");
        input.setBounds(300, 450, 100, 40);
        input.setBackground(Color.YELLOW);
        tambah.add(input);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(250, 240, 100, 30);
        tambah.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(250, 270, 200, 30);
        tambah.add(textnama);
        
        labelalamat =new JLabel("Alamat");
        labelalamat.setBounds(250, 370, 100, 30);
        tambah.add(labelalamat);
        
        textalamat = new JTextField();
        textalamat.setBounds(250, 400, 200, 30);
        tambah.add(textalamat);
        
        back = new JButton("back");
        back.setBounds(300, 500, 100, 30);
        back.setBackground(Color.RED);
        tambah.add(back);
        
        tambah.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tambah.setVisible(true);
        tambah.setLocationRelativeTo(null);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tambah.dispose();
                DirutGUI07230 men = new DirutGUI07230();
            }
        });
        
        input.addActionListener(new ActionListener() {// ketika tombol input ditekan lakukan action
            @Override
            public void actionPerformed(ActionEvent a) {//aksi yang akan dijalankan
                try{
                    
                    String nip = textnip.getText();
                    String pass = textpassword.getText();
                    String nama = textnama.getText();
                    String alamat = textalamat.getText();
                    int indexbar = pilbar.getSelectedIndex();
                    
                    
                    AllObjectctrl07230.pegawai.daftarPegawai(indexbar, new PegawaiEntity07230(nip,pass,nama,alamat));
                    JOptionPane.showMessageDialog(null, "Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                    tambah.dispose();
                    DirutGUI07230 PenjualGUI = new DirutGUI07230();
                }catch(Exception exception){
                    
                    JOptionPane.showMessageDialog(null, "Data Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
        });
    }
}
