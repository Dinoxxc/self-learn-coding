package Java;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private JTextField txtMieAyam, txtBakso, txtSiomay, txtBatagor;
    private JButton btnOrder, btnReset;

    public FoodOrderGUI() {
        setTitle("Pemesanan Makanan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel Utama
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Tabel Pesanan
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Makanan");
        tableModel.addColumn("Harga");
        tableModel.addColumn("Jumlah");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Panel Input
        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        // Label dan Textfield Mie Ayam
        JLabel lblMieAyam = new JLabel("Mie Ayam");
        txtMieAyam = new JTextField();
        inputPanel.add(lblMieAyam);
        inputPanel.add(txtMieAyam);

        // Label dan Textfield Bakso
        JLabel lblBakso = new JLabel("Bakso");
        txtBakso = new JTextField();
        inputPanel.add(lblBakso);
        inputPanel.add(txtBakso);

        // Label dan Textfield Siomay
        JLabel lblSiomay = new JLabel("Siomay");
        txtSiomay = new JTextField();
        inputPanel.add(lblSiomay);
        inputPanel.add(txtSiomay);

        // Label dan Textfield Batagor
        JLabel lblBatagor = new JLabel("Batagor");
        txtBatagor = new JTextField();
        inputPanel.add(lblBatagor);
        inputPanel.add(txtBatagor);

        mainPanel.add(inputPanel, BorderLayout.NORTH);

        // Button Order
        btnOrder = new JButton("Order");
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mieAyamQty = Integer.parseInt(txtMieAyam.getText());
                int baksoQty = Integer.parseInt(txtBakso.getText());
                int siomayQty = Integer.parseInt(txtSiomay.getText());
                int batagorQty = Integer.parseInt(txtBatagor.getText());

                // Menghapus baris yang ada sebelumnya
                tableModel.setRowCount(0);

                // Menambahkan data ke dalam tabel
                tableModel.addRow(new Object[]{"Mie Ayam", 15000, mieAyamQty});
                tableModel.addRow(new Object[]{"Bakso", 20000, baksoQty});
                tableModel.addRow(new Object[]{"Siomay", 10000, siomayQty});
                tableModel.addRow(new Object[]{"Batagor", 5000, batagorQty});

                int totalHarga = (mieAyamQty * 15000) + (baksoQty * 20000) + (siomayQty * 10000) + (batagorQty * 5000);
                tableModel.addRow(new Object[]{"Total", "", totalHarga});
            }
        });
        mainPanel.add(btnOrder, BorderLayout.SOUTH);

        // Button Reset
        btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMieAyam.setText("");
                txtBakso.setText("");
                txtSiomay.setText("");
                txtBatagor.getText();
                tableModel.setRowCount(0);
            }
        });
        mainPanel.add(btnReset, BorderLayout.EAST);

        add(mainPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new FoodOrderGUI();
    }
}
