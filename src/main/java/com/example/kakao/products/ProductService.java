package com.example.kakao.products;

import com.example.kakao._core.errors.exception.Exception404;
import com.example.kakao.users.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductJPARepository productRepository;

    public ProductResponse.FindByIdDTO findById(int id) {
        Product productPS = productRepository.findById(id).orElseThrow(
                () -> new Exception404("해당 상품을 찾을 수 없습니다 : "+id)
        );
        return new ProductResponse.FindByIdDTO(productPS);
    }

    public ProductResponse.FindAllDTO findAll(int page) {
        Pageable pageable = PageRequest.of(page,9);
        Page<Product> pageContent = productRepository.findAll(pageable);
        return new ProductResponse.FindAllDTO(pageContent.getContent());
    }
}
