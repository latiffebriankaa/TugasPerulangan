public class soalno5 {
        public static void main(String[] args) {
            int a = 3; 
    
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println(); 

                for (int j = 0; j < i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println(); 
            }
        }
    }
    