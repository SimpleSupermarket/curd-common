package org.simplesupermarket.web.mvc.datahandle;


import org.simplesupermarket.web.mvc.datahandle.standard.StandardCodeBuilder;
import org.simplesupermarket.web.auth.AuthUserDetail;

/**
 * @author 董文强
 * @version 1.0
 * @date 2018年12月07日
 */
public interface CodeBuilder {

    default public CodeBuilder createStandardCodeBuild(){
           return new StandardCodeBuilder();
    }
    CodeBuilder setName(String name);
    CodeBuilder setUser(AuthUserDetail user);
    CodeBuilder setLength(Integer length);
    String build();

}
