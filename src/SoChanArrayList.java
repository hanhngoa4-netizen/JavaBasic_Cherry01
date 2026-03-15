import java.util.ArrayList;

public class SoChanArrayList {

    public static void main(String[] args) {

        // Tạo ArrayList lưu số chẵn
        ArrayList<Integer> soChanList = new ArrayList<>();

        // Dùng vòng lặp for từ 0 -> 50
        for (int i = 0; i <= 50; i++) {

            // kiểm tra số chẵn
            if (i % 2 == 0) {
                soChanList.add(i);
            }

        }

        // In các số trong ArrayList
        System.out.println("Danh sach so chan:");

        for (int i = 0; i < soChanList.size(); i++) {
            System.out.println(soChanList.get(i));
        }

    }
}