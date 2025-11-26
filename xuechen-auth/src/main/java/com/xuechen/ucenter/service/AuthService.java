package com.xuechen.ucenter.service;

import com.xuechen.ucenter.model.dto.XcUserExt;
import com.xuechen.ucenter.model.dto.AuthParamsDto;
import com.xuechen.ucenter.model.po.XcUser;

/**
 * @description 认证service
 * @author Mr.M
 * @date 2022/9/29 12:10
 * @version 1.0
 */
public interface AuthService {

   /**
    * @description 认证方法
    * @param authParamsDto 认证参数
    * @return com.xuecheng.ucenter.model.po.XcUser 用户信息
    * @author Mr.M
    * @date 2022/9/29 12:11
   */
   XcUserExt execute(AuthParamsDto authParamsDto);

}