package _web_2d_inf._templates;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _template_jspx extends com.orionserver.http.OrionHttpJspPage {


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
    _template_jspx page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {

      out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");

      {
        com.sun.faces.taglib.jsf_core.ViewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.ViewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ViewTag.class,"com.sun.faces.taglib.jsf_core.ViewTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            {
              com.icesoft.faces.component.outputdeclaration.OutputDeclarationTag __jsp_taghandler_2=(com.icesoft.faces.component.outputdeclaration.OutputDeclarationTag)OracleJspRuntime.getTagHandler(pageContext,com.icesoft.faces.component.outputdeclaration.OutputDeclarationTag.class,"com.icesoft.faces.component.outputdeclaration.OutputDeclarationTag doctypePublic doctypeRoot doctypeSystem");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setDoctypePublic("-//W3C//DTD XHTML 1.0 Strict//EN");
              __jsp_taghandler_2.setDoctypeRoot("HTML");
              __jsp_taghandler_2.setDoctypeSystem("http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write( "<html>");
            out.write( "<head>");
            out.write( "<title>");
            out.write(__oracle_jsp_text[0]);
            out.write( "</title>");
            out.write( "<meta"+ " http-equiv=\"" + "Content-Type"+ "\"" + " content=\"" + "text/html; charset=utf-8"+ "\"" +"/>");
            out.write( "<meta"+ " http-equiv=\"" + "Content-Language"+ "\"" + " content=\"" + "en"+ "\"" +"/>");
            out.write( "<meta"+ " http-equiv=\"" + "imagetoolbar"+ "\"" + " content=\"" + "no"+ "\"" +"/>");
            out.write( "<meta"+ " name=\"" + "keywords"+ "\"" + " content=\"" + ""+ "\"" +"/>");
            out.write( "<meta"+ " name=\"" + "description"+ "\"" + " content=\"" + ""+ "\"" +"/>");
            out.write( "<link"+ " href=\"" + "./xmlhttp/css/xp/xp.css"+ "\"" + " rel=\"" + "stylesheet"+ "\"" + " type=\"" + "text/css"+ "\"" +"/>");
            out.write( "<link"+ " href=\"" + "#{facesContext.externalContext.requestContextPath}/resources/css/general.css"+ "\"" + " rel=\"" + "stylesheet"+ "\"" + " type=\"" + "text/css"+ "\"" +"/>");
            out.write( "</head>");
            out.write( "<body>");
            out.write( "<div" + " class=\"" + "page"+ "\"" +">");
            out.write( "<center>");
            out.write( "<div" + " class=\"" + "header"+ "\"" +">");
            out.write( "<ui:include"+ " src=\"" + "/WEB-INF/templates/header.jspx"+ "\"" +"/>");
            out.write( "</div>");
            out.write( "<br/>\r\n");
            out.write( "<div" + " class=\"" + "content"+ "\"" +">");
            out.write( "<ui:insert" + " name=\"" + "content"+ "\"" +">");
            out.write(__oracle_jsp_text[1]);
            out.write( "</ui:insert>");
            out.write( "</div>");
            out.write( "<div" + " class=\"" + "footer"+ "\"" +">");
            out.write( "<ui:include"+ " src=\"" + "/WEB-INF/templates/footer.jspx"+ "\"" +"/>");
            out.write( "</div>");
            out.write( "</center>");
            out.write( "</div>");
            out.write( "</body>");
            out.write( "</html>");
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }

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
  private static final char __oracle_jsp_text[][]=new char[2][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "Plantilla Principal".toCharArray();
    __oracle_jsp_text[1] = 
    "Default Content".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
