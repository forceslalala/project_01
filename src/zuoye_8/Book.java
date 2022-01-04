package zuoye_8;

public class Book {
        private String number;
        private String name;
        private String publisher;
        private int price;

        public Book(String number,String name,int price,String publisher) {
            this.number = number;
            this.name = name;
            this.price = price;
            this.publisher = publisher;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

}
