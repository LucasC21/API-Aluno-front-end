package consome.appConsome.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import consome.appConsome.model.AlunoModel;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
//	static String webService = "localhost:5432/apialunosprofessor/";
//	static int codigoSucesso = 200;
	
//	Retorna a página de cadastro de aluno
	@GetMapping("/insereAluno")
	public ModelAndView insereAluno() {
		ModelAndView modelAndView = new ModelAndView("aluno/insereAluno");
		AlunoModel aluno=  new AlunoModel();
		modelAndView.addObject("aluno", aluno);
		return modelAndView;
	}
	
//	método que salva aluno na lista
	@PostMapping("/salva")
	public String salvaAluno(AlunoModel aluno) {
		System.out.println(aluno.getNome() + " || " + aluno.getCampus() + " || " + aluno.getCurso() + " || " + aluno.getIdade() + " || " + aluno.getSexo());
		ArrayList<AlunoModel> alunos = new ArrayList<AlunoModel>();
		alunos.add(aluno);
		System.out.println(alunos.size());
		return "redirect:exibeAluno";
	}
	
	@GetMapping("/exibeAluno")
	public ModelAndView exibiAluno() {
		ModelAndView modelAndView = new ModelAndView("aluno/exibeAluno");
		AlunoModel aluno=  new AlunoModel();
		modelAndView.addObject("aluno", aluno.getNome());
		return modelAndView;
	}
	
	@GetMapping("/listaAluno")
	public String showAll(AlunoModel aluno) {
		ArrayList<AlunoModel> alunos = new ArrayList<AlunoModel>();
		System.out.println(alunos.toString());
		return "redirect:/";
	}

//	@PostMapping("/buscaAluno")
//	public ModelAndView buscarAluno(String cep) throws Exception {
//		ModelAndView modelAndView = new ModelAndView("cep/exibeCEP");
//		String urlParaChamada = webService + cep + "/json";
//
//		try {
//			URL url = new URL(urlParaChamada);
//			HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
//
//			if (conexao.getResponseCode() != codigoSucesso)
//				throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
//
//			BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
//			String jsonEmString = Util.converteJsonEmString(resposta);
//
//			Gson gson = new Gson();
//			Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);
//
//			modelAndView.addObject("endereco", endereco);
//			return modelAndView;
//		} catch (Exception e) {
//			throw new Exception("ERRO: " + e);
//		}
//	}
}
 