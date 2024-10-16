package encapsulamento;

public class Principal {

	public static void main(String[] args) {
		
		Tema tema1 = new Tema(01, "Daniel", 220.48, "Azul");
		ItemTema itemTema1 = new ItemTema(02, "Otávio", "sla");
		Endereco endereco1 = new Endereco(04, "Rua Mário de Oliveira", 113 ,"Casa", "Jardim Cambuí","Itapetininga", "18207635", "SP");
		Cliente cliente1 = new Cliente(05, "Jorge", "55 15 92943-3924", "11111111111", "!0392492");
		
		
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getvalorAluguel());
		System.out.println(tema1.getCorToalha());
		System.out.println("-------------------\n");
		
		System.out.println(itemTema1.getId());
		System.out.println(itemTema1.getNome());
		System.out.println(itemTema1.getDescricao());
		System.out.println("-------------------\n");

		
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCap());
		System.out.println(endereco1.getUf());
		System.out.println("-------------------\n");

		
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println("-------------------\n");

		
		
		
		
		
		
		
		
		
		

	}

}
