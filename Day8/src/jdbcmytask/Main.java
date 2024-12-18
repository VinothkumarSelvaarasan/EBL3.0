package com.wecp;

import com.wecp.connection.DatabaseConnection;
import com.wecp.dao.BookDAO;
import com.wecp.dao.BookDAOImpl;
import com.wecp.entity.Author;
import com.wecp.entity.Book;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String dbUrl = "jdbc:mysql://localhost:3306/bookDB_wecp";
            String user = "root";
            String password = "hellowecp";

            Connection connection = DatabaseConnection.createConnection(dbUrl, user, password);
            BookDAO bookDAO = new BookDAOImpl(connection);

            Scanner scanner = new Scanner(System.in);

            // Insert 5-6 Books
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter book name:");
                String bookName = scanner.nextLine();

                System.out.println("Enter book release date (YYYY-MM-DD):");
                String bookReleaseDate = scanner.nextLine();

                System.out.println("Enter author name:");
                String authorName = scanner.nextLine();

                // For simplicity, author is inserted manually. In real cases, use AuthorDAO to insert Author and retrieve authorId.
                Author author = new Author();
                author.setAuthorId(1);  // Assume authorId 1 for demonstration.

                Book book = new Book();
                book.setBookName(bookName);
                book.setBookReleaseDate(Date.valueOf("2023-09-19"));
                book.setAuthor(author);
                bookDAO.insertBook(book);
            }

            // Select Books by name
            System.out.println("Enter a book name to search:");
            String searchBookName = scanner.nextLine();

            List<Book> books = bookDAO.getBooksByName(searchBookName);
            for (Book book : books) {
                System.out.println("Book ID: " + book.getBookId() +
                        ", Book Name: " + book.getBookName() +
                        ", Release Date: " + book.getBookReleaseDate() +
                        ", Author: " + book.getAuthor().getAuthorName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
