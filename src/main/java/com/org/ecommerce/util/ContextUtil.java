package com.org.ecommerce.util;

import com.org.ecommerce.Application;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@RequiredArgsConstructor
@Data
public class ContextUtil {

    private final Application application;

    private HttpServletRequest getRequest() {
        return getAttributes().getRequest();
    }

    private HttpServletResponse getResponse() {
        return getAttributes().getResponse();
    }

    private ServletRequestAttributes getAttributes() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
    }
}
