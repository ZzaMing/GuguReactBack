package com.zzaming.mallapi.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zzaming.mallapi.dto.PageRequestDTO;
import com.zzaming.mallapi.dto.PageResponseDTO;
import com.zzaming.mallapi.dto.TodoDTO;
import com.zzaming.mallapi.service.TodoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService todoService;

    @GetMapping("/{tno}")
    public TodoDTO getMethodName(@PathVariable(name = "tno") Long tno) {

        return todoService.get(tno);
    }

    @GetMapping("/list")
    public PageResponseDTO<TodoDTO> getMethodName(PageRequestDTO pageRequestDTO) {

        log.info(pageRequestDTO);

        return todoService.list(pageRequestDTO);
    }

    @PostMapping("/")
    public Map<String, Long> register(@RequestBody TodoDTO todoDTO) {

        log.info("TodoDTO: " + todoDTO);

        Long tno = todoService.register(todoDTO);

        return Map.of("TNO", tno);
    }

    @PutMapping("/{tno}")
    public Map<String, String> modify(
            @PathVariable(name = "tno") Long tno,
            @RequestBody TodoDTO todoDTO) {

        todoDTO.setTno(tno);

        log.info("Modify: " + todoDTO);

        todoService.modify(todoDTO);

        return Map.of("RESULT", "SUCCESS");
    }

    @DeleteMapping("/{tno}")
    public Map<String, String> remove( @PathVariable(name="tno") Long tno) {

        log.info("Remove: " + tno);

        todoService.remove(tno);

        return Map.of("RESULT", "SUCCESS");
    }
}
