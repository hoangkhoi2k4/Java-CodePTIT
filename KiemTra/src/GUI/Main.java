/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JTextField tfCarType, tfRentalRate, tfQuantity;
    private JButton btnAdd, btnDelete, btnEdit, btnSave;
    private JTable carTable;
    private DefaultTableModel tableModel;
    private CarManager carManager;

    public Main() {
        carManager = new CarManager();
        initComponents();
        loadDataToTable();
    }

    private void initComponents() {
        setTitle("Quản Lý Cho Thuê Xe Ô Tô");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Bảng hiển thị xe
        tableModel = new DefaultTableModel(new String[]{"Mã Ô Tô", "Loại Xe", "Mức Thuê", "Số Lượng"}, 0);
        carTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(carTable);

        // Các trường nhập liệu
        tfCarType = new JTextField(10);
        tfRentalRate = new JTextField(10);
        tfQuantity = new JTextField(10);

        // Các nút chức năng
        btnAdd = new JButton("Nhập Mới");
        btnDelete = new JButton("Xóa");
        btnEdit = new JButton("Sửa");
        btnSave = new JButton("Lưu File");

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Loại Xe:"));
        inputPanel.add(tfCarType);
        inputPanel.add(new JLabel("Mức Thuê:"));
        inputPanel.add(tfRentalRate);
        inputPanel.add(new JLabel("Số Lượng:"));
        inputPanel.add(tfQuantity);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnDelete);
        buttonPanel.add(btnEdit);
        buttonPanel.add(btnSave);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Sự kiện cho các nút
        btnAdd.addActionListener(e -> addCar());
        btnDelete.addActionListener(e -> deleteCar());
        btnEdit.addActionListener(e -> editCar());
        btnSave.addActionListener(e -> carManager.saveToFile());
    }

    private void loadDataToTable() {
        tableModel.setRowCount(0);
        for (Car car : carManager.getCarList()) {
            tableModel.addRow(new Object[]{
                car.getCarID(), car.getCarType(), car.getRentalRate(), car.getQuantity()
            });
        }
    }

    private void addCar() {
        String carType = tfCarType.getText();
        double rentalRate = Double.parseDouble(tfRentalRate.getText());
        int quantity = Integer.parseInt(tfQuantity.getText());

        Car car = new Car(carType, rentalRate, quantity);
        carManager.addCar(car);
        loadDataToTable();
    }

    private void deleteCar() {
        int selectedRow = carTable.getSelectedRow();
        if (selectedRow != -1) {
            int carID = (int) tableModel.getValueAt(selectedRow, 0);
            carManager.removeCar(carID);
            loadDataToTable();
        }
    }

    private void editCar() {
        int selectedRow = carTable.getSelectedRow();
        if (selectedRow != -1) {
            int carID = (int) tableModel.getValueAt(selectedRow, 0);
            String carType = tfCarType.getText();
            double rentalRate = Double.parseDouble(tfRentalRate.getText());
            int quantity = Integer.parseInt(tfQuantity.getText());

            carManager.updateCar(carID, carType, rentalRate, quantity);
            loadDataToTable();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}

