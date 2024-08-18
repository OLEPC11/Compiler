package AstClasses;

import VisitParserTree.Node;
import com.company.Main;

import java.util.ArrayList;

public class HtmlElements extends Node {
    ArrayList<HtmlElement>htmlElements=new ArrayList<>();

    public ArrayList<HtmlElement> getHtmlElements() {
        return htmlElements;
    }

    public void setHtmlElements(ArrayList<HtmlElement> htmlElements) {
        this.htmlElements = htmlElements;
    }
    public void add(HtmlElement htmlElement){
        htmlElements.add(htmlElement);
    }
    public void PrintAst(){
        if(htmlElements!=null){
            //System.out.println("*****HtmlElements*****");
            for (HtmlElement htmlElement : htmlElements) {
                htmlElement.PrintAst();
            }
        }
    }
    StringBuilder stringBuilder=new StringBuilder();
    String value;
    public String getValue(){
        if(htmlElements!=null){
            for (HtmlElement htmlElement : htmlElements) {
                stringBuilder.append(htmlElement.getValue());
            }
            value=stringBuilder.toString();
            return value;
        }
        return "No Value";
    }
    StringBuilder stringBuilder1=new StringBuilder();
    String value1;
//    public String CodeGen()
//    {
//        if (htmlElements != null) {
//            for (HtmlElement htmlElement : htmlElements) {
//                stringBuilder1.append(htmlElement.CodeGen());
//            }
//            value1 = stringBuilder1.toString();
//            return value1;
//        }return " ";
//    }
StringBuilder stringBuilder2=new StringBuilder();

