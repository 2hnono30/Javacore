package Phân_loại_tamGiac;
    public class Triangle {
        private int a;
        private int b;
        private int c;

        public Triangle(int a, int b, int c) throws Exception {
            if (a <= 0 || b <= 0 || c <= 0)
                throw new Exception("dữ liệu không hợp lệ");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public int CheckTriangle() {
            boolean isTriangle=false;
            if(a<b+c&&b<a+c&&c<a+b)
                isTriangle=true;
            if(isTriangle){
                if(a==b&&b==c)
                    return 2;//tam giác đều
                else if(a!=b&&a!=c&&b!=c)
                    return 0;//tam giác thường
                else
                    return 1;//tam giác cân
            }
            return -1;//không phải tam giác
        }
    }
