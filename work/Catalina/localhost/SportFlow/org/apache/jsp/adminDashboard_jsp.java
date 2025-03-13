/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.36
 * Generated at: 2025-03-13 14:39:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class adminDashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>SportFlow - Admin Dashboard</title>\r\n");
      out.write("    <!-- Tailwind CSS CDN -->\r\n");
      out.write("    <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Custom Animations */\r\n");
      out.write("        @keyframes bounceIn {\r\n");
      out.write("            0% { transform: scale(0.8); opacity: 0; }\r\n");
      out.write("            60% { transform: scale(1.05); opacity: 1; }\r\n");
      out.write("            100% { transform: scale(1); }\r\n");
      out.write("        }\r\n");
      out.write("        @keyframes fadeIn {\r\n");
      out.write("            from { opacity: 0; }\r\n");
      out.write("            to { opacity: 1; }\r\n");
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
      out.write("        .card {\r\n");
      out.write("            transition: transform 0.3s ease, box-shadow 0.3s ease;\r\n");
      out.write("            animation: bounceIn 1s ease-out forwards;\r\n");
      out.write("        }\r\n");
      out.write("        .card:hover {\r\n");
      out.write("            transform: scale(1.1) rotate(2deg);\r\n");
      out.write("            box-shadow: 0 0 30px rgba(255, 215, 0, 0.7);\r\n");
      out.write("            border-color: #e6c200;\r\n");
      out.write("            animation: rotateBorder 2s infinite;\r\n");
      out.write("        }\r\n");
      out.write("        .hero-text {\r\n");
      out.write("            animation: fadeIn 1.5s ease-in forwards;\r\n");
      out.write("        }\r\n");
      out.write("        footer {\r\n");
      out.write("            background: rgba(0, 0, 0, 0.9);\r\n");
      out.write("            border-top: 1px solid #FFD700;\r\n");
      out.write("            animation: fadeIn 2s ease-in forwards;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Navigation Bar -->\r\n");
      out.write("<nav class=\"navbar p-4 flex justify-between items-center fixed top-0 w-full z-10\">\r\n");
      out.write("    <div class=\"text-4xl font-extrabold text-[#FFD700] tracking-wide\">SportFlow Admin</div>\r\n");
      out.write("    <div class=\"space-x-8\">\r\n");
      out.write("        <a href=\"manageMembers.jsp\" class=\"nav-link text-[#FFD700] text-xl font-semibold\">Manage Members</a>\r\n");
      out.write("        <a href=\"manageEntraineurs.jsp\" class=\"nav-link text-[#FFD700] text-xl font-semibold\">Manage Entraineurs</a>\r\n");
      out.write("        <a href=\"manageSeances.jsp\" class=\"nav-link text-[#FFD700] text-xl font-semibold\">Manage Séances</a>\r\n");
      out.write("        <a href=\"Logout\" class=\"nav-link text-[#FFD700] text-xl font-semibold hover:text-red-500\">Logout</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<!-- Main Body -->\r\n");
      out.write("<main class=\"flex-grow py-20 mt-16\">\r\n");
      out.write("    <!-- Hero Section -->\r\n");
      out.write("    <div class=\"text-center mb-16\">\r\n");
      out.write("        <h1 class=\"text-6xl font-extrabold text-[#FFD700] mb-8 hero-text\">Welcome, Admin!</h1>\r\n");
      out.write("        <p class=\"text-xl text-gray-300 mb-12 hero-text\" style=\"animation-delay: 0.5s;\">\r\n");
      out.write("            Control and optimize your SportFlow system with ease.\r\n");
      out.write("        </p>\r\n");
      out.write("        <div class=\"flex justify-center space-x-12\">\r\n");
      out.write("            <!-- Manage Members Card -->\r\n");
      out.write("            <a href=\"manageMembers.jsp\" class=\"card bg-[#1a1a1a] border-2 border-[#FFD700] rounded-xl p-6 w-72\" style=\"animation-delay: 0.8s;\">\r\n");
      out.write("                <img src=\"https://images.unsplash.com/photo-1517836357463-d25dfeac3438?q=80&w=2070&auto=format&fit=crop\"\r\n");
      out.write("                     alt=\"Members\" class=\"w-full h-48 object-cover rounded-lg mb-4\">\r\n");
      out.write("                <h3 class=\"text-3xl font-bold text-[#FFD700]\">Manage Members</h3>\r\n");
      out.write("                <p class=\"text-gray-400 mt-2\">Add, edit, or remove gym members.</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <!-- Manage Entraineurs Card -->\r\n");
      out.write("            <a href=\"manageEntraineurs.jsp\" class=\"card bg-[#1a1a1a] border-2 border-[#FFD700] rounded-xl p-6 w-72\" style=\"animation-delay: 1s;\">\r\n");
      out.write("                <img src=\"https://images.unsplash.com/photo-1593079831268-3381b0db4a77?q=80&w=2069&auto=format&fit=crop\"\r\n");
      out.write("                     alt=\"Entraineurs\" class=\"w-full h-48 object-cover rounded-lg mb-4\">\r\n");
      out.write("                <h3 class=\"text-3xl font-bold text-[#FFD700]\">Manage Entraineurs</h3>\r\n");
      out.write("                <p class=\"text-gray-400 mt-2\">Oversee trainers and their schedules.</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <!-- Manage Séances Card -->\r\n");
      out.write("            <a href=\"manageSeances.jsp\" class=\"card bg-[#1a1a1a] border-2 border-[#FFD700] rounded-xl p-6 w-72\" style=\"animation-delay: 1.2s;\">\r\n");
      out.write("                <img src=\"https://images.unsplash.com/photo-1607962837359-5e7e89f86776?q=80&w=2070&auto=format&fit=crop\"\r\n");
      out.write("                     alt=\"Séances\" class=\"w-full h-48 object-cover rounded-lg mb-4\">\r\n");
      out.write("                <h3 class=\"text-3xl font-bold text-[#FFD700]\">Manage Séances</h3>\r\n");
      out.write("                <p class=\"text-gray-400 mt-2\">Schedule and manage gym sessions.</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer class=\"p-6 text-center text-gray-400\">\r\n");
      out.write("    <p>© 2025 SportFlow. Created by <span class=\"text-[#FFD700] font-semibold\">Lahcen Ait Maskour</span>. Images by <a href=\"https://unsplash.com\" class=\"text-[#FFD700] hover:text-[#e6c200]\">Unsplash</a>.</p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<!-- Security Check -->\r\n");

    HttpSession sessionCheck = request.getSession(false);
    if (sessionCheck == null || sessionCheck.getAttribute("user") == null || !"admin".equals(sessionCheck.getAttribute("user"))) {
        response.sendRedirect("login.jsp");
    }

      out.write("\r\n");
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
