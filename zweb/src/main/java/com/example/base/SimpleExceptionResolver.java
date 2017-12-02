package com.example.base;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class SimpleExceptionResolver implements HandlerExceptionResolver {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "messageSource")
	MessageSource messageSource;

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		logger.error("例外をキャッチしました。", ex);
		ModelAndView mav = new ModelAndView();
		logger.error("システムエラーが発生しました。", ex);
		// JSPに表示するメッセージをセットします。
		mav.addObject("message", "システムエラーが発生しました。管理者にお問い合わせください。");
		// 遷移先のJSPを指定します。(error.jspに遷移します。)
		mav.setViewName("error");
		return mav;
	}
}