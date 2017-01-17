package br.com.marryplan.vo.converter;

import java.util.ArrayList;
import java.util.List;



import br.com.marryplan.entidade.Tarefas;

import br.com.marryplan.vo.TarefasVO;

public class Converter {

	public static Tarefas converterVoParaTarefas(TarefasVO tarefasVO){
		Tarefas tarefas = new Tarefas();
		tarefas.setId(tarefasVO.getId());
		tarefas.setNome(tarefasVO.getNome());
		tarefas.setStatus(tarefasVO.isStatus());

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
	
}
