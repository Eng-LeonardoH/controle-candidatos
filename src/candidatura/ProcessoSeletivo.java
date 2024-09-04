package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
     public static void main(String[] args) {
          System.out.println("Processo seletivo");
          selecaoCandidatos();
     }
     static  void selecaoCandidatos() {
          String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

          int candidatosSelecionados = 0;
          int candidatosAtual = 0;
          double salarioBase = 2000;

          while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
               String candidato = candidatos[candidatosAtual];
               double salarioPretendido = valorPretendido();
               System.out.println(candidato + " solicitou este valor de salário: " + salarioPretendido);

               if(salarioBase >= salarioPretendido){
                    System.out.println(candidato + " foi selecionado(a) para a vaga");
                    candidatosSelecionados++;
               }
               candidatosAtual++;
          }
     }

     static double valorPretendido() {
          return ThreadLocalRandom.current().nextDouble(1800,2200);
     }

     static void analisarCandidato(double salarioPretendido) {
          double salarioBase = 2000;
          if (salarioBase > salarioPretendido) {
               System.out.println("LIGAR PARA O CANDIDATO");
          } else if (salarioBase == salarioPretendido) {
               System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
          } else {
               System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
          }
     }
}
