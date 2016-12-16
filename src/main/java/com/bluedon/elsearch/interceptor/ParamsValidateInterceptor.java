package com.bluedon.elsearch.interceptor;

import com.bluedon.elsearch.constant.ExceptionDefinition;
import com.bluedon.elsearch.constant.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 参数校验拦截器
 * Created by xyy on 2016/12/16.
 */
public class ParamsValidateInterceptor extends HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String params = request.getParameter("params");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        Response packet =null;
        try{
            if(StringUtils.isEmpty(params)){
                packet = new Response();
                packet.setExCode(ExceptionDefinition.PARAM_EX);
                packet.setExMsg(ExceptionDefinition.PARAM_EXMSG);
                out = response.getWriter();
                ObjectMapper mapper = new ObjectMapper();
                out.write(mapper.writeValueAsString(packet));
                return false;
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(out != null){
                out.close();
            }
        }
        return true;
    }
}
