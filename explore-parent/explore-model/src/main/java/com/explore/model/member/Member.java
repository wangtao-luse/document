package com.explore.model.member;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wangtao
 * @since 2022-10-27
 */
@TableName("t_m_member")
public class Member implements Serializable {

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
     * 创建日期
     */
      private Long createDate;

      /**
     * Ip地址
     */
      private String ip;

      /**
     * 上次登录时间
     */
      private Long lastTime;

      /**
     * 用户状态(0:禁用；1:正常)
     */
      private String status;

    
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
    
    public Long getCreateDate() {
        return createDate;
    }

      public void setCreateDate(Long createDate) {
          this.createDate = createDate;
      }
    
    public String getIp() {
        return ip;
    }

      public void setIp(String ip) {
          this.ip = ip;
      }
    
    public Long getLastTime() {
        return lastTime;
    }

      public void setLastTime(Long lastTime) {
          this.lastTime = lastTime;
      }
    
    public String getStatus() {
        return status;
    }

      public void setStatus(String status) {
          this.status = status;
      }

    @Override
    public String toString() {
        return "Member{" +
              "id=" + id +
                  ", uid=" + uid +
                  ", createDate=" + createDate +
                  ", ip=" + ip +
                  ", lastTime=" + lastTime +
                  ", status=" + status +
              "}";
    }
}
