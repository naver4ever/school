package kr.or.dgit.bigdata.school;

import java.util.Date;

import kr.or.dgit.bigdata.school.dao.StudentService;
import kr.or.dgit.bigdata.school.dto.Student;

public class TestMain {

	public static void main(String[] args) {
//		Connection con = ConnectionFactory.getInstance();
		
//		System.out.println(con);
		
		Student item = new Student(4, "홍두깨", "hdk@test.co.kr", new Date());
//		StudentService.getInstance().insertItem(item);
		
		/*item.setName("전지현");
		StudentService.getInstance().updateItem(item);*/
		
		/*for(Student s : StudentService.getInstance().selectByAll()){
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println(StudentService.getInstance().selectByNo(1));*/
		
		System.out.println();
		StudentService.getInstance().deleteItem(4);
		

	}

}
