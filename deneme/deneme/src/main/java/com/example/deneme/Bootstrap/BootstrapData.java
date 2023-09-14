package com.example.deneme.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.deneme.domain.Author;
import com.example.deneme.domain.Book;
import com.example.deneme.domain.Publisher;
import com.example.deneme.repositories.AuthorRepository;
import com.example.deneme.repositories.BookRepository;
import com.example.deneme.repositories.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    


    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        System.out.println("Bootstrap başlatildi");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("Malatya");
        publisher.setState("TC");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());
        
        Author osamu = new Author("Osamu", "Dazai");
        Book iy = new Book("Ä°nsanligimi yitiriken", "123123");
        osamu.getBooks().add(iy);
        iy.getAuthors().add(osamu);

        iy.setPublisher(publisher);
        publisher.getBooks().add(iy);

        authorRepository.save(osamu);
        bookRepository.save(iy);
        publisherRepository.save(publisher);

        Author nikolay = new Author("Nikolay", "Gogol");
        Book brn = new Book ("Burun", "456456");
        nikolay.getBooks().add(brn);
        brn.getAuthors().add(nikolay);

        brn.setPublisher(publisher);
        publisher.getBooks().add(brn);

        authorRepository.save(nikolay);
        bookRepository.save(brn);
        publisherRepository.save(publisher);

        Author peyami = new Author("Peyami", "Safa");
        Book fh = new Book("Fatih Harbiye", "789789");
        peyami.getBooks().add(fh);
        fh.getAuthors().add(peyami);

        fh.setPublisher(publisher);
        publisher.getBooks().add(fh);

        authorRepository.save(peyami);
        bookRepository.save(fh);
        publisherRepository.save(publisher);

        System.out.println("Kitap sayisi:" + bookRepository.count());
        System.out.println("Publisher number of books:" + publisher.getBooks().size());
    }

}
