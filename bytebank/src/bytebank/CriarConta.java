package bytebank;

public class CriarConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;

		System.out.println("A primeira conta tem " + primeiraConta.saldo);
		System.out.println("A segunda conta tem " + segundaConta.saldo);

		primeiraConta.agencia = 146;

		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);

		System.out.println(segundaConta.agencia);

		segundaConta.agencia = 146;

		System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("� a mesma");
		} else {
			System.out.println("S�o diferentes");
		}
	}

}
