package com.example.malldemo.controller;

import com.example.malldemo.common.api.CommonResult;
import com.example.malldemo.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 会员登陆注册管理Controller
 */
    @Controller
    @Api(tags = "UmsMemberController", description = "会员登陆注册管理")
    @RequestMapping("/sso")
public class UmsMemberController {
        @Autowired
        private UmsMemberService memberService;

        @ApiOperation("获取验证码")
        @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
        @ResponseBody
        public CommonResult getAuthCode(@RequestParam String telephone) {
            return memberService.generateAuthCode(telephone);
        }

        @ApiOperation("判断验证码和手机号码是否匹配")
        @RequestMapping(value = "/verifyAuthCode", method = RequestMethod.POST)
        @ResponseBody
        public CommonResult updatePassword(@RequestParam String telephone,
                                           @RequestParam String authCode) {
            return memberService.verifyAuthCode(telephone, authCode);
        }
}
