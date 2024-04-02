class Main
{

  public static class Pessoa
  {
	private String nome;
	private int idade;

	public void fazAniversario ()
	{
	  this.idade++;
	}

	public Pessoa (String nome, int idade)
	{
	  this.nome = nome;
	  this.idade = idade;
	}

	public int getIdade ()
	{
	  return this.idade;
	}

	public String getNome ()
	{
	  return this.nome;
	}
  }

  public static void main (String[]args)
  {
	Pessoa pessoa1 = new Pessoa ("Maria Bianca", 19);
	pessoa1.fazAniversario ();
	System.out.println (pessoa1.nome + " ira fazer " + pessoa1.getIdade () + 
	"\n");

	Pessoa pessoa2 = new Pessoa ("Matheus Vinicius", 18);
	pessoa2.fazAniversario ();
	System.out.println (pessoa2.nome + " ira fazer " + pessoa2.getIdade () + 
	"\n");

	for (int i = 0; i < 3; i++)
	  {
		pessoa1.fazAniversario ();
		pessoa2.fazAniversario ();
		System.out.println (i + ")" + pessoa1.getNome () + " agora tem " +
							pessoa1.getIdade () + " anos.\n");
		System.out.println (i + ")" + pessoa2.getNome () + " agora tem " +
							pessoa2.getIdade () + " anos.\n");
	  }
  }


}
