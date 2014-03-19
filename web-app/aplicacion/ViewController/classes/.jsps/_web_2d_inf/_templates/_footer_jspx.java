package _web_2d_inf._templates;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _footer_jspx extends com.orionserver.http.OrionHttpJspPage {


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
    _footer_jspx page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {

      out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");

      out.write( "<html" + " xmlns=\"" + "http://www.w3.org/1999/xhtml"+ "\"" + " xmlns:ui=\"" + "http://java.sun.com/jsf/facelets"+ "\"" +">");
      {
        com.icesoft.faces.component.FormTag __jsp_taghandler_1=(com.icesoft.faces.component.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.FormTag.class,"com.icesoft.faces.component.FormTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          out.write( "<div" + " class=\"" + "alinear-izquierda"+ "\"" +">");
          {
            com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_2=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag value styleClass");
            __jsp_taghandler_2.setParent(__jsp_taghandler_1);
            __jsp_taghandler_2.setValue("Acerca de Nafinsa");
            __jsp_taghandler_2.setStyleClass("letra-blanca");
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
          }
          {
            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_3=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
            __jsp_taghandler_3.setParent(__jsp_taghandler_1);
            __jsp_taghandler_3.setValue("  |  ");
            __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
            if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
          }
          {
            com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_4=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag value styleClass");
            __jsp_taghandler_4.setParent(__jsp_taghandler_1);
            __jsp_taghandler_4.setValue("Mapa de Sitio");
            __jsp_taghandler_4.setStyleClass("letra-blanca");
            __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
            if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
          }
          {
            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_5=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
            __jsp_taghandler_5.setParent(__jsp_taghandler_1);
            __jsp_taghandler_5.setValue("  |  ");
            __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
            if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
          }
          {
            com.sun.faces.taglib.html_basic.CommandLinkTag __jsp_taghandler_6=(com.sun.faces.taglib.html_basic.CommandLinkTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.CommandLinkTag.class,"com.sun.faces.taglib.html_basic.CommandLinkTag value styleClass");
            __jsp_taghandler_6.setParent(__jsp_taghandler_1);
            __jsp_taghandler_6.setValue("Aviso de Privacidad");
            __jsp_taghandler_6.setStyleClass("letra-blanca");
            __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
            if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
          }
          out.write( "</div>");
          out.write( "<br/>\r\n");
          out.write( "<br/>\r\n");
          {
            com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_7=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
            __jsp_taghandler_7.setParent(__jsp_taghandler_1);
            __jsp_taghandler_7.setValue("Todos los derechos reservados Nacional Financiera 2012 Av. Insurgentes Sur 1971 , Col. Guadalupe Inn , C.P. 01020 México D.F.");
            __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
            if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
          }
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
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
