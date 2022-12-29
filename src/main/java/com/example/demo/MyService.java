package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@AllArgsConstructor
public class MyService {
    private MyDao myDao;

    @Transactional
    public MyEntity findById(UUID id) {
        return myDao.findById(id).get();
    }
}
