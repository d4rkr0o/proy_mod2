package _web_2d_inf._templates;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _menu_jspx extends com.orionserver.http.OrionHttpJspPage {


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
    _menu_jspx page = this;
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
          {
            com.icesoft.faces.component.menubar.MenuBarTag __jsp_taghandler_2=(com.icesoft.faces.component.menubar.MenuBarTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.menubar.MenuBarTag.class,"com.icesoft.faces.component.menubar.MenuBarTag id orientation");
            __jsp_taghandler_2.setParent(__jsp_taghandler_1);
            __jsp_taghandler_2.setId("menuBar");
            __jsp_taghandler_2.setOrientation("Horizontal");
            __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
            {
              {
                com.icesoft.faces.component.menubar.MenuItemTag __jsp_taghandler_3=(com.icesoft.faces.component.menubar.MenuItemTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.menubar.MenuItemTag.class,"com.icesoft.faces.component.menubar.MenuItemTag id value");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setId("file");
                __jsp_taghandler_3.setValue("Inicio");
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  {
                    com.icesoft.faces.component.menubar.MenuItemTag __jsp_taghandler_4=(com.icesoft.faces.component.menubar.MenuItemTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.menubar.MenuItemTag.class,"com.icesoft.faces.component.menubar.MenuItemTag action id value");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_4.setAction("/index.jspx");
                    __jsp_taghandler_4.setId("ejemploTabla");
                    __jsp_taghandler_4.setValue("Ejemplo Tabla");
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,4);
                  }
                  {
                    com.icesoft.faces.component.menubar.MenuItemTag __jsp_taghandler_5=(com.icesoft.faces.component.menubar.MenuItemTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.menubar.MenuItemTag.class,"com.icesoft.faces.component.menubar.MenuItemTag action id value");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_3);
                    __jsp_taghandler_5.setAction("/registro.jspx");
                    __jsp_taghandler_5.setId("ejemploRegistro");
                    __jsp_taghandler_5.setValue("Ejemplo Registro");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,4);
                  }
                }
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
              }
            }
            if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
              return;
            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
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
