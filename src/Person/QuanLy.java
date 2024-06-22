package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy {
    private List<CanBo> dscb;

    public QuanLy() {
        dscb = new ArrayList<CanBo>();
    }

    public void themCanBo(CanBo canBo) {
        dscb.add(canBo);
    }

    public void nhapDanhSach(Scanner sc) {
        CanBo canBo;
        System.out.println("Nhap so luong can bo:");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap can bo thu " + (i + 1));
            System.out.println("Chon loai can bo: 1 - Ky su, 2 - Nhan vien");
            int choose = sc.nextInt(); sc.nextLine();
            canBo = new CanBo();
            switch (choose) {
                case 1:
                    canBo = new KySu();
                    break;
                case 2:
                    canBo = new NhanVien();
                    break;
                default:
                    System.out.println("Nhap sai!");
            }
            canBo.nhapThongTin();
            canBo.hienThiThongTin();
            themCanBo(canBo);
            System.out.println("----------------");
        }

    }
    public void timKiem(String hoTen) {
        for(CanBo canBo : dscb) {
            if (hoTen.equals(canBo.getHoTen())) {
                canBo.hienThiThongTin();
            }
        }
    }

}