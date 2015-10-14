package br.com.treinar.comando;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.modelo.Contato;
import br.com.treinar.modelo.Pessoa;
import br.com.treinar.modelo.Sexo;
import br.com.treinar.modelo.Telefone;
import br.com.treinar.util.AgendaException;
import br.com.treinar.util.DataBase;
import br.com.treinar.util.IComando;

public class CriaContato implements IComando {

	@Override
	public String executar(HttpServletRequest request,
			HttpServletResponse response) throws AgendaException {
		
		AgendaException ex = null;
		Boolean possuiErro = Boolean.FALSE;
		String retorno = null;
		
		StringBuilder camposPendentes = new StringBuilder("Campos obrigatórios: ");
		
		String nomeContato = request.getParameter("nome");
		if (nomeContato == null || nomeContato.equals("")) {
			possuiErro = Boolean.TRUE;
			camposPendentes.append("Nome ");
		}
		String sexoStr = request.getParameter("sexo");
		Sexo sexo = null;
		if (sexoStr == null || sexoStr.equals("")) {
			camposPendentes.append("Sexo ");
			possuiErro = Boolean.TRUE;
		} else {
			sexo = Sexo.recuperarSexoPorOrdinal(Integer.parseInt(sexoStr));
		}
		String telefone = request.getParameter("telefone");
		if (telefone == null || telefone.equals("")) {
			camposPendentes.append("Telefone ");
			possuiErro = Boolean.TRUE;
		}
		String endereco = request.getParameter("endereco");
		if (endereco == null || endereco.equals("")) {
			camposPendentes.append("Endereço ");
			possuiErro = Boolean.TRUE;
		}
		String email = request.getParameter("email");
		if (email == null || email.equals("")) {
			camposPendentes.append("E-mail ");
			possuiErro = Boolean.TRUE;
		}
		if (possuiErro) {
			ex = new AgendaException();
			ex.setErro(camposPendentes.toString());
		} else {
			Contato contato = new Contato();
			contato.setPessoa(new Pessoa());
			contato.getPessoa().setNome(nomeContato);
			contato.getPessoa().setSexo(sexo);
			contato.setEndereco(endereco);
			contato.setEmail(email);
			contato.setTelefone(new Telefone());
			contato.getTelefone().setDdi(Integer.parseInt(telefone.substring(0,2)));
			contato.getTelefone().setDdd(Integer.parseInt(telefone.substring(2,4)));
			contato.getTelefone().setNumero(Integer.parseInt(telefone.substring(4,12)));
			
			DataBase instance = DataBase.getInstance();
			instance.adicionarContato(contato);
			
			
			ListaContato lista = new ListaContato();
			retorno = lista.executar(request, response);
			
		}
		return retorno;
		
		
	}

	
}
