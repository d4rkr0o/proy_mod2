package _web_2d_inf._templates;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _header_jspx extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/xml;charset=UTF-8");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _header_jspx page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {

      out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");

      out.write( "<html" + " xmlns=\"" + "http://www.w3.org/1999/xhtml"+ "\"" + " xmlns:ui=\"" + "http://java.sun.com/jsf/facelets"+ "\"" +">");
      out.write( "<table" + " style=\"" + "width:100%"+ "\"" +">");
      out.write( "<tr>");
      out.write( "<td" + " style=\"" + "width:30%"+ "\"" +">");
      {
        com.icesoft.faces.component.GraphicImageTag __jsp_taghandler_1=(com.icesoft.faces.component.GraphicImageTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.GraphicImageTag.class,"com.icesoft.faces.component.GraphicImageTag style url");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setStyle("border:none;float:left");
        __jsp_taghandler_1.setUrl("resources/images/nafinsa.png");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write( "</td>");
      out.write( "<td" + " style=\"" + "width:70%"+ "\"" +">");
      {
        com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_2=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setValue("México, D.F. 1 de Octubre del 2013 17:22:25");
        __jsp_taghandler_2.setStyleClass("fecha-header");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write( "<br/>\r\n");
      out.write( "<br/>\r\n");
      {
        com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_3=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setValue("L.A. Laura Santos Mora");
        __jsp_taghandler_3.setStyleClass("letra-negra");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write( "<br/>\r\n");
      {
        com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_4=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value styleClass");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setValue("Operador Control de Garantias");
        __jsp_taghandler_4.setStyleClass("letra-azul");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write( "<br/>\r\n");
      out.write( "<br/>\r\n");
      out.write( "<ui:include"+ " src=\"" + "/WEB-INF/templates/menu.jspx"+ "\"" +"/>");
      out.write( "</td>");
      out.write( "</tr>");
      out.write( "</table>");
      out.write( "</html>");

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
}
