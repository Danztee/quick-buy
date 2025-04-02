package com.danztee.quickbuy.controller;

import com.danztee.quickbuy.dto.ImageDTO;
import com.danztee.quickbuy.response.ApiResponse;
import com.danztee.quickbuy.service.image.IImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("{api.prefix}/images")
public class ImageController {
    private final IImageService imageService;

    @PostMapping("upload")
    public ResponseEntity<ApiResponse> saveImages(@RequestParam List<MultipartFile> files, @RequestParam Long projectId) {
        try {
            List<ImageDTO> images = imageService.saveImages(files, projectId);
            return ResponseEntity.ok(new ApiResponse("Upload successful", images));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse("Upload failed", e.getMessage()));
        }
    }
}
