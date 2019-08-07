package com.example.tiendaBelleza.service.impl;

import com.example.tiendaBelleza.converter.EntityConverter;
import com.example.tiendaBelleza.dto.BodegaDto;
import com.example.tiendaBelleza.repository.BodegaRepository;
import com.example.tiendaBelleza.service.BodegaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BodegaServiceImpl implements BodegaService {
    @Autowired
    BodegaRepository bodegaRepository;

    @Override
    public List<BodegaDto> getAllBodegas() {
        return bodegaRepository.findAll().stream().map(EntityConverter::bodegaToBodegaDto).collect(Collectors.toList());
    }
}
