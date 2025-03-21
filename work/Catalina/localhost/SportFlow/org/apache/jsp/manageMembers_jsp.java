/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.36
 * Generated at: 2025-03-16 16:02:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.List;
import Member.Model.Member;

public final class manageMembers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1740605685701L));
    _jspx_dependants.put("jar:file:/C:/Users/HP/.m2/repository/org/glassfish/web/jakarta.servlet.jsp.jstl/3.0.1/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c.tld", Long.valueOf(1664449878000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(3);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Member.Model.Member");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>SportFlow - Manage Members</title>\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        @keyframes fadeIn {\r\n");
      out.write("            from { opacity: 0; }\r\n");
      out.write("            to { opacity: 1; }\r\n");
      out.write("        }\r\n");
      out.write("        @keyframes bounceIn {\r\n");
      out.write("            0% { transform: scale(0.8); opacity: 0; }\r\n");
      out.write("            60% { transform: scale(1.05); opacity: 1; }\r\n");
      out.write("            100% { transform: scale(1); }\r\n");
      out.write("        }\r\n");
      out.write("        @keyframes rotateBorder {\r\n");
      out.write("            0% { border-color: #FFD700; }\r\n");
      out.write("            50% { border-color: #e6c200; }\r\n");
      out.write("            100% { border-color: #FFD700; }\r\n");
      out.write("        }\r\n");
      out.write("        body {\r\n");
      out.write("            background: linear-gradient(135deg, rgba(0, 0, 0, 0.7), rgba(26, 26, 26, 0.7)),\r\n");
      out.write("            url('https://i.pinimg.com/736x/1e/da/48/1eda480b629bcf0bc36fa2c53404b089.jpg') no-repeat center center fixed;\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            color: #ffffff;\r\n");
      out.write("            font-family: 'Arial', sans-serif;\r\n");
      out.write("            min-height: 100vh;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            flex-direction: column;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar {\r\n");
      out.write("            background: #000000;\r\n");
      out.write("            border-bottom: 4px solid transparent;\r\n");
      out.write("            border-image: linear-gradient(to right, #FFD700, #e6c200) 1;\r\n");
      out.write("            box-shadow: 0 4px 15px rgba(255, 215, 0, 0.2);\r\n");
      out.write("        }\r\n");
      out.write("        .nav-link {\r\n");
      out.write("            transition: color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("        .nav-link:hover {\r\n");
      out.write("            color: #e6c200;\r\n");
      out.write("        }\r\n");
      out.write("        .table-container {\r\n");
      out.write("            background: rgba(0, 0, 0, 0.8);\r\n");
      out.write("            border: 2px solid #FFD700;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .btn {\r\n");
      out.write("            transition: transform 0.3s ease, box-shadow 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("        .btn:hover {\r\n");
      out.write("            transform: scale(1.05);\r\n");
      out.write("            box-shadow: 0 0 15px rgba(255, 215, 0, 0.5);\r\n");
      out.write("        }\r\n");
      out.write("        footer {\r\n");
      out.write("            background: rgba(0, 0, 0, 0.9);\r\n");
      out.write("            border-top: 1px solid #FFD700;\r\n");
      out.write("            animation: fadeIn 2s ease-in forwards;\r\n");
      out.write("        }\r\n");
      out.write("        .table-container table {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            overflow-x: auto;\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Navigation Bar -->\r\n");
      out.write("<nav class=\"navbar p-4 flex justify-between items-center fixed top-0 w-full z-10\">\r\n");
      out.write("    <div class=\"text-4xl font-extrabold text-[#FFD700] tracking-wide\">SportFlow Admin</div>\r\n");
      out.write("    <div class=\"space-x-8\">\r\n");
      out.write("        <a href=\"MemberServlet\" class=\"nav-link text-[#FFD700] text-xl font-semibold\">Manage Members</a>\r\n");
      out.write("        <a href=\"EntraineurServlet\" class=\"nav-link text-[#FFD700] text-xl font-semibold\">Manage Entraineurs</a>\r\n");
      out.write("        <a href=\"manageSeances.jsp\" class=\"nav-link text-[#FFD700] text-xl font-semibold\">Manage Séances</a>\r\n");
      out.write("        <a href=\"Logout\" class=\"nav-link text-[#FFD700] text-xl font-semibold hover:text-red-500\">Logout</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<!-- Main Body -->\r\n");
      out.write("<main class=\"flex-grow py-20 mt-16\">\r\n");
      out.write("    <div class=\"text-center mb-12\">\r\n");
      out.write("        <h1 class=\"text-5xl font-extrabold text-[#FFD700] mb-6 animate-fade-in\">Manage Members</h1>\r\n");
      out.write("        <p class=\"text-xl text-gray-300 animate-fade-in\" style=\"animation-delay: 0.5s;\">View and manage gym members below.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"table-container mx-auto max-w-6xl p-6\">\r\n");
      out.write("        <div class=\"flex justify-end mb-4\">\r\n");
      out.write("            <a href=\"addMember.jsp\" class=\"btn bg-[#FFD700] text-black font-semibold py-2 px-4 rounded-lg\">Add Member</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <table class=\"w-full text-left text-gray-300\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr class=\"border-b border-[#FFD700]\">\r\n");
      out.write("                <th class=\"py-3 px-4\">ID</th>\r\n");
      out.write("                <th class=\"py-3 px-4\">Username</th>\r\n");
      out.write("                <th class=\"py-3 px-4\">Email</th>\r\n");
      out.write("                <th class=\"py-3 px-4\">Date of Birth</th>\r\n");
      out.write("                <th class=\"py-3 px-4\">Sport</th>\r\n");
      out.write("                <th class=\"py-3 px-4\">Actions</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("\r\n");
      out.write("                ");

                    List<Member> members = (List<Member>) request.getAttribute("members");
                    for(Member member : members){



                    
      out.write("\r\n");
      out.write("                        <tr class=\"border-b border-gray-700\">\r\n");
      out.write("                            <td class=\"py-3 px-4\">");
      out.print(member.getId());
      out.write("</td>\r\n");
      out.write("                            <td class=\"py-3 px-4\">");
      out.print(member.getUserame());
      out.write("</td>\r\n");
      out.write("                            <td class=\"py-3 px-4\">");
      out.print(member.getEmail());
      out.write("</td>\r\n");
      out.write("                            <td class=\"py-3 px-4\">");
      out.print(member.getDateNaissance());
      out.write("</td>\r\n");
      out.write("                            <td class=\"py-3 px-4\">");
      out.print(member.getSport());
      out.write("</td>\r\n");
      out.write("                            <td class=\"py-3 px-4\">\r\n");
      out.write("                                <a href=\"editMember.jsp?id=");
      out.print(member.getId());
      out.write("\" class=\"text-[#FFD700] hover:text-[#e6c200]\">Edit</a> |\r\n");
      out.write("                                <a href=\"deleteMember.jsp?id=");
      out.print(member.getId());
      out.write("\" class=\"text-red-500 hover:text-red-400\">Delete</a>\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                   ");
  } 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer class=\"p-6 text-center text-gray-400\">\r\n");
      out.write("    <p>© 2025 SportFlow. Created by <span class=\"text-[#FFD700] font-semibold\">Lahcen Ait Maskour</span>. Images by <a href=\"https://unsplash.com\" class=\"text-[#FFD700] hover:text-[#e6c200]\">Unsplash</a>.</p>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
