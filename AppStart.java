
/**
 * Escreva a descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class AppStart
{

    private static Size size;

    public static void main(){
        for(Size s : size.values()){
            System.out.println("name :" + s);
            System.out.println("toString() :" + s.toString());
            System.out.println("Ordem :" + s.ordinal());
            System.out.println("Valor Minimo :" + s.getMinValue());
            System.out.println("Valor Maximo :" + s.getMaxValue());
            System.out.println("Código :" + s.getCode());

        }
    }
}
