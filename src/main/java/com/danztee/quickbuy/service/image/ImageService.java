package com.danztee.quickbuy.service.image;

import com.danztee.quickbuy.model.Image;
import com.danztee.quickbuy.repository.CategoryRepository;
import com.danztee.quickbuy.repository.ImageRepository;
import com.danztee.quickbuy.service.product.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ImageService implements IImageService {
    private final ImageRepository imageRepository;
    private final IProductService productService;

    @Override
    public Image getImageById(Long id) {
        return null;
    }

    @Override
    public void deleteImageById(Long id) {

    }

    @Override
    public Image saveImage(MultipartFile file, Long productId) {
        return null;
    }

    @Override
    public void updateImage(MultipartFile file, Long productId) {

    }
}
