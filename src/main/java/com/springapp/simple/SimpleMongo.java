package com.springapp.simple;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.springapp.config.SpringMongoConfigFactory;
import com.springapp.model.User;

public class SimpleMongo {

	public static void main(String ar[]){
		//xml을 사용할 경우
		//ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");

		//Annotation
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfigFactory.class);
		MongoOperations mongo =  (MongoOperations)ctx.getBean("mongoTemplate");

		User user = new User("윤석진", "qwer1234");

		mongo.save(user);

		System.out.println("user : " + user);

		//조회
		Query searchQuery = new Query( Criteria.where("username").is(""));
		User savedUser = mongo.findOne(searchQuery, User.class);
		System.out.println("2. find - savedUser : " + savedUser);

		//삭제
		//mongo.remove(searchQuery, User.class);

		//수정
		mongo.updateFirst(searchQuery, Update.update("password", "new password"),
				User.class);

		//전체조회
		// List, it should be empty now.
				List<User> listUser = mongo.findAll(User.class);
				System.out.println("4. Number of user = " + listUser.size());
	}
}
