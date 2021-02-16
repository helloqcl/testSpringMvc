package personal.qcl.test.testSpringMVC.eden;

import org.springframework.http.HttpRequest;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import personal.qcl.test.testSpringMVC.entities.People;
import sun.awt.ModalExclude;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller("testController1")
public class TestController1 {
    //return modeAndView
    @RequestMapping("/quick05")

    public String quickstart05(String pInform, MultipartFile upLoadFile) throws IOException {
        System.out.println(pInform);
        System.out.println(upLoadFile);
        String originalFilename =  upLoadFile.getOriginalFilename();
        upLoadFile.transferTo(new File("C:\\upload\\"+originalFilename));

        return "/test/success.jsp";
    }

    @RequestMapping("/quick04")
    @ResponseBody
    public String quickstart04() {

        return "hello qcl";
    }

    @RequestMapping("/quick03")
    @ResponseBody
    public void quickstart03(int id, String name) {
        System.out.println(id);
        System.out.println(name);
    }

    @RequestMapping("/quick02")
    @ResponseBody
    public People quickstart02(HttpServletRequest request) {
        People people = new People(100, true, "张三");
        return people;
    }

    @RequestMapping("/quick01")
    public ModelAndView quickstart01(HttpServletRequest request) {
        request.setAttribute("t", "123");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.jsp");
        modelAndView.addObject("t1", "hello qcl..");
        return modelAndView;
    }

    @RequestMapping("/quick")
    public ModelAndView quickstart(HttpServletRequest request) {
        request.setAttribute("t", "123");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/test/failed.jsp");
        modelAndView.addObject("t1", "i am is god.a ha ");
        return modelAndView;
    }
}
