package com.explore.model.member;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 认证表
 * </p>
 *
 * @author wangtao
 * @since 2022-10-27
 */
@TableName("t_m_oauth")
public class Oauth implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 编号
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 用户唯一标识
     */
      private String uid;

      /**
     * 第三方登录唯一ID
     */
      private String oauthId;

      /**
     * 第三方登录平台标识
     */
      private String oauthType;

      /**
     * 密码凭证
     */
      private String credential;

      /**
     * 昵称
     */
      private String nickname;

      /**
     * 图像
     */
      private String avatar;

      /**
     * 盐
     */
      private String passwd;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getUid() {
        return uid;
    }

      public void setUid(String uid) {
          this.uid = uid;
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
    
    public String getCredential() {
        return credential;
    }

      public void setCredential(String credential) {
          this.credential = credential;
      }
    
    public String getNickname() {
        return nickname;
    }

      public void setNickname(String nickname) {
          this.nickname = nickname;
      }
    
    public String getAvatar() {
        return avatar;
    }

      public void setAvatar(String avatar) {
          this.avatar = avatar;
      }
    
    public String getPasswd() {
        return passwd;
    }

      public void setPasswd(String passwd) {
          this.passwd = passwd;
      }

    @Override
    public String toString() {
        return "Oauth{" +
              "id=" + id +
                  ", uid=" + uid +
                  ", oauthId=" + oauthId +
                  ", oauthType=" + oauthType +
                  ", credential=" + credential +
                  ", nickname=" + nickname +
                  ", avatar=" + avatar +
                  ", passwd=" + passwd +
              "}";
    }
}
