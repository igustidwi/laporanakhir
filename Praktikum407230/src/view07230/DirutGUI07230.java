
package view07230;

import Controller07230.PegawaiController07230;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class DirutGUI07230 {

    private static PegawaiController07230 pembeli = new PegawaiController07230();
    JFrame Dirut = new JFrame();
    JTable tabelpegawai = new JTable();
    JScrollPane scrolldirut = new JScrollPane(tabelpegawai);
    JButton Tambah, Edit, Remove, back;
    JLabel dirut, labelnip, labelnama, labelpassword, labelalamat;
    JTextField niptext, passwordtext;

    public DirutGUI07230() {
        Dirut.setSize(650, 500);
        Dirut.setLayout(null);
        Dirut.getContentPane().setBackground(Color.LIGHT_GRAY);
        Dirut.setLocationRelativeTo(null);
        Dirut.setVisible(true);
        Dirut.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dirut = new JLabel("DIRUT");
        dirut.setBounds(250, 30, 200, 30);
        dirut.setFont(new Font("Consolas", Font.BOLD, 40));
        Dirut.add(dirut);

        scrolldirut.setBounds(30, 100, 570, 200);

        tabelpegawai.setModel(pembeli.dataTabelpegawai());

        Dirut.add(scrolldirut);

        labelnip = new JLabel("Nip");
        labelnip.setBounds(50, 320, 100, 30);
        Dirut.add(labelnip);

        niptext = new JTextField();
        niptext.setBounds(50, 350, 100, 30);
        Dirut.add(niptext);

        labelpassword = new JLabel("password");
        labelpassword.setBounds(200, 320, 100, 30);
        Dirut.add(labelpassword);

        passwordtext = new JTextField();
        passwordtext.setBounds(200, 350, 100, 30);
        Dirut.add(passwordtext);

        Edit = new JButton("Edit");
        Edit.setBounds(200, 400, 100, 30);
        Edit.setBackground(Color.YELLOW);
        Dirut.add(Edit);

        Remove = new JButton("Remove");
        Remove.setBounds(350, 400, 100, 30);
        Remove.setBackground(Color.YELLOW);
        Dirut.add(Remove);
        
        back = new JButton("back");
        back.setBounds(500, 400, 100, 30);
        back.setBackground(Color.RED);
        Dirut.add(back);

        Tambah = new JButton("Tambah");
        Tambah.setBounds(50, 400, 100, 30);
        Tambah.setBackground(Color.yellow);
        Dirut.add(Tambah);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dirut.dispose();
                GUI07230 men = new GUI07230();
            }
        });
        Tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dirut.dispose();
                new AddGUI07230();
            }
        });
        Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dirut.dispose();
                String nip = niptext.getText();
                String pass = passwordtext.getText();
                int index = AllObjectctrl07230.pegawai.cekpegawai(nip, pass);
                AllObjectctrl07230.pegawai.remove(index);
                DirutGUI07230 men = new DirutGUI07230();
            }
        });

        Edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dirut.dispose();
                String nip = niptext.getText();
                String pass = passwordtext.getText();
                int index = AllObjectctrl07230.pegawai.cekpegawai(nip, pass);
                new editGUI07230(index);
            }
        });
        tabelpegawai.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelpegawai.getSelectedRow();
                niptext.setText(AllObjectctrl07230.pegawai.dataTabelpegawai().getValueAt(i, 0).toString());
                passwordtext.setText(AllObjectctrl07230.pegawai.dataTabelpegawai().getValueAt(i, 1).toString());
            }
        });

    }
}
