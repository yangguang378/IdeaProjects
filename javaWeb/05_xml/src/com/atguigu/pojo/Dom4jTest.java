package com.atguigu.pojo;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class Dom4jTest {
    @Test
    public void test1() throws Exception {
        // 创建一个SaxReader输入流，去读取 xml配置文件，生成Document对象
        SAXReader saxReader = new SAXReader();

        SAXReader saxReader1 = new SAXReader();
        Dou document = saxReader.read("src/books.xml");


        for (Element book : books) {
// 测试
// System.out.println(book.asXML());
// 拿到 book 下面的 name 元素对象
            Element nameElement = book.element("name");
// 拿到 book 下面的 price 元素对象
            Element priceElement = book.element("price");
// 拿到 book 下面的 author 元素对象
            Element authorElement = book.element("author");
// 再通过 getText() 方法拿到起始标签和结束标签之间的文本内容
            System.out.println("书名" + nameElement.getText() + " , 价格:"
                    + priceElement.getText() + ", 作者： " + authorElement.getText());
        }
        System.out.println(document);
    }

}
