package org.link_shortener.controller;

import lombok.RequiredArgsConstructor;
import org.link_shortener.entities.Link;
import org.link_shortener.service.LinkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/link_shortener")
@RequiredArgsConstructor
public class LinkController {

    private final LinkService linkService;

    @PostMapping()
    public Link salvar(@RequestBody Link link){
        return linkService.salvar(link);
    }

    @GetMapping("/links")
    public ResponseEntity<List<Link>> todosLinks(){
        return ResponseEntity.ok(linkService.todosLinks());
    }



}
