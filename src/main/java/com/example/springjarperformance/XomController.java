package com.example.springjarperformance;

import nu.xom.Document;
import org.springframework.web.bind.annotation.GetMapping;
import nu.xom.Element;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XomController {

    @GetMapping("/xom")
    public String getXom() {
        Element root = new Element("root");
        root.appendChild("Hello World!");
        Document doc = new Document(root);
        return doc.toXML();
    }
}
