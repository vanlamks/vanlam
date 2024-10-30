package model;
    public class Product {
        private String mahang;
        private String tenhang;
        private int dongia;
        private String xuatxu;
        private String maloaihang;

        // Constructor
        public Product() {}

        public Product(String mahang, String tenhang, int dongia, String xuatxu, String maloaihang) {
            this.mahang = mahang;
            this.tenhang = tenhang;
            this.dongia = dongia;
            this.xuatxu = xuatxu;
            this.maloaihang = maloaihang;
        }

        // Getters and Setters
        public String getMahang() {
            return mahang;
        }

        public void setMahang(String mahang) {
            this.mahang = mahang;
        }

        public String getTenhang() {
            return tenhang;
        }

        public void setTenhang(String tenhang) {
            this.tenhang = tenhang;
        }

        public int getDongia() {
            return dongia;
        }

        public void setDongia(int dongia) {
            this.dongia = dongia;
        }

        public String getXuatxu() {
            return xuatxu;
        }

        public void setXuatxu(String xuatxu) {
            this.xuatxu = xuatxu;
        }

        public String getMaloaihang() {
            return maloaihang;
        }

        public void setMaloaihang(String maloaihang) {
            this.maloaihang = maloaihang;
        }
    }

