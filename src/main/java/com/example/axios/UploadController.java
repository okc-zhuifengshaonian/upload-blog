package com.example.axios;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("upload")
@CrossOrigin   //解决跨域请求问题
public class UploadController {
    @PostMapping("blog")
    public String uploadImage(@RequestParam("file") MultipartFile image) throws IOException {
        // 获取文件名称
        String fileName = image.getOriginalFilename();
        //设置文件所保存的路径
        File savedPath = new File("C:\\Users\\86134\\Desktop\\", fileName);
        //调用 MultipartFile 类的 transferTo() 方法，将上传的文件内容保存到目标文件中
        image.transferTo(savedPath);

        //给前端返回文件名称
        return savedPath.toString();
    }
}
