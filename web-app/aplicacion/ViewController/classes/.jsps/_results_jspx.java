
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _results_jspx extends com.orionserver.http.OrionHttpJspPage {


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
    _results_jspx page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {

      out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");

      out.write( "<ui:composition" + " template=\"" + "WEB-INF/templates/template.jspx"+ "\"" + " xmlns=\"" + "http://www.w3.org/1999/xhtml"+ "\"" + " xmlns:ui=\"" + "http://java.sun.com/jsf/facelets"+ "\"" +">");
      out.write( "<ui:define" + " name=\"" + "content"+ "\"" +">");
      {
        com.icesoft.faces.component.FormTag __jsp_taghandler_1=(com.icesoft.faces.component.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.FormTag.class,"com.icesoft.faces.component.FormTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          out.write( "<b>");
          out.write(__oracle_jsp_text[0]);
          out.write( "</b>");
          {
            com.sun.faces.taglib.html_basic.PanelGridTag __jsp_taghandler_2=(com.sun.faces.taglib.html_basic.PanelGridTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.PanelGridTag.class,"com.sun.faces.taglib.html_basic.PanelGridTag columns");
            __jsp_taghandler_2.setParent(__jsp_taghandler_1);
            __jsp_taghandler_2.setColumns("2");
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              {
                com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_3=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setValue("Valor a Registrar");
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
              }
              {
                com.icesoft.faces.component.InputTextTag __jsp_taghandler_4=(com.icesoft.faces.component.InputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.InputTextTag.class,"com.icesoft.faces.component.InputTextTag required value");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_taghandler_4.setRequired("true");
                __jsp_taghandler_4.setValue("#{ejemploMB.ejemplo.prueba}");
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
              }
            }
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
          }
          {
            com.icesoft.faces.component.CommandButtonTag __jsp_taghandler_5=(com.icesoft.faces.component.CommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.CommandButtonTag.class,"com.icesoft.faces.component.CommandButtonTag action value");
            __jsp_taghandler_5.setParent(__jsp_taghandler_1);
            __jsp_taghandler_5.setAction("#{ejemploMB.registrar}");
            __jsp_taghandler_5.setValue("Registrar");
            __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
            if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
          }
          {
            com.icesoft.faces.component.MessagesTag __jsp_taghandler_6=(com.icesoft.faces.component.MessagesTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.MessagesTag.class,"com.icesoft.faces.component.MessagesTag showDetail showSummary style");
            __jsp_taghandler_6.setParent(__jsp_taghandler_1);
            __jsp_taghandler_6.setShowDetail("true");
            __jsp_taghandler_6.setShowSummary("false");
            __jsp_taghandler_6.setStyle("color:red");
            __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
            if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
          }
          {
            com.icesoft.faces.component.DataTableTag __jsp_taghandler_7=(com.icesoft.faces.component.DataTableTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.DataTableTag.class,"com.icesoft.faces.component.DataTableTag value var");
            __jsp_taghandler_7.setParent(__jsp_taghandler_1);
            __jsp_taghandler_7.setValue("#{ejemploMB.ejemplos}");
            __jsp_taghandler_7.setVar("ejem");
            __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              {
                com.icesoft.faces.component.UIColumnTag __jsp_taghandler_8=(com.icesoft.faces.component.UIColumnTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.UIColumnTag.class,"com.icesoft.faces.component.UIColumnTag");
                __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  {
                    javax.faces.webapp.FacetTag __jsp_taghandler_9=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                    __jsp_taghandler_9.setName("header");
                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                        {
                          com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_10=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                          __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                          __jsp_taghandler_10.setValue("ID");
                          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,5);
                        }
                      } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,4);
                  }
                  {
                    com.sun.faces.taglib.html_basic.OutputTextTag __jsp_taghandler_11=(com.sun.faces.taglib.html_basic.OutputTextTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.OutputTextTag.class,"com.sun.faces.taglib.html_basic.OutputTextTag value");
                    __jsp_taghandler_11.setParent(__jsp_taghandler_8);
                    __jsp_taghandler_11.setValue("#{ejem.prueba}");
                    __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                    if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,4);
                  }
                }
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
              }
            }
            if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
          }
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write( "</ui:define>");
      out.write( "</ui:composition>");

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
  private static final char __oracle_jsp_text[][]=new char[1][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "RESULTADOS".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
