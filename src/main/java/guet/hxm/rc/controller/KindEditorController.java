package guet.hxm.rc.controller;
import guet.hxm.rc.entity.KindEditor;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.net.URLDecoder;

@Controller
public class KindEditorController {
    @GetMapping("/kindEditor")
    public String kindEditor(){
        return  "kindEditor";
    }

    @ResponseBody
    @RequestMapping("/kindEditor/image")
    public KindEditor image(@RequestParam("imgFile")MultipartFile file){
        String fileName = file.getOriginalFilename();
        String folderPath = ClassUtils.getDefaultClassLoader().getResource("").getPath()+ "static/kindEditor/image";
        KindEditor kindEditor = new KindEditor();
        try {
            folderPath = URLDecoder.decode(folderPath, "UTF-8");
            File folder = new File(folderPath);
            if(!folder.exists()){
                folder.mkdirs();
            }
            File dest = new File(folderPath +"/" + fileName);
            file.transferTo(dest);
            kindEditor.setError(0);
            kindEditor.setUrl("http://localhost:8080/rc/kindEditor/image/" + fileName);
        }catch (Exception e){
            kindEditor.setError(1);
        }
        return kindEditor;
    }

}
