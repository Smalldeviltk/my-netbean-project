/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Calendar;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Small
 */
public class Bai4 {

    public static Label lbTen;
    public static Label lbNgaySinh;
    public static Label lbGioiTinh;
    public static Label lbDiaChi;
    public static Label lbMSSV;
    public static Label lbLop;
    public static Button btnNhap;
    public static TextArea txtThongTin;
    public static TextField txtTen;
    public static TextField txtNgaySinh;
    public static TextField txtDiaChi;
    public static TextField txtMSSV;
    public static CheckboxGroup gGioiTinh;
    public static Checkbox gNam;
    public static Checkbox gNu;
    public static Choice cLop;

    public static void init() {

        lbTen = new Label("Ho ten");
        lbNgaySinh = new Label("Ngay thang nam sinh");
        lbGioiTinh = new Label("Gioi tinh");
        lbDiaChi = new Label("Dia chi");
        lbMSSV = new Label("MSSV");
        lbLop = new Label("Lop");
        btnNhap = new Button("Nhap thong tin");
        txtThongTin = new TextArea();
        txtTen = new TextField();
        txtNgaySinh = new TextField();
        txtDiaChi = new TextField();
        txtMSSV = new TextField();
        gGioiTinh = new CheckboxGroup();
        gNam = new Checkbox("Nam", gGioiTinh, true);
        gNu = new Checkbox("Nu", gGioiTinh, false);
        cLop = new Choice();
        lbTen.setBounds(30, 50, 50, 20);
        lbNgaySinh.setBounds(30, 70, 120, 20);
        lbGioiTinh.setBounds(30, 90, 50, 20);
        lbDiaChi.setBounds(30, 110, 50, 20);
        lbMSSV.setBounds(30, 130, 50, 20);
        lbLop.setBounds(30, 150, 50, 20);
        btnNhap.setBounds(110, 180, 100, 30);
        txtThongTin.setBounds(30, 220, 280, 150);
        txtThongTin.setEditable(false);
        txtTen.setBounds(160, 50, 150, 20);
        txtNgaySinh.setBounds(160, 70, 150, 20);
        txtDiaChi.setBounds(160, 110, 150, 20);
        txtMSSV.setBounds(160, 130, 150, 20);
        gNam.setBounds(160, 90, 50, 20);
        gNu.setBounds(210, 90, 50, 20);
        cLop.setBounds(160, 150, 50, 20);
        cLop.add("TH1");
        cLop.add("TH2");
        cLop.add("TH3");

        JFrame jframe = new JFrame("Tuan 4 - Bai 4");
        jframe.setLayout(null);
        jframe.setBounds(500, 100, 360, 450);
        jframe.setVisible(true);

        jframe.add(lbTen);
        jframe.add(lbNgaySinh);
        jframe.add(lbGioiTinh);
        jframe.add(lbDiaChi);
        jframe.add(lbMSSV);
        jframe.add(lbLop);
        jframe.add(btnNhap);
        jframe.add(txtThongTin);
        jframe.add(txtNgaySinh);
        jframe.add(txtDiaChi);
        jframe.add(txtMSSV);
        jframe.add(gNam);
        jframe.add(gNu);
        jframe.add(cLop);
        jframe.add(txtTen);

        btnNhap.addActionListener(new processButton());

        jframe.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] arg) {
        init();
    }

    public static class processButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            String temp = "Thong tin sinh vien vua nhap: ";
            temp += "\nHo ten: " + txtTen.getText().toString();
            temp += "\nNgay sinh: " + txtNgaySinh.getText().toString();
            if (gNam.getState() == true) {
                temp += "\nGioi tinh: Nam";
            } else{
                temp += "\nGioi tinh: Nu";
            }
            temp += "\nDia chi: " + txtDiaChi.getText().toString();
            temp += "\nMSSV: " + txtMSSV.getText().toString();
            temp += "\nLop: " + cLop.getSelectedItem();
            txtThongTin.setText(temp);
        }

    }
}
