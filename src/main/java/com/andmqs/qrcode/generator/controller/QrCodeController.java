package com.andmqs.qrcode.generator.controller;

import com.andmqs.qrcode.generator.dtos.qrcode.QrCodeGenerateRequestDTO;
import com.andmqs.qrcode.generator.dtos.qrcode.QrCodeGenerateResponseDTO;
import com.andmqs.qrcode.generator.service.QrCodeGeneratorService;
import com.google.zxing.WriterException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService qrCodeGeneratorService) {
        this.qrCodeGeneratorService = qrCodeGeneratorService;
    }

    @PostMapping
    public ResponseEntity <QrCodeGenerateResponseDTO> generateQrCOde(@RequestBody QrCodeGenerateRequestDTO requestDTO) {
        try{
            QrCodeGenerateResponseDTO response =this.qrCodeGeneratorService.generateAndUploadQrCode(requestDTO.text());
                    return ResponseEntity.ok(response);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }

    }
}
