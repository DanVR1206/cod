import java.util.Random;
import java.util.Scanner;
public class manin
{   
    public static void main (String args[])
    {
        pokemons[] pkm = new pokemons[4];
        movimientos[] movPKM = new movimientos[4];
        // Moviminetos
        movPKM[0] = new movimientos("Arañazo", "Normal", 20);
        movPKM[1] = new movimientos("Ascuas", "Fuego", 25);
        movPKM[2] = new movimientos("Placaje", "Normal", 15);
        movPKM[3] = new movimientos("Impactrueno", "Electrico", 30);
        // POKEMONS
        pkm[0] = new pokemons("Charmander", "Fuego", 40, 23, 15, 32, 13, 25, "Arañazo", "Normal", 20, "Ascuas", "Fuego", 25);
        pkm[1] = new pokemons("Pikachu", "Electrico", 38, 27, 18, 27, 12, 30, "Placaje", "Normal", 15, "Impactrueno", "Electrico", 30);
        pkm[2] = new pokemons("Snorlax", "Normal", 280, 90, 100, 40, 112, 40, "Recuparación", "Normal", 80, "Golpe Cuerpo", "Normal", 90);
        pkm[3] = new pokemons("Infernape", "Fuego", 190, 120, 70, 120, 65, 130, "Abocajarro", "Lucha", 120, "Envite igneo", "Fuego", 125);
        
        // Elección de pokemon        
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("--------------------------------");
        System.out.println("Jugador 1 escoje un pokemon");
        System.out.println("1 - Charmander");
        System.out.println("2 - Pikachu");
        System.out.println("3 - Snorlax");
        System.out.println("4 - Infernape");
        int opcion1 = sc.nextInt();
        System.out.println("Pokemon del J1 | " + pkm[opcion1-1].name + " | PS : " + pkm[opcion1-1].vida + " | ATQ : " + pkm[opcion1-1].ataque + " | DEF : " + pkm[opcion1-1].defensa + " | ATQE : " + pkm[opcion1-1].ataqueEspecial + " | DEFE : " + pkm[opcion1-1].defensaEspecial + " | VEL : " + pkm[opcion1-1].velocidad);

        System.out.println("--------------------------------");
        System.out.println("Jugador 2 Escoje un pokemon");
        System.out.println("1 - Charmander");
        System.out.println("2 - Pikachu");
        System.out.println("3 - Snorlax");
        System.out.println("4 - Infernape");
        int opcion2 = sc.nextInt();
        System.out.println("Pokemon del J2 | " + pkm[opcion2-1].name + " | PS : " + pkm[opcion2-1].vida + " | ATQ : " + pkm[opcion2-1].ataque + " | DEF : " + pkm[opcion2-1].defensa + " | ATQE : " + pkm[opcion2-1].ataqueEspecial + " | DEFE : " + pkm[opcion2-1].defensaEspecial + " | VEL : " + pkm[opcion2-1].velocidad);
        System.out.println("--------------------------------");

        // Variables para el combate
        int v1 = pkm[opcion1-1].velocidad;
        int v2 = pkm[opcion2-1].velocidad;
        int ps1 = pkm[opcion1-1].vida;
        int ps2 = pkm[opcion2-1].vida;
        boolean muerte = false;
        boolean turno = false;
        if (v1 > v2) 
        {
            turno = true;
        }
        else if (v1 < v2)
        {
            turno = false;
        }
        else if (v1 == v2)
        {
            int primero = r.nextInt(100 + 1 - 0) + 0;
            if (primero >= 50)
            {
                turno = true;
            }
            else if (primero < 49)
            {
                turno = false;                
            }
        }

        // Combate
        do
        {
            // Comprobamos si uno de los PKM a perdido
            if (ps1 <= 0) 
            {
                System.out.println("\n");
                System.out.println("--------------------------------");
                System.out.println("Ha perdido el " + pkm[opcion1-1].name + " del J1 ...");
                System.out.println("Y gana la pelea el " + pkm[opcion2-1].name + " del J2 !");
                muerte = true;
                break;
            }
            else if (ps2 <= 0) 
            {
                System.out.println("\n");
                System.out.println("--------------------------------");
                System.out.println(pkm[opcion2-1].name + " se ha debilitado, el J2 pierde ...");
                System.out.println("Y gana la pelea el " + pkm[opcion1-1].name + " del J1 !");
                muerte = true;
                break;
            }
            // Turnos y ataques
            if (turno == true) 
            {
                System.out.println("\n");
                System.out.println("--------------------------------");
                System.out.println("Ataca el J1 con " + pkm[opcion1-1].name + " !");
                System.out.println("Escoje un ataque ...");
                System.out.println("1 - " + pkm[opcion1-1].movimiento1 + " - Tipo " + pkm[opcion1-1].movimiento1tipo + " - Potencia " + pkm[opcion1-1].movimiento1potencia);
                System.out.println("2 - " + pkm[opcion1-1].movimiento2 + " - Tipo " + pkm[opcion1-1].movimiento2tipo + " - Potencia " + pkm[opcion1-1].movimiento2potencia);
                //System.out.println("1 - " + movPKM[0].nombreMov + " - Tipo " + movPKM[0].tipoMov + " - Potencia " + movPKM[0].potenciaMov);
                //System.out.println("2 - " + movPKM[1].nombreMov + " - Tipo " + movPKM[1].tipoMov + " - Potencia " + movPKM[1].potenciaMov);
                int elegirAtaque = sc.nextInt();
                if (elegirAtaque == 1)
                {
                    System.out.println(pkm[opcion1-1].name + " ha atacado a " + pkm[opcion2-1].name + " con " + pkm[opcion1-1].movimiento1 + " haciendole " + pkm[opcion2-1].movimiento1potencia + " puntos de daño !");
                    ps2 = ps2 - pkm[opcion1-1].movimiento1potencia;
                    if (pkm[opcion2-1].vida <= 0)
                    {
                        System.out.println("La salud de " + pkm[opcion2-1].name + " a disminuido a " + ps2 + " puntos de vida");
                    }
                    else 
                    {
                        System.out.println("La salud de " + pkm[opcion2-1].name + " a disminuido a " + ps2 + " puntos de vida");
                    }
                }
                else if (elegirAtaque == 2)
                {
                    System.out.println(pkm[opcion1-1].name + " ha atacado a " + pkm[opcion2-1].name + " con " + pkm[opcion1-1].movimiento2 + " haciendole " + pkm[opcion2-1].movimiento2potencia + " puntos de daño !");
                    ps2 = ps2 - pkm[opcion1-1].movimiento2potencia;
                    if (pkm[opcion2-1].vida <= 0)
                    {
                        System.out.println("La salud de " + pkm[opcion2-1].name + " a disminuido a " + ps2 + " puntos de vida");
                    }
                    else 
                    {
                        System.out.println("La salud de " + pkm[opcion2-1].name + " a disminuido a " + ps2 + " puntos de vida");
                    }
                }
                turno = false;
            }
            else if (turno == false) 
            {
                System.out.println("\n");
                System.out.println("--------------------------------");
                System.out.println("Ataca el J2 con " + pkm[opcion2-1].name + " !");
                System.out.println("Escoje un ataque ...");
                System.out.println("1 - " + pkm[opcion2-1].movimiento1 + " - Tipo " + pkm[opcion2-1].movimiento1tipo + " - Potencia " + pkm[opcion2-1].movimiento1potencia);
                System.out.println("2 - " + pkm[opcion2-1].movimiento2 + " - Tipo " + pkm[opcion2-1].movimiento2tipo + " - Potencia " + pkm[opcion2-1].movimiento2potencia);
                int elegirAtaque = sc.nextInt();
                if (elegirAtaque == 1)
                {
                    System.out.println(pkm[opcion2-1].name + " ha atacado a " + pkm[opcion1-1].name + " con " + pkm[opcion2-1].movimiento1 + " haciendole " + pkm[opcion2-1].movimiento1potencia + " puntos de daño !");
                    ps1 = ps1 - pkm[opcion2-1].movimiento1potencia;
                    if (pkm[opcion1-1].vida <= 0)
                    {
                        System.out.println("La salud de " + pkm[opcion1-1].name + " a disminuido a " + ps1 + " puntos de vida");
                    }
                    else 
                    {
                        System.out.println("La salud de " + pkm[opcion1-1].name + " a disminuido a " + ps1 + " puntos de vida");
                    }
                }
                else if (elegirAtaque == 2)
                {
                    System.out.println(pkm[opcion2-1].name + " ha atacado a " + pkm[opcion1-1].name + " con " + pkm[opcion2-1].movimiento2 + " haciendole " + pkm[opcion2-1].movimiento2potencia + " puntos de daño !");
                    ps1 = ps1 - pkm[opcion2-1].movimiento2potencia;
                    if (pkm[opcion1-1].vida <= 0)
                    {
                        System.out.println("La salud de " + pkm[opcion1-1].name + " a disminuido a " + ps1 + " puntos de vida");
                    }
                    else 
                    {
                        System.out.println("La salud de " + pkm[opcion1-1].name + " a disminuido a " + ps1 + " puntos de vida");
                    }
                }
                turno = true;
            }
        } 
        while (muerte == false); 
        System.out.println("--------------------------------");
        System.out.println("\n");
    }

    static int tablaTipos (String tipoPKMAtacante, String tipoPKMAtacado, String tipoMOV) 
    {   
        int eficacia = 0;
        return eficacia;
    }
}