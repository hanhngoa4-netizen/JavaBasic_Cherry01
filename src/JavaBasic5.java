import java.util.ArrayList;

public class JavaBasic5 {

    // Tạo ArrayList lưu thông tin nhân viên
    static ArrayList<String> nhanVienList = new ArrayList<>();

    // Hàm thêm nhân viên
    public static void themNhanVien(int ID,String ten, int tuoi, String phongBan) {

        String thongTin = "ID:" + ID + ", Ten: " + ten + ", Tuoi: " + tuoi + ", Phong ban: " + phongBan;

        nhanVienList.add(thongTin);

    }

    public static void main(String[] args) {

        // Gọi hàm thêm nhân viên
        themNhanVien(1000,"Ngo Thi Hanh", 26, "IT");
        themNhanVien(1001,"Join Rose", 30, "HR");
        System.out.println("Danh sach nhan vien:");

        // Duyệt ArrayList bằng for cơ bản
        for (int i = 0; i < nhanVienList.size(); i++) {

            System.out.println(nhanVienList.get(i));

        }

    }
}