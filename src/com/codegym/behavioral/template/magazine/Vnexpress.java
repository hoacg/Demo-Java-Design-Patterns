package com.codegym.behavioral.template.magazine;

public class Vnexpress extends Template {
    @Override
    void header() {
        System.out.println("VnExpress phiên bản mới: Nhanh, thuận tiện và dễ đọc hơn. >>> Trải nghiệm →\n");
    }

    @Override
    void menu() {
        System.out.println("Video | Thời sự | Góc nhìn | Thế giới | Kinh doanh | Giải trí | Thể thao");
    }

    @Override
    void body() {
        System.out.println("Đà Nẵng lập 7 chốt kiểm soát người vào thành phố\n" +
                "Phát triển vaccine liều thấp ngừa nCoV\n10 mẫu xe thể thao còn lắp số sàn\nApple hạn chế đăng ứng dụng về Covid-19\nQuy Nhơn - điểm đến mới của nhà đầu tư second home\nCách phòng dịch của trường tiểu học Đài LoanKính mát đi biển cho nữHLV TP HCM phản đối chỉ trích trọng tàiCà ri - đặc sản hơn 4.500 tuổiAngelina Jolie đi mua thực phẩmSamsung ra 9 TV 4K mới ở Việt Nam\n");
    }

    @Override
    void footer() {
        System.out.println("© Copyright 1997 VnExpress. All rights reserved.\n" +
                "\n");
    }
}
