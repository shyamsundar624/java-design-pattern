package com.shyam.design;

public class TestCompositePattern {
public static void main(String[] args) {
	HtmlTag htmlTag = new HtmlParentElement("html");
	htmlTag.setStartTag("<html>");
	htmlTag.setEndTag("</html>");
	
	HtmlTag head = new HtmlParentElement("head");
	head.setStartTag("<head>");
	head.setEndTag("</head>");
	
	HtmlTag body = new HtmlParentElement("body");
	body.setStartTag("<body>");
	body.setEndTag("</body>");
	
	HtmlTag title = new HtmlElement("title");
	title.setStartTag("<title>");
	title.setEndTag("</title>");
	title.setTagBody("Composite Pattern Example");
	
	HtmlTag div = new HtmlElement("div");
	div.setStartTag("<div>");
	div.setEndTag("</div>");
	div.setTagBody("This is div tag");
	
	head.addChildTag(title);
	body.addChildTag(div);
	htmlTag.addChildTag(head);
	htmlTag.addChildTag(body);
	
	htmlTag.generateHtml();
	
}
}
