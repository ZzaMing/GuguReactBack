package com.zzaming.mallapi.service;

import org.springframework.transaction.annotation.Transactional;

import com.zzaming.mallapi.dto.PageRequestDTO;
import com.zzaming.mallapi.dto.PageResponseDTO;
import com.zzaming.mallapi.dto.ProductDTO;

@Transactional
public interface ProductService {

    PageResponseDTO<ProductDTO> getList(PageRequestDTO pageRequestDTO);

    Long register(ProductDTO productDTO);

    ProductDTO get(Long pno);

    void modify(ProductDTO productDTO);

    void remove(Long pno);
}
