package br.com.marryplan.vo.converter;

import java.util.ArrayList;
import java.util.List;



import br.com.marryplan.entidade.Tarefas;
import br.com.marryplan.entidade.Usuario;
import br.com.marryplan.vo.TarefasVO;
import br.com.marryplan.vo.UsuarioVO;

public class Converter {

	public static Tarefas converterVoParaTarefas(TarefasVO tarefasVO){
		Tarefas tarefas = new Tarefas();
		tarefas.setId(tarefasVO.getId());
		tarefas.setNome(tarefasVO.getNome());
		tarefas.setStatus(tarefasVO.getStatus());

		return tarefas;
	}

	public static TarefasVO converterTarefasParaVO(Tarefas tarefas){
		TarefasVO tarefasVO = new TarefasVO();
		
		tarefasVO.setId(tarefas.getId());
		tarefasVO.setNome(tarefas.getNome());
		tarefasVO.setStatus(tarefas.isStatus());
		
		return tarefasVO;
	}

	public static List<TarefasVO> converterListaTarefasParaListaVo(List<Tarefas> listaEntidade){
		
		List<TarefasVO> listTarefasVO = new ArrayList<TarefasVO>();
		if(listaEntidade != null && !listaEntidade.isEmpty()){
			for(Tarefas tarefas : listaEntidade){
				TarefasVO tarefasVO = converterTarefasParaVO(tarefas);
				listTarefasVO.add(tarefasVO);
			}
		}
		return listTarefasVO;
	}	
	
	public static UsuarioVO converterusuarioparavo (Usuario usuario){
		UsuarioVO usuarioVO = new UsuarioVO();
		
		usuarioVO.setId(usuario.getId());
		usuarioVO.setLogin(usuario.getLogin());
		usuarioVO.setSenha(usuario.getSenha());
		
		return usuarioVO;
	}
	
	public static Usuario convertervoparausuario (UsuarioVO usuarioVO){
		Usuario usuario = new Usuario();
		
		usuario.setId(usuarioVO.getId());
		usuario.setLogin(usuarioVO.getLogin());
		usuario.setSenha(usuarioVO.getSenha());
		
		return usuario;
	}
}
