package com.lcwd.todo.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;

@RestController
@RequestMapping("/file")
public class FileController {

    Logger logger = LoggerFactory.getLogger(FileController.class);
    @PostMapping("/upload")
    public String uploadSingle(
            @RequestParam("image")MultipartFile file
    )
    {
        logger.info("Name : {}",file.getName());// key name
        logger.info("ContentType : {}",file.getContentType()); // png/jpeg
        logger.info("Original file name : {}",file.getOriginalFilename()); // original file name
        logger.info("File size : {}",file.getSize()); // file size in bytes

//        InputStream inputStream =  file.getInputStream();
//        FileOutputStream fileOutputStream = new FileOutputStream("data.png");
//        byte data[] = new byte[inputStream.available()];
//        fileOutputStream.write(data);

         // file.getInputStream()



        return "File Test";
    }

    @PostMapping("/multiple")
    public String uploadMultiple(
        @RequestParam("files") MultipartFile[] files
    )
    {
        Arrays.stream(files).forEach(file->{
            logger.info("File name : {}",file.getOriginalFilename());
            logger.info("Content type:{}",file.getContentType());
            logger.info("File size : {}",file.getSize());
            System.out.println("++++++++++++++++");
            // CALL SERVICE TO UPLOAD FILES : AND PASS FILE OBJECT



        });
        return " Handling multiple files";
    }

    // serving image file in response

    @GetMapping("/serve-image")
    public void serveImageHandler(HttpServletResponse response)
    {
        // image
        try{
            InputStream fileInputStream = new FileInputStream("image/pokemon.jpg");
            response.setContentType(MediaType.IMAGE_JPEG_VALUE);
            StreamUtils.copy(fileInputStream, response.getOutputStream());

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