    public String CodeGen() {
        String s = " ";
        for (HtmlElement htmlElement : htmlElements) {
            for (HtmlElement htmlElement1 : htmlElement.htmlContent.htmlElements)
                for (HtmlElement htmlElement2 : htmlElement1.htmlContent.htmlElements)
                    s = htmlElement2.htmlAttributes.get(0).htmlAttributeValue.objectExpressionSequence.expressionSequence.getValue();
        }
        if (htmlElements != null) {
            for (HtmlElement htmlElement : htmlElements) {
                for (HtmlElement htmlElement1 : htmlElement.htmlContent.htmlElements) {
                    for (HtmlElement htmlElement2 : htmlElement1.htmlContent.htmlElements) {
                        if (htmlElement2.htmlTagName != null) {
                            if (htmlElement2.htmlTagName.Identifier != null) {
                                if (htmlElement2.htmlTagName.Identifier.replaceAll(" ", "").equals("productList")) {
                                    stringBuilder.append("\nfunction render" + htmlElement2.htmlTagName.Identifier + "() {\n" +
                                            "    const " + htmlElement2.htmlTagName.Identifier + " = document.getElementById('" + htmlElement2.htmlTagName.Identifier + "');\n" +
                                            "    productList.innerHTML = ''; \n" +
                                            "    " + s + ".forEach(product => {\n" +
                                            "        const listItem = document.createElement('div');\n" +
                                            "        listItem.textContent = product.name;\n" +
                                            "        " + htmlElement2.htmlTagName.Identifier + ".appendChild(listItem);\n" +
                                            "    });\n" +
                                            "}\n render" + htmlElement2.htmlTagName.Identifier + "();");
                                } else if (htmlElement2.htmlTagName.Identifier.replaceAll(" ", "").equals("ProductView")) {
                                    if (htmlElement2.htmlAttributes != null)
                                        for (HtmlAttribute htmlAttribute : htmlElement2.htmlAttributes)
                                            if (htmlAttribute.htmlAttributeName != null)
                                                if (htmlAttribute.htmlAttributeName.Identifiers != null) {
                                                    for (String identifier : htmlAttribute.htmlAttributeName.Identifiers)
                                                        stringBuilder.append("function render" + htmlElement2.htmlTagName.Identifier + "(" + identifier + ") { \n" +
                                                                "    const productView = document.getElementById('ProductView');\n" +
                                                                "    productView.innerHTML = '';\n" +
                                                                "    productView.innerHTML = `\n" +
                                                                "        <h2>${" + identifier + ".name}</h2>\n" +
                                                                "        <p>${" + identifier + ".details}</p>\n" +
                                                                "        <img src=\"${" + identifier + ".url}\" alt=\"${" + identifier + ".name}\">\n" +
                                                                "    `;\n" +
                                                                "}\n document.getElementById('productList').addEventListener('click', function(event) {\n" +
                                                                "    const selectedProduct = " + s + ".find(" + identifier
                                                                + "=> " + identifier + ".name === event.target.textContent);\n" +
                                                                "    if (selectedProduct) {\n" +
                                                                "        render" + htmlElement2.htmlTagName.Identifier + "(selectedProduct); // Correctly pass the selected product to the function\n" +
                                                                "    }\n" +
                                                                "});\n renderProductView(" + s + "[" + Main.useCase + "]);\n"
                                                        );
                                                }
                                }


                            }
                        }
                    }
                    if (htmlElement1.htmlTagStartName != null) {
                        if (htmlElement1.htmlTagStartName.htmlTagName != null)
                            if (htmlElement1.htmlTagStartName.htmlTagName.button != null)
                                if (htmlElement1.htmlTagStartName.htmlTagName.button.replaceAll(" ", "").equals("button")) {
                                    for (HtmlChardata h : htmlElement1.htmlContent.htmlChardatas)
                                        stringBuilder.append("function " + "goToSecondScreen" + "() {\n" +
                                                "    window.location.href = 'index2.html'; \n" +
                                                "}\n" +

                                                "document.getElementById('" + "goToSecondScreen" + "').addEventListener('click', goToSecondScreen);\n"
                                               );
                                }

                    }
                }

            }
            for (HtmlElement htmlElement : htmlElements) {
                for (HtmlElement htmlElement1 : htmlElement.htmlContent.htmlElements) {
                    for (HtmlElement htmlElement2 : htmlElement1.htmlContent.htmlElements) {
                        if (htmlElement2.htmlTagName != null) {
                            if (htmlElement2.htmlTagName.Identifier != null) {
                                if (htmlElement2.htmlTagName.Identifier.replaceAll(" ", "").equals("productList")) {
                                    stringBuilder.append("<!DOCTYPE html>\n" +
                                            "<html lang=\"en\">\n" +
                                            "<head>\n" +
                                            "    <meta charset=\"UTF-8\">\n" +
                                            "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                                            "    <title>" + htmlElement2.htmlTagName.Identifier + "</title>\n" +
                                            "    <link >\n" +
                                            "    <style> img ");
                                    stringBuilder1.append("<div id=\""+htmlElement2.htmlTagName.Identifier +"\">\n" +
                                            "            \n" +
                                            "        </div>\n" +
                                            "       ");
                                    if (htmlElement1.htmlAttributes != null) {
                                        for (HtmlAttribute att : htmlElement1.htmlAttributes) {
                                            {
                                                if (att.style != null) {
                                                    stringBuilder.append(att.style.getValue()).append("\n");
                                                }
                                            }
                                        }
                                    }
                                }
                                else if (htmlElement2.htmlTagName.Identifier.replaceAll(" ", "").equals("ProductView")) {
                                    {stringBuilder1.append(" <div id=\""+htmlElement2.htmlTagName.Identifier+"\" style=\"height: 200px;width: 500px; \">\n" +
                                            "            \n" +
                                            "        </div>\n" +
                                            "    </div>\n" +
                                            "    ");
                                    }
                                }

                            }
                        }


                    }
                    if (htmlElement1.htmlTagStartName != null) {
                        if (htmlElement1.htmlTagStartName.htmlTagName != null)
                            if (htmlElement1.htmlTagStartName.htmlTagName.button != null)
                                if (htmlElement1.htmlTagStartName.htmlTagName.button.replaceAll(" ", "").equals("button")) {
                                    if (htmlElement1.htmlAttributes != null) {

                                        stringBuilder.append(htmlElement1.htmlTagStartName.htmlTagName.button);
                                        for (HtmlAttribute att : htmlElement1.htmlAttributes) {
                                            {
                                                if (att.style != null) {
                                                    stringBuilder.append(att.style.getValue());
                                                }
                                            }
                                        }
                                        stringBuilder.append("</style>\n" +
                                                "</head>\n" +
                                                "<body>");
                                        stringBuilder2.append("<"+htmlElement1.htmlTagStartName.htmlTagName.button+" id=\"goToSecondScreen\">Go to Second Screen</button>\n" +
                                                "\n" +
                                                "    <script type=\"module\" src=\"script.js\"></script>\n" +
                                                "</body>\n" +
                                                "</html>");
                                    }
                                }


                    }
                }

            }
            value = stringBuilder.toString()+stringBuilder1.toString()+stringBuilder2.toString();
            return value;
        }
        return " ";
    }
}