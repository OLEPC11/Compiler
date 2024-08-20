package AstClasses;

import VisitParserTree.Node;

import java.util.ArrayList;

public class HtmlElement extends Node {
    HtmlTagStartName htmlTagStartName;
    ArrayList<HtmlAttribute> htmlAttributes = new ArrayList<>();
    HtmlContent htmlContent;
    HtmlTagClosingName htmlTagClosingName;
    HtmlTagName htmlTagName;

    public HtmlTagStartName getHtmlTagStartName() {
        return htmlTagStartName;
    }

    public void setHtmlTagStartName(HtmlTagStartName htmlTagStartName) {
        this.htmlTagStartName = htmlTagStartName;
    }

    public ArrayList<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(ArrayList<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public HtmlTagClosingName getHtmlTagClosingName() {
        return htmlTagClosingName;
    }

    public void setHtmlTagClosingName(HtmlTagClosingName htmlTagClosingName) {
        this.htmlTagClosingName = htmlTagClosingName;
    }

    public HtmlTagName getHtmlTagName() {
        return htmlTagName;
    }

    public void setHtmlTagName(HtmlTagName htmlTagName) {
        this.htmlTagName = htmlTagName;
    }

    public void add(HtmlAttribute htmlAttribute) {
        htmlAttributes.add(htmlAttribute);
    }

    public void PrintAst() {
        //setScopeID(getCurrentScope().getId());
        //System.out.println("****HtmlElement****");
        if (htmlTagStartName != null) {
            System.out.print("<" + " ");
            htmlTagStartName.PrintAst();
            System.out.println();
        }
        if (htmlTagName != null) {
            System.out.print("<" + " ");
            htmlTagName.PrintAst();
            System.out.println();
        }
        if (htmlAttributes != null) {
            for (HtmlAttribute htmlAttribute : htmlAttributes) {
                htmlAttribute.PrintAst();
                if (htmlContent == null) {
                    System.out.print("/>" + " ");
                }
                System.out.println();
            }
        }
        if (htmlContent != null) {
            htmlContent.PrintAst();
            if (htmlTagClosingName == null) {
                System.out.print("/>" + " ");
            }
        }
        if (htmlTagClosingName != null) {
            System.out.println();
            System.out.print("</" + " ");
            htmlTagClosingName.PrintAst();
            System.out.print(">" + " ");
            System.out.println();
        }
    }

    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder();
    String value0;
    String value1;
    String value2;
    String value3;
    String value4;

    public String getValue() {
        if (htmlTagStartName != null) {
            value0 = htmlTagStartName.getValue();
        }
        if (htmlTagName != null) {
            value1 = htmlTagName.getValue();
        }
        if (htmlAttributes != null) {
            for (HtmlAttribute htmlAttribute : htmlAttributes) {
                stringBuilder.append(htmlAttribute.getValue());
            }
            value2 = stringBuilder.toString();
        }
        if (htmlContent != null) {
            value3 = htmlContent.getValue();
        }

        if (htmlTagClosingName != null) {
            value4 = htmlTagClosingName.getValue();
        }
        return value0 + " " + value1 + " " + value2 + " " + value3 + " " + value4;
    }

    String v = " ";

    public String CodeGen() {

        if (htmlTagStartName != null) {

            if (htmlTagStartName.getHtmlTagName().Identifier != null) {
                if (!htmlTagStartName.getHtmlTagName().Identifier.equals("div")) {
                    if ((htmlTagStartName.getHtmlTagName().Identifier.equals("p") && htmlAttributes.size() == 0)||!htmlTagStartName.getHtmlTagName().Identifier.equals("p") ) {
                        stringBuilder2.append("<");
                        stringBuilder2.append(htmlTagStartName.CodeGen());
                        stringBuilder2.append(">" + " ");
                    }
                }
            } else if (htmlTagStartName.htmlTagName.button != null) {
                stringBuilder2.append("<");
                stringBuilder2.append(htmlTagStartName.CodeGen() + " id=");
                ;
            }

        }
        if (htmlTagName != null) {

            stringBuilder2.append("<");
            stringBuilder2.append(htmlTagName.CodeGen());

        }
        if (htmlAttributes != null) {


            for (HtmlAttribute htmlAttribute : htmlAttributes) {
                if (htmlAttribute.style == null) {
                    if (htmlTagName != null) {
                        if (htmlTagName.Identifier != null) {
                            if (htmlTagName.Identifier.equals("img")) {

                                stringBuilder2.append(htmlAttribute.CodeGen());
                            }
                        }
                    } else {
                        if (htmlTagStartName != null) {
                            if (htmlTagStartName.htmlTagName != null) {
                                if (htmlTagStartName.htmlTagName.Identifier != null) {
                                    if (htmlTagStartName.htmlTagName.Identifier.equals("p")) {
                                        stringBuilder2.append("<");
                                        stringBuilder2.append("p " + htmlAttribute.getValue());
                                        stringBuilder2.append(">" + " ");
                                    }
                                }else
                                    stringBuilder2.append("\"" + htmlAttribute.getValue() + "\"");
                            }
                        }
                        }
                } else {
                    if (htmlTagName != null) {
                        if (htmlTagName.Identifier != null) {
                            if (!htmlTagName.Identifier.equals("img")) {
                                stringBuilder2.append("style=" + "\"" + htmlAttribute.style.getValue() + "\"");
                            }
                        }
                    } else stringBuilder2.append("style=" + "\"" + htmlAttribute.style.getValue() + "\">");

                }
                if (htmlContent == null) {
                    stringBuilder2.append("/>" + "\n ");
                }
                if (htmlTagName != null) {
                    if (htmlTagName.Identifier != null) {
                        if (htmlTagName.Identifier.equals("img")) {
                        }

                    }
                }

            }
        }
        if (htmlContent != null) {
            stringBuilder2.append(htmlContent.CodeGen());
            if (htmlTagClosingName == null) {
                stringBuilder2.append("/>" + " \n");
            }
        }
        if (htmlTagClosingName != null) {
            if (htmlTagClosingName.getHtmlTagName().Identifier != null) {
                if (!htmlTagClosingName.htmlTagName.Identifier.equals("div")) {
                    stringBuilder2.append("</");
                    stringBuilder2.append(htmlTagClosingName.CodeGen());
                    stringBuilder2.append(">" + " \n");

                } else {
                    stringBuilder2.append("</body>\n" +
                            "</html>");
                }

            } else if (htmlTagClosingName.htmlTagName.button != null) {
                stringBuilder2.append("</");
                stringBuilder2.append(htmlTagClosingName.CodeGen());
                stringBuilder2.append(">" + " \n");
            }
        }
        v = stringBuilder2.toString();
        return v;
    }
}
