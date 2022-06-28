import java.util.Scanner;
public class manin
{   
    public static void main (String args[])
    {
        pokemons[] pkm = new pokemons[2];
        movimientos[] movPKM1 = new movimientos[2];
        movimientos[] movPKM2 = new movimientos[2];
        // POKEMON 1 : CHARMANDER
        pkm[0] = new pokemons("Charmander", "Fuego", 40, 23, 15, 32, 13, 25); // "Ascuas", "Arañazo"
        movPKM1[0] = new movimientos("Arañazo", "Normal", 20);
        movPKM1[1] = new movimientos("Ascuas", "Fuego", 25);
        // POKEMON 2 : PIKACHU
        pkm[1] = new pokemons("Pikachu", "Electrico", 38, 27, 18, 27, 12, 30); // "Impactrueno", "Placaje"
        movPKM2[0] = new movimientos("Placaje", "Normal", 15);
        movPKM2[1] = new movimientos("Impactrueno", "Electrico", 30);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Escoje un pokemon");
        System.out.println("1 - Charmander");
        System.out.println("2 - Pikachu");
        int opcion = sc.nextInt();
        
        if (opcion == 1) 
        {
            System.out.println("\n");
            System.out.println("Tu pokemon          | " + pkm[0].name + " | PS : " + pkm[0].vida + " | ATQ : " + pkm[0].ataque + " | DEF : " + pkm[0].defensa + " | ATQE : " + pkm[0].ataqueEspecial + " | DEFE : " + pkm[0].defensaEspecial + " | VEL : " + pkm[0].velocidad);
            System.out.println("Pokemon de tu rival | " + pkm[1].name);
            System.out.println("\n");

            System.out.println("Elije un ataque");
            System.out.println("1 - " + movPKM1[0].nombreMov + " - Tipo " + movPKM1[0].tipoMov + " - Potencia " + movPKM1[0]);
            System.out.println("2 - " + movPKM1[1].nombreMov + " - Tipo " + movPKM1[1].tipoMov + " - Potencia " + movPKM1[1]);
 
            int elegirAtaque = sc.nextInt();

            if (elegirAtaque == 1)
            {

            }

        }
        else if (opcion == 2)
        {
            System.out.println("\n");
            System.out.println("Tu pokemon          --> " + pkm[1].name);
            System.out.println("Pokemon de tu rival --> " + pkm[0].name);
            System.out.println("\n");

        }
    }
}