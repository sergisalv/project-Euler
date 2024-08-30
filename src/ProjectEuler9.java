public class ProjectEuler9 {
    public static void main(String[] args) {
       System.out.println("El resultado del producto abc es: " + productSpecialPythagoreanTriplet());
    }

    //Iteramos los cada uno de los números
    public static Integer productSpecialPythagoreanTriplet(){
        int a,b,c;
        for ( a = 0; a <= 500; a++){
            for ( b = 0; b <= 500; b++){
                for ( c = 0; c <= 500; c++){
                //Comprobamos que se cumpla la suma = 1000, el teorema de Pitágoras y que el producto sea diferente de 0
                    if((a+b+c == 1000) && ((a*a)+(b*b) == c*c) && (a*b*c) != 0){
                        //Devolvemos el producto para que solo nos devuelva una vez el valor
                        return a*b*c;
                    }


                }
            }
        }
        return null;
    }
}
