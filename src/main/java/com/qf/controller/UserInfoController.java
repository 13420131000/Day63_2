package com.qf.controller;


import com.qf.dto.UserInfoDto;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import com.qf.tools.Page;
import com.qf.vo.UserInfoVo;
import com.qf.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "init")
    public String init(){
        System.out.println("helloworld");
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "loginCheck",method = RequestMethod.POST)
    public String loginCheck(@RequestBody UserInfo userInfo, HttpSession httpSession){
        Boolean flag = false;
        System.out.println("username="+userInfo.getUsername()+",password="+userInfo.getPassword());
        flag  = userInfoService.loginCheck(userInfo);
        httpSession.setAttribute("userInfo",userInfo);
        System.out.println(flag);
        return flag.toString();
    }

    @ResponseBody
    @RequestMapping(value = "findAll",method = RequestMethod.POST)
    public Object findAll(){
        List<UserInfo> userInfos = userInfoService.findAll();
        return userInfos;
    }

    @ResponseBody
    @RequestMapping(value = "getObjectById",method = RequestMethod.GET)
    public Object getObjectById(String userid){
        System.out.println(userid);
        UserInfo userInfo1 = userInfoService.getObjectById(Integer.parseInt(userid));
        System.out.println(userInfo1);
        return userInfo1;
    }

    @ResponseBody
    @RequestMapping(value = "updateUserInfo",method = RequestMethod.POST)
    public Integer updateObject(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        Integer integer = userInfoService.updateObject(userInfo);
        /*成功是1 失败是0*/
        return integer;
    }


    @RequestMapping(value = "deleteUserInfo",method = RequestMethod.GET)
    public String updateObject(String userid){
        System.out.println(userid);
        Integer integer = userInfoService.deleteObject(Integer.parseInt(userid));
        System.out.println(integer);
        /*成功是1 失败是0*/
        return "user";
    }
    @ResponseBody
    @RequestMapping(value = "addUserInfo",method = RequestMethod.POST)
    public Integer addUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        Integer integer = userInfoService.addObject(userInfo);
        System.out.println(integer);
        return integer;
    }
    @ResponseBody
    @RequestMapping(value = "searchUserInfoByWord",method = RequestMethod.POST)
    public Object searchUserInfoByWord(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        System.out.println(userInfoService.searchByWord(userInfo));
        return userInfoService.searchByWord(userInfo);
    }

    @ResponseBody
    @RequestMapping(value = "userInfoList",method = RequestMethod.POST)
    public Object searchUserInfoByWord(@RequestBody(required = false) UserInfoVo userInfoVo){
        /*System.out.println(userInfoVo);*/
        Integer count = userInfoService.getCount(userInfoVo);
        List<UserInfo> userInfoList = userInfoService.getUserInfosPageBy(userInfoVo);
        System.out.println(userInfoList);
        UserInfoDto dto = new UserInfoDto();

        Page page = new Page();
        page.setCurrentPage(userInfoVo.getPage().getCurrentPage());
        page.setTotalCount(count);


        dto.setPage(page);
        dto.setUserInfoList(userInfoList);
        return dto;
    }
    @ResponseBody
    @RequestMapping(value = "deleteUserByList",method = RequestMethod.POST)
    public Object deleteUserByList(@RequestBody UserVo userVo){
        System.out.println(userVo);
        return userInfoService.batchDel(userVo);
    }
}
