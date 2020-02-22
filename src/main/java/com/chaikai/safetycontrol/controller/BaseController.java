package com.chaikai.safetycontrol.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

@Controller
public class BaseController {

    @Value("${file.upload.path}")
    private String distPath;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/toPage")
    public String toPage(HttpServletRequest request,HttpServletResponse response) throws IOException {
        Map<String,String[]> map = request.getParameterMap();
        response.setCharacterEncoding("utf-8");
        response.getWriter().write(String.valueOf(map));
        String url = request.getParameter("url");
        return url;
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String fileUpload(@RequestParam("file")MultipartFile srcFile) {
        if(srcFile.isEmpty()) {
            return "error";
        }
        try {
            String fileName = srcFile.getOriginalFilename();
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            fileName = UUID.randomUUID().toString().replace("-","") +  suffixName;
            File destFile = new File(distPath+fileName);
            srcFile.transferTo(destFile);
            return distPath+fileName;
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }
}
