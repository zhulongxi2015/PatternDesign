package com.code.pattern.facade;

/**
 * 门面对象
 */
public class RegisterFacade {
    public void register(){
        工商局 a=new 海淀区工商局();
        税务局 b= new 海淀税务局();
        质检局 c=new 海淀质检局();
        银行 d =new 中国工商银行();

        a.checkName();
        b.taxCertificate();
        c.orgCodeCertificate();
        d.openAccount();
    }
}
