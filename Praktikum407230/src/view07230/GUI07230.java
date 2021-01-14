
package view07230;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
public class GUI07230 {
    JFrame LogReg = new JFrame();
    JLabel login,daftar,top;
    JTextField textniplogin,textnipdaftar,textnama;
    JLabel labelniplogin,labelnipdaftar,labelnama,labelpasswordlogin,labelpassworddaftar;
    JButton cek,registrasi;
    JPasswordField passworddaftar,passwordlogin;
    private boolean ceklogin = false;
    
    public GUI07230(){
        LogReg.setSize(700,630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.LIGHT_GRAY);
        top = new JLabel("PENGADILAN AGAMA SURABAYA");
        top.setBounds(150,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        LogReg.add(top);
        
        login = new JLabel("Login Dirut");
        login.setBounds(50, 50, 210, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        LogReg.add(login);
        
        labelniplogin = new JLabel("Nip");
        labelniplogin.setBounds(40,150, 100, 30);
        LogReg.add(labelniplogin);
        
        textniplogin = new JTextField();
        textniplogin.setBounds(30, 180, 200, 30);
        LogReg.add(textniplogin);
        
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30, 210, 100, 30);
        LogReg.add(labelpasswordlogin);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 240, 200, 30);
        LogReg.add(passwordlogin);
        
        cek = new JButton("Cek");
        cek.setBounds(90, 320, 100, 40);
        cek.setBackground(Color.YELLOW);
        LogReg.add(cek);
        
        daftar = new JLabel("Daftar Dirut");
        daftar.setFont(new Font("Consolas",Font.BOLD,30));
        daftar.setBounds(400, 50, 210, 100);
        LogReg.add(daftar);
        
        labelnipdaftar = new JLabel("Nip");
        labelnipdaftar.setBounds(400,150, 100, 30);
        LogReg.add(labelnipdaftar);
        
        textnipdaftar = new JTextField();
        textnipdaftar.setBounds(400, 180, 200, 30);
        LogReg.add(textnipdaftar);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(400, 210, 100, 30);
        LogReg.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(400, 240, 200, 30);
        LogReg.add(textnama);
        
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(400, 270, 100, 30);
        LogReg.add(labelpassworddaftar);
        
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 300, 200, 30);
        LogReg.add(passworddaftar);
        
        
        registrasi = new JButton("Daftar");
        registrasi.setBounds(450, 400, 100, 30);
        registrasi.setBackground(Color.yellow);
        LogReg.add(registrasi);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        cek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    try{
                        AllObjectctrl07230.dirut.login(textniplogin.getText(), passwordlogin.getText());
                        String nama = AllObjectctrl07230.dirut.DirutEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat Datang "+nama,"information",JOptionPane.INFORMATION_MESSAGE);
                        LogReg.dispose();
                        DirutGUI07230 pemilik = new DirutGUI07230();
                        
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "Nip Atau Password Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                        
                }
            }
        });
        registrasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String nip = textnipdaftar.getText();
                    String pass = passworddaftar.getText();
                    String nama = textnama.getText();
                    
                    
                    AllObjectctrl07230.dirut.insert(nip, pass, nama);
                    JOptionPane.showMessageDialog(null, "Daftar Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format Salah","Information",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    void kosong(){
    textnipdaftar.setText(null);
    passworddaftar.setText(null);
    textnama.setText(null);
    textniplogin.setText(null);
    passwordlogin.setText(null);
    }
}
