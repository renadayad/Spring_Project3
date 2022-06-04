package com.example.springproject.servies;

import com.example.springproject.exceptions.InvalidException;
import com.example.springproject.model.Book;
import com.example.springproject.model.Lona;
import com.example.springproject.model.MyUser;
import com.example.springproject.repoistory.BookRepoistory;
import com.example.springproject.repoistory.LonaRepoistory;
import com.example.springproject.repoistory.MyUserRepoistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class BookServies {

private final BookRepoistory bookRepoistory;
private final LonaServies lonaServies;
private final MyUserServies myUserServies;
private  final LonaRepoistory  lonaRepoistory;
public List<Book>getAllBooks(){

    return bookRepoistory.findAll();
}
public Book getoneBook(Integer bookid){
    return bookRepoistory.findById(bookid).orElseThrow(() -> {
        throw new InvalidException("Book id is invaild!");
    });
}

    public void addBook(Book book) {

    bookRepoistory.save(book);
    }

   public void LeandBook(Integer bookid,Integer userid) {
       //Lona lona;
 MyUser myUser=myUserServies.getoneUser(userid);
 Book book=getoneBook(bookid);

       Lona l1=new Lona(null,userid,bookid,null);
       lonaRepoistory.save(l1);
   }

    public List<Lona> getLoansAllBooks(Integer bookid) {
        Book book = bookRepoistory.findById(bookid).orElseThrow(()->{
            throw new InvalidException("book id is invlied!");
        });
      return lonaServies.getAllLona();

    }

   }

