package Person;

import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private int namSinh;
    private String gioiTinh;
    private String diaChi;

    Scanner sc = new Scanner(System.in);

    public CanBo(String diaChi, String gioiTinh, int namSinh, String hoTen) {
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.hoTen = hoTen;
    }

    public CanBo() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public void nhapThongTin() {
        System.out.println("Nhập tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        namSinh = sc.nextInt(); sc.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
    }
}