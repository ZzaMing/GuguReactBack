package com.zzaming.mallapi.service;

import org.springframework.transaction.annotation.Transactional;

import com.zzaming.mallapi.dto.PageRequestDTO;
import com.zzaming.mallapi.dto.PageResponseDTO;
import com.zzaming.mallapi.dto.ProductDTO;

@Transactional
public interface ProductService {

    PageResponseDTO<ProductDTO> getList(PageRequestDTO pageRequestDTO);
    
}
