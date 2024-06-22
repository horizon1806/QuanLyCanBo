package Person;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String diaChi, String gioiTinh, int namSinh, String hoTen, String congViec) {
        super();
        this.congViec = congViec;
    }

    public NhanVien() {

    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap cong viec: ");
        congViec = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Cong viec: " + congViec);
    }
}