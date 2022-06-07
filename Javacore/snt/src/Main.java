public class Main {
    public static void main(String[] args) {
        int count = 0;
        int status = 1;
        int num=3;
        for ( int i = 2 ; i <=100 ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
                count++;
            }
            status = 1;
            num++;
            if (count == 20)
                break;
        }

    }
}