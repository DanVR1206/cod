public class pokemons {
    String name;
    String tipo;
    int vida;
    int ataque;
    int defensa;
    int ataqueEspecial;
    int defensaEspecial;
    int velocidad;
    //String movimiento1;
    //String movimiento2;

    public pokemons (String name, String tipo, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad) // , String movimiento1, String movimiento2
    {
        this.name = name;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        //this.movimiento1 = movimiento1;
        //this.movimiento2 = movimiento2;
    }
}   