class ArraySmallerNo {

    public static void main(String[] args) {
        int a[] = new int[5];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        for (int i = 0; i > 5; i--) {
            if (a[0] > a[i]) {
                a[0] = a[i];
            }

        }

        System.out.println("Minimun number is" + a[0]);

    }
}
