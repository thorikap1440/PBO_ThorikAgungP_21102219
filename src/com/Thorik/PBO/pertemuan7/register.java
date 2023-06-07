package com.Thorik.PBO.pertemuan7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.Registry;

public class register extends JFrame{
    private JTextField txt_nim;
    private JComboBox cb_prodi;
    private JPanel jpanel;
    private JTextField txt_telp;
    private JRadioButton rb_laki;
    private JRadioButton rb_perempuan;
    private JTextArea ta_alamat;
    private JButton saveButton;
    private JButton clearButton;
    private JTextField txt_nama;
    private ButtonGroup JK;

    public register(){
        super("Form Register");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(jpanel);
        this.setSize(800, 600);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_nama.setText("");
                txt_nim.setText("");
                txt_telp.setText("");
                ta_alamat.setText("");
                cb_prodi.setSelectedIndex(0);
                JK.clearSelection();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txt_nama.getText();
                String nim = txt_nim.getText();
                String telp = txt_telp.getText();
                String alamat = ta_alamat.getText();
                String prodi = cb_prodi.getSelectedItem().toString();
                String JK;
                if (rb_laki.isSelected()) {
                    JK = "Laki-laki";
                } else if (rb_perempuan.isSelected()) {
                    JK = "Perempuan";
                } else {
                    JK = "Belum dipilih";
                }

                if (nama.isEmpty() || nim.isEmpty() || telp.isEmpty() || alamat.isEmpty() || prodi.isEmpty() || JK.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
                } else {
                    JOptionPane.showMessageDialog(null,"Data " + nama + "Berhasil disimpan");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new register();
        frame.setVisible(true);
    }

}
