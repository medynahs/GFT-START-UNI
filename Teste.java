public class Teste { 
    public static void main(String[] args) {

    Imposto cofins = new Cofins(10000);
    System.out.println("O custo do imposto Cofins custará:");
    System.out.println(cofins.calculaImposto());

    Imposto icms = new Icms(30000);
    System.out.println("O custo do imposto Icms custará:");
    System.out.println(icms.calculaImposto());

    Imposto ipi = new Ipi(20000);
    System.out.println("O custo do imposto Ipi custará:");
    System.out.println(ipi.calculaImposto());


    System.out.println("A somatória dos impostos é: "+ (cofins.calculaImposto() + icms.calculaImposto() + ipi.calculaImposto()));

 }
    
}
