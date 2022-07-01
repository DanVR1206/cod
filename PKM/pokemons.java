public class pokemons {
    String name;
    String tipo;
    int vida;
    int ataque;
    int defensa;
    int ataqueEspecial;
    int defensaEspecial;
    int velocidad;
    String movimiento1;
    String movimiento1tipo;
    int movimiento1potencia;    
    String movimiento2;
    String movimiento2tipo;
    int movimiento2potencia;

    public pokemons (String name, String tipo, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad, String movimiento1, String movimiento1tipo, int movimiento1potencia, String movimiento2, String movimiento2tipo, int movimiento2potencia) // 
    {
        this.name = name;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.movimiento1 = movimiento1;
        this.movimiento1tipo = movimiento1tipo;
        this.movimiento1potencia = movimiento1potencia;
        this.movimiento2 = movimiento2;
        this.movimiento2tipo = movimiento2tipo;
        this.movimiento2potencia = movimiento2potencia;
    }
}   