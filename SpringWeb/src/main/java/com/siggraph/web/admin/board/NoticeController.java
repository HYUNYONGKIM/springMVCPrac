package com.siggraph.web.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController {
	
	private String prefix = "admin.board.notice.";
	
	@RequestMapping("list")
	public String list() {
		
		return prefix + "list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		
		return prefix + "detail";
	}
	
	@RequestMapping("reg")
	public String reg() {
		
		return prefix + "reg";
	}
}
