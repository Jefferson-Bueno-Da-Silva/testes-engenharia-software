package br.edu.unip.aula.testes_engenharia_software;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calculadora" );
        
        Calculadora calculadora = new Calculadora();
        
        Integer resultadoInteger = calculadora.Somar(3, 7);
        
        System.out.println(resultadoInteger);
        
        // Calcula IMC : 
        
        System.out.println("IMC: ");
        
        IMC imc = new IMC();
        
        String meuIMCString = imc.CalculaImc(70.0, 1.70);
        
        System.out.println(meuIMCString);
        
    }
}
