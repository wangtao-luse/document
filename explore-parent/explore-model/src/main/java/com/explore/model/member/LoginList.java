package com.explore.model.member;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 登录记录表
 * </p>
 *
 * @author wangtao
 * @since 2022-10-27
 */
@TableName("t_m_login_list")
public class LoginList implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 编号
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 用户唯一标识
     */
      private String oauthId;

      /**
     * 登录平台标识
     */
      private String oauthType;

      /**
     * 登录时间
     */
      private Long loginAt;

      /**
     * 登录ip
     */
      private String loginIp;

      /**
     * 登录地
     */
      private String loginAddr;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getOauthId() {
        return oauthId;
    }

      public void setOauthId(String oauthId) {
          this.oauthId = oauthId;
      }
    
    public String getOauthType() {
        return oauthType;
    }

      public void setOauthType(String oauthType) {
          this.oauthType = oauthType;
      }
    
    public Long getLoginAt() {
        return loginAt;
    }

      public void setLoginAt(Long loginAt) {
          this.loginAt = loginAt;
      }
    
    public String getLoginIp() {
        return loginIp;
    }

      public void setLoginIp(String loginIp) {
          this.loginIp = loginIp;
      }
    
    public String getLoginAddr() {
        return loginAddr;
    }

      public void setLoginAddr(String loginAddr) {
          this.loginAddr = loginAddr;
      }

    @Override
    public String toString() {
        return "LoginList{" +
              "id=" + id +
                  ", oauthId=" + oauthId +
                  ", oauthType=" + oauthType +
                  ", loginAt=" + loginAt +
                  ", loginIp=" + loginIp +
                  ", loginAddr=" + loginAddr +
              "}";
    }
}
