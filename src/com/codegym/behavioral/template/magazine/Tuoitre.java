package com.codegym.behavioral.template.magazine;

public class Tuoitre extends Template {
    @Override
    void header() {
        System.out.println("Đăng nhập | Đăng ký\n" +
                "Quảng cáo\n" +
                "Đặt báo\n" +
                "Hotline: 0918.033.133");
    }

    @Override
    void menu() {
        System.out.println("MEDIA | " +
                "THỜI SỰ | " +
                "THẾ GIỚI | " +
                "PHÁP LUẬT | " +
                "KINH DOANH | " +
                "CÔNG NGHỆ | " +
                "XE | " +
                "DU LỊCH | " +
                "NHỊP SỐNG TRẺ");
    }

    @Override
    void body() {
        System.out.println("Từ 16-3 đeo khẩu trang nơi công cộng: đeo khẩu trang nào, ra sao?\n" +
                "'Bom nổ chậm' của ông Trump\n" +
                "Lập nhóm kêu gọi chia sẻ gánh nặng mặt bằng\n" +
                "Xà phòng tiêu diệt virus gây bệnh COVID-19 bằng cách nào?\n" +
                "13 công dân Anh mắc COVID-19, Đại sứ quán Anh ở Việt Nam nói gì?\n" +
                "Hát lên để thoát khỏi âu lo, sợ hãi và mỏi mòn\n" +
                "Hai ca nhiễm 55 và 56: Du khách Đức và Anh mắc COVID-19, đang điều trị ở Hà Nội\n" +
                "20\n" +
                "Bất chấp COVID-19, gần 3.000 binh sĩ Campuchia tập trận lớn với Trung Quốc\n" +
                "COVID-19 đang lây lan nhưng khoa học khuyên đừng hoảng loạn, vì sao?\n" +
                "1\n" +
                "Dịch COVID-19 ngày 15-3: Anh lên 1.372 ca nhiễm, đã có 35 người chết\n" +
                "1\n");
    }

    @Override
    void footer() {
        System.out.println("® Tuổi Trẻ Online giữ bản quyền nội dung trên website này");
    }
}
