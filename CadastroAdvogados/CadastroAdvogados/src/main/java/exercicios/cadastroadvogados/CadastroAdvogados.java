/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.cadastroadvogados;

/**
 *
 * @author allan
 */
public class CadastroAdvogados {

   public static void main(String[] args) {
       
        Advogado advogado1 = new Advogado();       
        advogado1.nome = "Evelin";
        advogado1.registroOAB = "004769";
        advogado1.preencherEmail("evelin.souza@hotmail.com");
        advogado1.preencherEndereco("Rua Artur Nisio,417");
        advogado1.preencherEspecialidade("Trabalhista");
        advogado1.preencherFormacao("Advogada");
        advogado1.preencherTelefone("(45)99999-9999");
       
        Advogado advogado2 = new Advogado();
        advogado2.nome = "Augusto";
        advogado2.registroOAB = "005980";
        advogado2.preencherEmail("augusto_oab@outlook.com");
        advogado2.preencherEndereco("Avenida Brasil,6874");
        advogado2.preencherEspecialidade("Penal");
        advogado2.preencherFormacao("Advogado");
        advogado2.preencherTelefone("(11)11111-1111");
        
        Advogado advogado3 = new Advogado();
        advogado3.nome = "Vinicius";
        advogado3.registroOAB = "008756";
        advogado3.preencherEmail("vinicius.silveira@gmail.com");
        advogado3.preencherEndereco("Rua Antonina,578");
        advogado3.preencherEspecialidade("Tributário");
        advogado3.preencherFormacao("Adivogado");
        advogado3.preencherTelefone("(45)88888-8888");
        
        Advogado advogado4 = new Advogado();
        advogado4.nome = "Estevão";
        advogado4.registroOAB = "001259";
        advogado4.preencherEmail("estevãodasilva@hotmail.com");
        advogado4.preencherEndereco("Rua Francisco de Assis,621");
        advogado4.preencherEspecialidade("Empresarial");
        advogado4.preencherFormacao("Advogado");
        advogado4.preencherTelefone("(45)77777-7777");
        
        Advogado advogado5 = new Advogado();
        advogado5.nome = "Naara";
        advogado5.registroOAB = "007559";
        advogado5.preencherEmail("naara.rosimery@outlook.com");
        advogado5.preencherEndereco("Rua Manaus, 276");
        advogado5.preencherEspecialidade("Contratual");
        advogado5.preencherFormacao("Advogada");
        advogado5.preencherTelefone("(81)44444-4444");
        
        advogado3.dadosAdvogados();
        advogado4.dadosAdvogados();
        advogado5.dadosAdvogados();
        
    }
    
}