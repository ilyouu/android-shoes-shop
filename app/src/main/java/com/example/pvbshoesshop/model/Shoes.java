package com.example.pvbshoesshop.model;

public class Shoes {

    private int id_giay;
    private String ten_giay;
    private String ten_loai_giay;
    private String ten_thuong_hieu;
    private String mo_ta;
    private String don_gia;
    private String so_luong;
    private String hinh_anh_1;
    private String hinh_anh_2;
    private String hinh_anh_3;
    private String hinh_anh_4;
    private String ten_khuyen_mai;
    private String so_luong_mua;
    private String so_luot_xem;
    private String created_at;
    private String updated_at;

    public Shoes(int id_giay, String ten_giay, String ten_loai_giay, String ten_thuong_hieu, String mo_ta, String don_gia, String so_luong, String hinh_anh_1, String hinh_anh_2, String hinh_anh_3, String hinh_anh_4, String ten_khuyen_mai, String so_luong_mua, String so_luot_xem, String created_at, String updated_at) {
        this.id_giay = id_giay;
        this.ten_giay = ten_giay;
        this.ten_loai_giay = ten_loai_giay;
        this.ten_thuong_hieu = ten_thuong_hieu;
        this.mo_ta = mo_ta;
        this.don_gia = don_gia;
        this.so_luong = so_luong;
        this.hinh_anh_1 = hinh_anh_1;
        this.hinh_anh_2 = hinh_anh_2;
        this.hinh_anh_3 = hinh_anh_3;
        this.hinh_anh_4 = hinh_anh_4;
        this.ten_khuyen_mai = ten_khuyen_mai;
        this.so_luong_mua = so_luong_mua;
        this.so_luot_xem = so_luot_xem;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId_giay() {
        return id_giay;
    }

    public void setId_giay(int id_giay) {
        this.id_giay = id_giay;
    }

    public String getTen_giay() {
        return ten_giay;
    }

    public void setTen_giay(String ten_giay) {
        this.ten_giay = ten_giay;
    }

    public String getTen_loai_giay() {
        return ten_loai_giay;
    }

    public void setTen_loai_giay(String ten_loai_giay) {
        this.ten_loai_giay = ten_loai_giay;
    }

    public String getTen_thuong_hieu() {
        return ten_thuong_hieu;
    }

    public void setTen_thuong_hieu(String ten_thuong_hieu) {
        this.ten_thuong_hieu = ten_thuong_hieu;
    }

    public String getMo_ta() {
        return mo_ta;
    }

    public void setMo_ta(String mo_ta) {
        this.mo_ta = mo_ta;
    }

    public String getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(String don_gia) {
        this.don_gia = don_gia;
    }

    public String getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(String so_luong) {
        this.so_luong = so_luong;
    }

    public String getHinh_anh_1() {
        return hinh_anh_1;
    }

    public void setHinh_anh_1(String hinh_anh_1) {
        this.hinh_anh_1 = hinh_anh_1;
    }

    public String getHinh_anh_2() {
        return hinh_anh_2;
    }

    public void setHinh_anh_2(String hinh_anh_2) {
        this.hinh_anh_2 = hinh_anh_2;
    }

    public String getHinh_anh_3() {
        return hinh_anh_3;
    }

    public void setHinh_anh_3(String hinh_anh_3) {
        this.hinh_anh_3 = hinh_anh_3;
    }

    public String getHinh_anh_4() {
        return hinh_anh_4;
    }

    public void setHinh_anh_4(String hinh_anh_4) {
        this.hinh_anh_4 = hinh_anh_4;
    }

    public String getTen_khuyen_mai() {
        return ten_khuyen_mai;
    }

    public void setTen_khuyen_mai(String ten_khuyen_mai) {
        this.ten_khuyen_mai = ten_khuyen_mai;
    }

    public String getSo_luong_mua() {
        return so_luong_mua;
    }

    public void setSo_luong_mua(String so_luong_mua) {
        this.so_luong_mua = so_luong_mua;
    }

    public String getSo_luot_xem() {
        return so_luot_xem;
    }

    public void setSo_luot_xem(String so_luot_xem) {
        this.so_luot_xem = so_luot_xem;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}

/**
 *     "id_giay": 8,
 *     "ten_giay": "Adidas Tiempo Legend 9",
 *     "ten_loai_giay": "Th??? thao",
 *     "ten_thuong_hieu": "Adidas",
 *     "mo_ta": "<p>?????? ????? gi??y ???????c thi???t k??? ch???u ma s??t t???t, t??ng chi???u cao, nh???, ??m, c??n b???ng v?? tho??ng kh??.&nbsp;</p><p>?????? Ki???u d??ng hottrend c???a n??m nay.&nbsp;</p><p>?????? Gi??y ?????p, nh???, b???n. C?? th??? l??m gi??y c???p, gi??y nh??m. Th??ch h???p ??i ch??i, ch???y b???, gym, ??i h???c, ??i l??m...&nbsp;</p><p>?????? ????? cao su b???n ch???c, c?? ????? b??m cao.</p><p>?????? M???u m???i nh???t hi???n nay mang ??m ch??n th???i trang c?? t??nh.&nbsp;</p><p>?????? D??? d??ng k???t h???p v???i h???u h???t c??c phong c??ch th???i trang nh??: ??i h???c, ??i ch??i, ??i du l???ch. Gi??y ????i, gi??y nh??m...</p><p>?????? C?? th??? k???t h???p v???i v??y, jeans, sooc???. ?????u ph?? h???p!!&nbsp;</p>",
 *     "don_gia": "666000",
 *     "so_luong": "100",
 *     "hinh_anh_1": "giay2.jpg",
 *     "hinh_anh_2": "giay2.jpg",
 *     "hinh_anh_3": "giay2.jpg",
 *     "hinh_anh_4": "giay2.jpg",
 *     "ten_khuyen_mai": "Ng??y l???",
 *     "so_luong_mua": "0",
 *     "created_at": "2021-11-29T14:59:26.000000Z",
 *     "updated_at": "2021-11-29T14:59:26.000000Z"
 */