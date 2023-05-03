package src.test;

import hk.hku.entity.BookEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

public class test03 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("book.xml");
        BookEntity bookEntity =classPathXmlApplicationContext.getBean("bookEntity", BookEntity.class);
        System.out.println(bookEntity.toString());
    }
}
