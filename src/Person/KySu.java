package Person;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String diaChi, String gioiTinh, int namSinh, String hoTen, String nganhDaoTao) {
        super(diaChi, gioiTinh, namSinh, hoTen);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu() {

    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        System.out.println("Nhap nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: " + nganhDaoTao);
    }
}