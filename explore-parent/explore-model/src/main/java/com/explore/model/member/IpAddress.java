package com.explore.model.member;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * ip记录表
 * </p>
 *
 * @author wangtao
 * @since 2022-10-27
 */
@TableName("t_m_ip_address")
public class IpAddress implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 编号
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * ip地址
     */
      private String ip;

      /**
     * 网络服务供应商
     */
      private String isp;

      /**
     * 国家编号
     */
      private String countryCode;

      /**
     * 国家名称
     */
      private String country;

      /**
     * 区名称
     */
      private String area;

      /**
     * 纬度
     */
      private Float latitude;

      /**
     * 经度
     */
      private Float longitude;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getIp() {
        return ip;
    }

      public void setIp(String ip) {
          this.ip = ip;
      }
    
    public String getIsp() {
        return isp;
    }

      public void setIsp(String isp) {
          this.isp = isp;
      }
    
    public String getCountryCode() {
        return countryCode;
    }

      public void setCountryCode(String countryCode) {
          this.countryCode = countryCode;
      }
    
    public String getCountry() {
        return country;
    }

      public void setCountry(String country) {
          this.country = country;
      }
    
    public String getArea() {
        return area;
    }

      public void setArea(String area) {
          this.area = area;
      }
    
    public Float getLatitude() {
        return latitude;
    }

      public void setLatitude(Float latitude) {
          this.latitude = latitude;
      }
    
    public Float getLongitude() {
        return longitude;
    }

      public void setLongitude(Float longitude) {
          this.longitude = longitude;
      }

    @Override
    public String toString() {
        return "IpAddress{" +
              "id=" + id +
                  ", ip=" + ip +
                  ", isp=" + isp +
                  ", countryCode=" + countryCode +
                  ", country=" + country +
                  ", area=" + area +
                  ", latitude=" + latitude +
                  ", longitude=" + longitude +
              "}";
    }
}
