package service;

import entity.Author;
import repository.AuthorRepository;

public class AuthorService {

    public AuthorRepository authorRepository = new AuthorRepository();

    public void register(String name, String family, int age) {
        Author author = new Author();
        author.setName(name);
        author.setFamily(family);
        author.setAge(age);
        this.authorRepository.save(author);
    }
}
