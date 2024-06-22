package Test;

import Person.QuanLy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy quanLy = new QuanLy();
        quanLy.nhapDanhSach(sc);
        System.out.println("Tim kiem theo ten:");
        String hoTen = sc.nextLine();
        quanLy.timKiem(hoTen);
    }
}