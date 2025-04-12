package com.example.algoritmfyd;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Method_and_Recursion extends Application {
    // Method biasa: penjumlahan
    private int tambah(int a, int b) {
        return a + b;
    }

    // Method rekursif: faktorial
    private int faktorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    @Override
    public void start(Stage primaryStage) {
        // Penjumlahan
        Label label1 = new Label("Angka 1:");
        TextField input1 = new TextField();
        Label label2 = new Label("Angka 2:");
        TextField input2 = new TextField();
        Button btnHitung = new Button("Hitung Penjumlahan");
        Label hasil = new Label("Hasil: ");

        btnHitung.setOnAction(e -> {
            int angka1 = Integer.parseInt(input1.getText());
            int angka2 = Integer.parseInt(input2.getText());
            int hasilTambah = tambah(angka1, angka2);
            hasil.setText("Hasil: " + hasilTambah);
        });

        // Faktorial
        Label labelFaktorial = new Label("Angka untuk Faktorial:");
        TextField inputFaktorial = new TextField();
        Button btnFaktorial = new Button("Hitung Faktorial");
        Label hasilFaktorial = new Label("Hasil Faktorial: ");

        btnFaktorial.setOnAction(e -> {
            int angka = Integer.parseInt(inputFaktorial.getText());
            int hasilHitung = faktorial(angka);
            hasilFaktorial.setText("Hasil Faktorial: " + hasilHitung);
        });

        VBox layout = new VBox(10,
                label1, input1, label2, input2, btnHitung, hasil,
                labelFaktorial, inputFaktorial, btnFaktorial, hasilFaktorial);

        Scene scene = new Scene(layout, 350, 350);
        primaryStage.setTitle("Penjumlahan & Faktorial");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

