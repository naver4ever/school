package kr.or.dgit.bigdata.school.dao;

import java.util.List;

public interface interfaceDao<T> {
	void insertItem(T item);
	void deleteItem(int idx);
	void updateItem(T item);
	T selectByNo(int idx);
	List<T> selectByAll();

}
