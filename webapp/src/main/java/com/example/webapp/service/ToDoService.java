package com.example.webapp.service;

import java.util.List;

import com.example.webapp.entity.ToDo;

//Todo:サービス
public interface ToDoService {
	List<ToDo> findAllToDo();
	
	//指定されたIDの「すること」を検索します
	ToDo findByIdToDo(Integer id);
	
	//「すること」を新規登録します
	void insertToDo(ToDo toDo);
	
	//「すること」を更新します
	void updateToDo(ToDo toDo);
	
	//指定されたIDの「すること」を削除します
	void deleteToDo(Integer id);
}
