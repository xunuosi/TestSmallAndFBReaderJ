package com.test.xns.testrxjava;

/**
 * 注册请求的实体类
 */

class RegisterRequest {

    private String m_user_name;
    private String m_user_password;

    public RegisterRequest() {
    }

    public RegisterRequest(String m_user_name, String m_user_password) {
        this.m_user_name = m_user_name;
        this.m_user_password = m_user_password;
    }

    public String getM_user_name() {
        return m_user_name;
    }

    public void setM_user_name(String m_user_name) {
        this.m_user_name = m_user_name;
    }

    public String getM_user_password() {
        return m_user_password;
    }

    public void setM_user_password(String m_user_password) {
        this.m_user_password = m_user_password;
    }
}
