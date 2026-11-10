
class PreguntaRecursion1 {
    /*static int g(int N){
        int c =0;

        for (int i=N; i>0; i=i/2){
            for (int j =0; j<N;j++){
                c++;
            }
        }
        return c;
    }

   /* static int sumaDigitos(int n){

        if (n<10) return n;
        return (n%10) + sumaDigitos(n);
    }*/


    static int sumas=0;
    static long multiplica(long a, int b){   //b>=0

        if(b>0){        //Esta linea es la que mas veces se ejecuta
            sumas= (int) (sumas+a);
            return multiplica(a,b-1);
            //Formula : N-1
            //Big O= O(N)
        }
        return sumas;
    }

    static int a[]={3,9,2,7};
    static int sum=0;

    static int suma (int[] a, int i){
        if(a.length>i){    //Este es el caso base
            sum=a[i]+sum;
            return  suma(a,i+1); //Aqui el problema se vuelve mas pequeño
        }
        return sum;
        // si el caso base fuera if(a.length==i) return a[i];
        //Solo regresaria el primer numero del array, que en este caso seria de 3
    }

    public static void main(String[] args) {
        //System.out.println(g(1024));
        // System.out.println(sumaDigitos(45));
        System.out.println("Multiplicacion");
        System.out.println(multiplica(6,6));
        System.out.println("");
        System.out.println("Suma");
        System.out.println(suma(a,0));
    }

}