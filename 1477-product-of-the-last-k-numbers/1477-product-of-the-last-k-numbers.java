 class ProductOfNumbers {
        ArrayList<Integer>s = new ArrayList<>();

        public ProductOfNumbers() {
            ArrayList<Integer >s = new ArrayList<>();
        }

        public void add(int num) {
            s.add(num);
        }

        public int getProduct(int k) {
            
 int m = s.size()-1;
            int product = 1;
            while(k!=0){
                int a = s.get(m);
                product*=a;
                k--;
                m--;
            }
            return product;
        }
    }