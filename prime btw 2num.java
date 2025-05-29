class Main {
    public static void main(String[] args) {
        for(int n=10;n<=99;n++){
            boolean isprime=true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    isprime=false;
            }
            if (isprime)
                System.out.println(n);
        }
    }
}
