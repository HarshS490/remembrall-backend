package com.remembrall.remembrall.services;

import com.remembrall.remembrall.mappers.ForestMapper;
import com.remembrall.remembrall.repositories.ForestRepository;
import org.springframework.stereotype.Service;

@Service
public class ForestService {
    final ForestRepository forestRepository;
    final ForestMapper forestMapper;

    public ForestService(ForestRepository forestRepository, ForestMapper forestMapper) {
        this.forestRepository = forestRepository;
        this.forestMapper = forestMapper;
    }


}
