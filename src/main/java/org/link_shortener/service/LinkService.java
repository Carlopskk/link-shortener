package org.link_shortener.service;

import lombok.RequiredArgsConstructor;
import org.link_shortener.entities.Link;
import org.link_shortener.repository.LinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LinkService {

    private final LinkRepository linkRepository;

    public Link salvar(Link link){
        return linkRepository.save(link);
    }

    public List<Link> todosLinks(){
        return linkRepository.findAll();
    }

}
